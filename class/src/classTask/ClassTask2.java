package classTask;

import java.util.Scanner;

// 슈퍼카
// 브랜드,색상, 가격, 엔진, 비밀번호, 비밀번호 오류 횟수
// 엔진을 킴, 엔진을 끔
// 엔진: boolean
class SuperCar {
	String brand;
	String color;
	long price;
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
	
	// 오버 로딩 (비밀번호를 설정 안하고 기본 공장출고 비밀번호로 설정된 개념)
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// 초기화 블럭
	{
		this.password = "0000";
	}
	
	static {
		System.out.println("출고 축하드립니다.");
	}
	
	// 차량 정보 열람
	void showCarInfo() {
		System.out.println("브랜드: " + this.brand);
		System.out.println("컬러: " + this.color);
		System.out.printf("가격: %d원\n", this.price);
	}
	
	// 엔진 시동 버튼 누르는 매서드
	// 중요: 하나의 매서드는 하나만 작동 해야 함
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
	
	// 매서드는 재사용 목적 (단순 하면서 하나의 기능만)
	void engineStart() {
		this.engine = true;
	}
	
	void engineStop() {
		this.engine = false;
	}
	
	void engineButton() {
		this.engine = !this.engine;
	}
	
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	// 비번 바꿀 수 있는 매서드도 있어야 함
}

public class ClassTask2 {
	// 객체화
	// 엔진을 키고 끄게 하는걸
	// 비밀번호 맞을 때만 하기
	// 비밀번호 3회 오류 시 경찰 출동 할 겁니다.
	public static void main(String[] args) {
		String password = null;
		SuperCar car1 = new SuperCar("람보르기니", "레드", 100000000, "0527");
		SuperCar car2 = new SuperCar("포르쉐", "옐로우", 70000000, "1234");
		
		// 비밀번호 입력 받기
		Scanner sc = new Scanner(System.in);
		
		
		car1.showCarInfo();
//		car1.PushEngineButton();
//		car1.PushEngineButton();
		
		while(true) {
			System.out.println("비밀번호를 입력하세요: ex) 1234");
			password = sc.nextLine();
			
			if(car1.checkPassword(password)) {
				System.out.println("비밀번호 일치");
				String msg = car1.engine ? "엔진을 끕니다." : "엔진을 킵니다.";
				System.out.println(msg);
				car1.engineButton();
				car1.pwErrorCount = 0;
				break;
			} else {
				System.out.println("불일치");
				car1.pwErrorCount++;
				
				if(car1.pwErrorCount >= 3) {
					System.out.println("경찰 출동");
					car1.pwErrorCount = 0;
					break;
				}
			}
		}
//		car2.showCarInfo();
	}
}
