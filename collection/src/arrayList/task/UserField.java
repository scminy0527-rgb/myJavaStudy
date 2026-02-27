package arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public final int KEY = 300;
	public static String session;
//	1. 회원가입
//	- id : x,
//	- name, password, phone
	
//	id 중복 체크
	public User checkId(String id) {
		for(User user: users) {
			if(user.getId().equals(id)) {
//				System.out.println("이미 사용중입니다.");
				return user;
			}
 		}
		return null;
	}
	
//	비밀번호 암호화
	public String encode(String password) {
		String encodedPassword = "";
		for(int i = 0; i < password.length(); i++) {
			encodedPassword += (char)(password.charAt(i) * KEY);
		}
		return encodedPassword;
	}
	
//	아이디 중복 여부 확인 및 중복 아이디가 아니라면 비밀번호 암호화 후 데이터베이스에 추가
	public void join(User user) {
		User userInDB = this.checkId(user.getId());
		if(userInDB == null) {
			user.setPassword(encode(user.getPassword()));
			users.add(user);
		}
	}
	
	public void validate(String password) {
		
	}
	
//	2. 로그인
//	- id, password
//	- Db 에 id 가 있는지
//	- 찾으면 password 검사
//	- 찾은 user 를 리턴
	public User login(User user) {
		User dbUser = checkId(user.getId());
		if(dbUser != null) {
			String encodedPw = encode(user.getPassword());
			if(encodedPw.equals(dbUser.getPassword())) {
				System.out.println("로그인 성공, 환영합니다.");
//				db 에 있는 해당 유저를 진짜로 반환 해야 함
				session = dbUser.getId();
				return dbUser;
			} else {
				System.out.println("비밀번호 오류 입니다.");
				return null;
			}
		}
		System.out.println("아이디가 존재하지 않습니다.");
		return null;
	}
	
	
//	public User login(User user) {
//		for(User dbUser: users) {
////			db 에서 일단 id 가 존재하는 유저를 찾았을 때
//			if(user.equals(dbUser)) {
////				일단 아이디가 존재
////				- 비밀번호 검증
//				String encodedPw = encode(user.getPassword());
//				if(encodedPw.equals(dbUser.getPassword())) {
//					System.out.println("로그인 성공, 환영합니다.");
////					db 에 있는 해당 유저를 진짜로 반환 해야 함
//					session = dbUser.getId();
//					return dbUser;
//				} else {
//					System.out.println("비밀번호 오류 입니다.");
//					return null;
//				}
//			}
//		}
////		여기까지 돌았음에도 없는거
//		System.out.println("아이디가 존재하지 않습니다.");
//		return null;
//	}
	
	
	public void logout() {
//		현재 세션에 id 가 저장이 된 경우에만 로그아웃을 해야 함
//		즉 로그인 된 상태 에서만 로그아웃이 가능
		if(session != null) {
//			로그아웃 진행
			System.out.println("로그아웃 진행합니다.");
			session = null;
		} else {
//			로그인 도 안했는데 로그아웃을 하겠다는 거
			System.out.println("이미 로그아웃이 되었습니다.");
		}
	}
	
//	회원 탈퇴
//	1. session 에 정보가 있는지 확인
//	2. 있다면 db 에서 유저 정보 삭제
//	3. session 에서 최종적으로 정보 지우기
	public void deleteUser() {
		if(session != null) {
			User user = checkId(session);
			if(users.contains(user)) {
				users.remove(user);
				session = null;
				System.out.println("그동안 감사했습니다.");
			} else {
				System.out.println("유효하지 않은 회원 입니다.");
			}
		} else {
			System.out.println("세션 정보 오류");
		}
	}
	
//	비밀번호 변경
	
//	인증번호 전송
	
//	인증번호 확인
	
	public static void main(String[] args) {
//		3. 로그아웃
		
		
//		4. 회원 탈퇴
//		5. 비밀번호 변경(비밀번호 변경 30일)
//		5. 비밀번호 변경(비밀번호 변경 30일)
//		7. 인증번호 전송
//		8. 인증번호 확인
		UserField uf = new UserField();
		User user1 = new User("hong123", "홍길동", "1234", "010-1234-1234");
		User user2 = new User("hong123", "김길홍", "1234", "010-4567-4567");
		
		
		uf.join(user1);
		uf.join(user2);
		System.out.println(uf.users);
		
		System.out.println("로그인 수행");
//		로그인을 위해 일부가 담긴 User
		User tempForLogin = new User("hong123", null, "4554", null);
		User tempForLogin2 = new User("hong123", null, "1234", null);
		User tempForLogin3 = new User("cjfals1015", null, "1234", null);
		System.out.println(uf.login(tempForLogin));
		System.out.println(uf.login(tempForLogin2));
		System.out.println(uf.login(tempForLogin3));
		
		uf.logout();
		uf.logout();
		System.out.println(uf.login(tempForLogin2));
		System.out.println(uf.users);
		uf.deleteUser();
		System.out.println(uf.users);
		
	}
}
