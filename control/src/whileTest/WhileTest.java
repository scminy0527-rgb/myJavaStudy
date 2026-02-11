package whileTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		// 다마고치 키우기
		// HP (0/5)
		// 이름: 
		
//		1. 밥을 안주면 죽는다
//		2. 밥을 주면 HP 가 5가 된다
//		3. 행동 1번 당 hp 1씩 줄어듬
//		4. 만족도 10 채우면 게임 종료
		
//		캐릭터
//      1. 이규학 ^(*￣(oo)￣)^
//      2. 감대훈 (⓿_⓿)
//      3. 예스규호 ( ͡~ ͜ʖ ͡°)
//      4. 썬윤성 ヾ(⌐■_■)ノ♪
//      5. 유줌 (∪.∪ )...zzZ
		
//		행동
//		1) 놀아주기
//		2) 훈육하기
//		3) 생각하는 의자에 앉히기
//		4) 회초리 들기
//		5) 잠자기
//		6) 씻겨주기
//		7) 노래불러주기
//		8) 운동시키기
		
		String message = "어서오세요~ 다마고치 키우기",
				nameMessage = "타마의 이름을 지어주세요",
				exampleMessage = "캐릭터를 선택하세요. \n"
				+ "1. 이규학 ^(*￣(oo)￣)^\n"
				+ "2. 감대훈 (⓿_⓿)\n"
				+ "3. 예스규호 ( ͡~ ͜ʖ ͡°)\n"
				+ "4. 썬윤성 ヾ(⌐■_■)ノ♪\n"
				+ "5. 유줌 (∪.∪ )...zzZ\n",
				kh = "^(*￣(oo)￣)^",
				dh = "(⓿_⓿)",
				gh = "( ͡~ ͜ʖ ͡°)",
				sys = "ヾ(⌐■_■)ノ♪",
				yj = "(∪.∪ )...zzZ",
				tama = null, tamaName = null;
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0, hp = 5, maxHp = 5, happy = 1, action = 0;
		boolean flag = false;
		
//		사용자 캐릭터 선택
		while (true) {
			System.out.println(message);
			System.out.println(exampleMessage);
			
			choice = sc.nextInt();
			
			if(choice < 1 || choice > 5) {
				System.out.println("잘못 입력했습니다.");
			} else {
				break;
			}
			
		}
		
//		선택한 타마 를 대입
		switch(choice) {
		case 1:
			tama = kh;
			break;
		case 2:
			tama = dh;
			break;
		case 3:
			tama = gh;
			break;
		case 4:
			tama = sys;
			break;
		case 5:
			tama = yj;
			break;
		default:
			break;
		}
		
		System.out.println(nameMessage);
		tamaName = sc.next();
		
		System.out.println(tamaName + " " + tama);
		
		while (true) {
			System.out.printf("%s %s \n hp: (%d/%d) 만족도 %d점\n", tamaName, tama, hp, maxHp, happy);
			System.out.println("행동을 입력하세요\n" 
					+ "1) 놀아주기\n"
					+ "2) 훈육하기\n"
					+ "3) 생각하는 의자에 앉히기\n"
					+ "4) 회초리 들기\n"
					+ "5) 잠자기\n"
					+ "6) 씻겨주기\n"
					+ "7) 노래불러주기\n"
					+ "8) 운동시키기\n");
			
			action = sc.nextInt();
			switch(action) {
			case 1:
				System.out.println("===================");
				System.out.println(tama + "가 즐거워합니다.");
				System.out.println("================");
				happy += 1;
				hp -= 1;
				break;
			case 2:
				System.out.println("===================");
				System.out.println(tama + "가 말로 얻어 맞습니다.");
				System.out.println("================");
				hp -= 1;
				happy -= 1;
				break;
			case 3:
				System.out.println("===================");
				System.out.println(tama + "벽을 보고 앉습니다.");
				System.out.println("================");
				happy--;
				break;
			case 4:
				System.out.println("===================");
				System.out.println(tama + "가 노래를 부릅니다.");
				System.out.println("뀨 슈슈슈 슈슈 슈퍼 노래");
				System.out.println("================");
				happy--;
				break;
			case 5:
				System.out.println("===================");
				System.out.println(tama + "가 꿈나라로 갑니다.");
				System.out.println("================");
				happy++;
				break;
			case 6:
				System.out.println("===================");
				System.out.println(tama + "가 열심히 헬스장에 갑니다.");
				System.out.println("================");
				happy++;
				hp += 2;
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
			
			
//			게임 종료 플래그 설정
			if(hp <= 0) {
				flag = true;
			}
			if(flag) {
				System.out.println(tama + "는 갔습니다. 좋은 타마였습니다");
				break;
			}
			
			if(happy >= 10) {
				System.out.println(tama + " " + tamaName + "은(는) 성불하였습니다.");
				break;
			}
			
			
		}
		
//		행동
//		1) 놀아주기
//		2) 훈육하기
//		3) 생각하는 의자에 앉히기
//		4) 회초리 들기
//		5) 잠자기
//		6) 씻겨주기
//		7) 노래불러주기
//		8) 운동시키기
		
		
		
		

	}
}
