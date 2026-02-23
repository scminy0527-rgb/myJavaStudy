package castingPractice;

class Car {
	void drive () {
		System.out.println("차 를 운전 합니다.");
	}
}

class SuperCar extends Car {
	void drive() {
		System.out.println("멋진 슈퍼카를 운전합니다.");
	}
	
	void sportMode () {
		System.out.println("빠르고 멋진 스포츠 모드를 합니다.");
	}
}

class Bus extends Car {
	void drive () {
		System.out.println("많은 승객을 태우고 운행합니다.");
	}
}

public class CastingPractice2 {
	public static void main(String[] args) {
		// 차량들을 정의
		Car car = new Car();
		SuperCar superCar = new SuperCar();
		Bus bus = new Bus();
		
		// 차량 이라는 공통 속성으로 묶는 개념
		Car[] carArr = new Car[] {car, superCar, bus};
		
		// 각 차량을 드라이브 하기
		for(int i = 0; i < carArr.length; i++) {
			carArr[i].drive();
		}
		
		// 다운 캐스팅 (자식 안경)
		// 업 캐스팅 된 거만 다시 다운캐스팅 가능
		SuperCar s = (SuperCar) carArr[1];
		s.sportMode();
		
		double mok = Math.sqrt(25);
		System.out.println((int)mok - mok);
	}
}
