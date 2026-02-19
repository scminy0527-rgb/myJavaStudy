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
	
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
	// 엔진 시동 켜는 매서드
	void startEngine() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
			if(pw.equals(this.password)) {
				this.engine = true;
				System.out.println("시동을 겁니다. 부릉 부릉");
				break;
			} else {
				// 비밀번호 틀림
				this.pwErrorCount++;
				String msg = "비밀번호 입력 오류: %d회\n 3회 에러 시 경찰 출동\n";
				System.out.printf(msg, pwErrorCount);
				
				if(this.pwErrorCount >= 3) {
					System.out.println("경찰 출동 삐뽀삐뽀");
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
		car1.startEngine();
	}
}
