package classTask;

import java.util.Scanner;

// 슈퍼카
// 브랜드,색상, 가격, 엔진, 비밀번호, 비밀번호 오류 횟수
// 엔진을 킴, 엔진을 끔
// 엔진: boolean
class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String password;
	int pwErrorCount;
	
	// 기본 및 초기화 생성자
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
	// 차량 정보 열람
	void showCarInfo() {
		System.out.println("브랜드: " + this.brand);
		System.out.println("컬러: " + this.color);
		System.out.printf("가격: %d원\n", this.price);
	}
	
	// 엔진 시동 버튼 누르는 매서드
	void PushEngineButton() {
		System.out.println(this.brand+"의 시동 버튼을 누릅니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String state = this.engine ? "시동 켜진 상태" : "시동 꺼진 상태";
			System.out.println("현재 시동 상태: " + state);
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
			if(pw.equals(this.password)) {
				String key = this.engine ? "끕니다. 부르르~" : "겁니다. 부릉부릉";
				this.engine = !engine;
				this.pwErrorCount = 0; // 정답 맞으면 오류횟수 초기화
				System.out.printf("시동을 %s\n", key);
				break;
			} else {
				// 비밀번호 틀림
				this.pwErrorCount++;
				String msg = "비밀번호 입력 오류: %d회\n 3회 에러 시 경찰 출동\n";
				System.out.printf(msg, pwErrorCount);
				
				if(this.pwErrorCount >= 3) {
					System.out.println("3회 오류, 경찰 출동 삐뽀삐뽀");
					break;
				}
			}
		}
	}
}

public class ClassTask2 {
	// 객체화
	// 엔진을 키고 끄게 하는걸
	// 비밀번호 맞을 때만 하기
	// 비밀번호 3회 오류 시 경찰 출동 할 겁니다.
	public static void main(String[] args) {
		SuperCar car1 = new SuperCar("람보르기니", "레드", 100000000, "0527");
		SuperCar car2 = new SuperCar("포르쉐", "옐로우", 70000000, "1234");
		car1.showCarInfo();
		car1.PushEngineButton();
		car1.PushEngineButton();
		
		car2.showCarInfo();
	}
}
