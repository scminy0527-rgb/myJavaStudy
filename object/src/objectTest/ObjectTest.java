package objectTest;

public class ObjectTest {
//	1. private
//	접근하지 마라 / 화면에서 쓸 거다
	private String name;
	
//	2. 기본 생성자: 안만들면 컴파일러가 만들어줌
	public ObjectTest() {;}

//	3. 초기화 생성자
	public ObjectTest(String name) {
		super();
		this.name = name;
	}
	
//	게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	6. toString(): 해당 객체의 필드를 확인하기 위한 용도
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		
		User user1 = new User(1L, "홍길동");
		
//		도서관 책을 대여
//		Object 의 equals 를 비교 함
//		이건 무조건 주소를 비교함
		if(user1.equals(new User(1L, "홍길동")) ) {
			System.out.println("책 대여 완료");
		} else {
			System.out.println("도난");
		}
	}

//	모든 필드는 해당 매서드를 호출 하면 볼 수 있음
	@Override
	public String toString() {
		return "ObjectTest [name=" + name + "]";
	}
	
}
