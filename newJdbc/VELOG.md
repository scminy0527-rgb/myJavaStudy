# JDBC 실습 - Java로 DB 연동하기 (회원 관리 시스템)

## 개요

오늘은 Java에서 JDBC(Java Database Connectivity)를 사용해 Oracle DB와 연동하는 실습을 진행했다.
단순한 쿼리 실행부터 실제 회원 관리 기능까지 구현해보았다.

---

## JDBC란?

JDBC는 Java 애플리케이션에서 DB에 접근하고 SQL을 실행할 수 있도록 해주는 Java 표준 API다.

```
Java 코드  →  JDBC API  →  DB Driver  →  Oracle DB
```

---

## 핵심 클래스 및 인터페이스

| 클래스/인터페이스 | 역할 |
|---|---|
| `Connection` | DB와의 연결 통로 |
| `PreparedStatement` | SQL 쿼리를 준비하고 실행 |
| `ResultSet` | 쿼리 실행 결과를 담는 객체 |

---

## executeUpdate vs executeQuery

JDBC에서 쿼리를 실행할 때는 목적에 따라 메서드를 구분해서 사용해야 한다.

### executeUpdate — 기능 수행 쿼리

INSERT, UPDATE, DELETE처럼 데이터를 **변경**하는 쿼리에 사용한다.
반환값은 **영향을 받은 행의 수 (int)** 다.

```java
int result = preparedStatement.executeUpdate();
if (result > 0) {
    System.out.println("성공");
} else {
    System.out.println("실패");
}
```

> 반환값을 확인하지 않으면 실패해도 성공한 것처럼 동작할 수 있으니 주의!

### executeQuery — 결과 반환 쿼리

SELECT처럼 데이터를 **조회**하는 쿼리에 사용한다.
반환값은 **ResultSet** 타입이다.

```java
ResultSet resultSet = preparedStatement.executeQuery();
```

---

## ResultSet 다루기

### ResultSet이란?

`executeQuery()`의 결과로 반환되는 객체로, DB에서 가져온 **행(row)들의 집합**이다.
내부적으로 커서(cursor)가 존재하며, 처음에는 첫 번째 행 **이전**을 가리킨다.

### while문으로 전체 결과 순회

결과가 여러 행일 때는 `while(resultSet.next())`를 사용한다.
`next()`는 다음 행으로 커서를 이동시키며, 행이 존재하면 `true`, 없으면 `false`를 반환한다.

```java
resultSet = preparedStatement.executeQuery();
while (resultSet.next()) {
    MemberVO memberVO = new MemberVO();
    memberVO.setId(resultSet.getLong("ID"));
    memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
    memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
    memberVO.setMemberRecommenderEmail(resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));

    members.add(memberVO);
}
```

### 인덱스보다 컬럼명(키)으로 접근하자

ResultSet에서 값을 가져올 때 두 가지 방법이 있다.

```java
// 방법 1 - 인덱스 (비추천)
resultSet.getString(1);

// 방법 2 - 컬럼명 (추천)
resultSet.getString("MEMBER_EMAIL");
```

인덱스 방식은 SELECT 절의 컬럼 순서가 바뀌면 잘못된 값이 들어오는 버그가 생길 수 있다.
**컬럼명으로 접근하는 것이 더 명확하고 실수를 줄일 수 있다.**

---

## 회원 관리 기능 구현

### 계층 구조 (레이어)

```
View (화면단)
  ↓  입력값 검증, 비즈니스 흐름 제어
DAO (Data Access Object)
  ↓  SQL 실행, DB와 데이터 교환만 담당
DB (Oracle)
```

> 각 레이어는 자신의 역할만 담당해야 한다. (단일 책임 원칙)

### 회원가입 (INSERT)

```java
String query = "INSERT INTO TBL_MEMBER(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS) "
             + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";

preparedStatement = connection.prepareStatement(query);
preparedStatement.setString(1, memberVO.getMemberEmail());
preparedStatement.setString(2, memberVO.getMemberPassword());
preparedStatement.setString(3, memberVO.getMemberAddress());
preparedStatement.executeUpdate();
```

### 로그인 (SELECT + 세션 저장)

로그인 성공 시 해당 유저의 ID를 `session`에 저장해 이후 요청에 활용한다.

```java
String query = "SELECT ID FROM TBL_MEMBER "
             + "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";

resultSet = preparedStatement.executeQuery();
resultSet.next();
session = resultSet.getLong(1);  // 세션에 ID 저장
```

### 비밀번호 변경 (UPDATE)

- 비밀번호 형식 검증 → View에서 처리
- 기존 비밀번호 확인 (2단계 인증) → View에서 처리
- DB 업데이트 → DAO에서 처리

```java
String query = "UPDATE TBL_MEMBER "
             + "SET MEMBER_PASSWORD = ? "
             + "WHERE ID = ? "
             + "AND MEMBER_PASSWORD != ?";  // 동일한 비밀번호로 변경 방지

int result = preparedStatement.executeUpdate();
if (result > 0) {
    System.out.println("비밀번호 변경 성공");
} else {
    System.out.println("실패: 새 비밀번호가 기존과 동일합니다");
}
```

### 회원탈퇴 (DELETE)

탈퇴 후에는 세션을 `null`로 초기화한다.

```java
String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";

int result = preparedStatement.executeUpdate();
if (result > 0) {
    session = null;
    System.out.println("그동안 감사했습니다.");
}
```

### 추천인 조회 (SELECT + ArrayList)

나를 추천인으로 설정한 사용자 전체를 조회하는 기능이다.

```java
String query = "SELECT ID, MEMBER_EMAIL, MEMBER_ADDRESS, MEMBER_RECOMMENDER_EMAIL "
             + "FROM TBL_MEMBER "
             + "WHERE MEMBER_RECOMMENDER_EMAIL = ?";

ArrayList<MemberVO> memberList = new ArrayList<>();

while (resultSet.next()) {
    MemberVO member = new MemberVO(
        resultSet.getLong("ID"),
        resultSet.getString("MEMBER_EMAIL"),
        resultSet.getString("MEMBER_ADDRESS"),
        resultSet.getString("MEMBER_RECOMMENDER_EMAIL")
    );
    memberList.add(member);
}
```

---

## 주의사항 및 팁

### 1. 반드시 자원을 닫아야 한다

`Connection`, `PreparedStatement`, `ResultSet`은 사용 후 반드시 `close()`해야 한다.
`finally` 블록 또는 `try-with-resources`를 활용하자.

```java
finally {
    if (preparedStatement != null) preparedStatement.close();
    if (connection != null) connection.close();
}
```

### 2. 인스턴스 변수 공유 문제

DAO에서 `connection`, `preparedStatement`를 인스턴스 변수로 사용할 경우,
한 메서드 안에서 다른 DAO 메서드를 호출하면 **변수가 덮어써지는 버그**가 발생할 수 있다.

```java
// 잘못된 순서
connection = DBConnecter.getConnect();
preparedStatement = connection.prepareStatement(query);
preparedStatement.setString(1, findById().getMemberEmail());  // ← findById()가 connection, preparedStatement를 덮어씀!

// 올바른 순서
String myEmail = findById().getMemberEmail();  // ← 먼저 호출
connection = DBConnecter.getConnect();         // ← 그 다음 연결
preparedStatement = connection.prepareStatement(query);
preparedStatement.setString(1, myEmail);
```

### 3. 비밀번호는 화면단으로 절대 노출하지 말자

마이페이지 조회 시 비밀번호를 SELECT 하더라도 View로 전달해서는 안 된다.

---

## 마무리

오늘 JDBC 실습을 통해 Java 코드와 SQL을 함께 사용하는 방법을 익혔다.
핵심은 `executeUpdate` / `executeQuery` 의 구분, `ResultSet` 순회 방법, 그리고 각 레이어의 역할 분리였다.
