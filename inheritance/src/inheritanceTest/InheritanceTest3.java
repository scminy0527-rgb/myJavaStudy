package inheritanceTest;

class Car {
//	브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	// 생성자
	// 이건 자식 에서 super 에 해당하는 부분
	public Car() {;}
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	엔진을 켜기 출력
	void engineStart() {
		System.out.println("열쇠로 시동 켜기");
	}
	
//	엔진을 끄기 출력
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}

class SuperCar extends Car {
	String mode;
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String mode) {
//		상속 할 때는 부모의 생성자를 이용해서 초기화 해야함 (super)
		super(brand, color, price); // 부모 생성자
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("버튼으로 시동 켬");
	}
	
	@Override
	void engineStop() {
		System.out.println("버튼으로 시동 끔");
	}
}

public class InheritanceTest3 {
	public static void main(String[] args) {
		SuperCar ferari = new SuperCar("페라리", "Red", 70000, "sport");
		Car matiz = new Car("Matiz", "red", 700);
		System.out.println(ferari.brand);
		System.out.println(matiz.brand);
		
		ferari.engineStart();
		matiz.engineStart();
		
//		상속
//		부모의 필드, 매서드
//		+ 부모의 타입
		
//		자식은 부모의 타입이다.
//		모든 자식은 부모 타입 입니다.
		
//		상속에서 타입을 비교하는 객체 instance of 타입 
//		matiz 가 Car 타입이 맞는지?
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferari instanceof Car);
		System.out.println(ferari instanceof SuperCar);
	}
}
