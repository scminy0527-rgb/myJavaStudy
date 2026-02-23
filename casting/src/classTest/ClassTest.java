package classTest;

// 부모
class Car {
	public Car() {;}
	
//	부모 메서드
	void engineStart () {
		System.out.println("열쇠로 시동을 킴");
	}
}

// 자식
class SuperCar extends Car {
	public SuperCar() {;}
	
//	부모의 코드 영역
//	단지 덮어 쓰기를 한거 (그래도 이번 부모 영역)
//	태생은 안바뀜 (안바뀐 태생은 그대로 나옴)
	@Override
	void engineStart () {
		System.out.println("음성으로 시동을 킴");
	}
	
//	자식 코드
	void openroof () {
		System.out.println("뚜껑 오픈");
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		객체화
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		업캐스팅 되게 되면 매서드 중에서 오버라이딩 된 매서드가 나옴
//		매서드는 저장공간 개념
		Car noOptionFerrari = new SuperCar();
		
//		업 캐스팅 객체와 부모의 객체는 다르다.
//		- 오버라이딩 된 매서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart();
		
//		error
//		SuperCar fullOptionFerrari = new Car();
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.openroof();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		
		
//		instanceof
	}

}
