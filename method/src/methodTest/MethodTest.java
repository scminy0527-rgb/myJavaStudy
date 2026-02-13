package methodTest;

public class MethodTest {
//	자바는 메모리에 할당하지 않은 메서드는 사용할 수 없음
//	무조건 해당 메서드가 소속 된 클래스를 알려 줘야 함 (객체화)
	public static void main(String[] args) {
		 MethodTest mt = new MethodTest();
		 System.out.println(mt.add(10, 20));
		 
//		 또는
		 new MethodTest().printName("홍길동");
		
	}
	
//	컴파일 에러 및 안전하게 하기 위해서 먼저 리턴타입을 void 로 적기
//	그 다음 타입 확정되면 반환 자료형 적기
	
//	이름 받으면 이름 출력하는 매서드
	void printName(String name) {
		System.out.println(name);
	};
	
//	두 수를 더해서 결과를 반환하는 매서드
	double add(double num1, int num2) {
		return num1 + num2;
	}
}
