package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
	public static void main(String[] args) {
//		받는거
		int total = 0, userInputNum = 0;
		String numberList = "",
				message = "정수를 입력해주세요 ex) 10";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(message);
			userInputNum = sc.nextInt();
			
//			누적합 하기
			total += userInputNum;
			numberList += userInputNum;
			
//			만약 누적합이 100 이상이면 탈출
			if(total >= 100) {
				break;
			}
			numberList += ", ";
		}
		
//		결과 출력
		System.out.println("프로그램 종료");
		System.out.println("누적합: "+total);
		System.out.println(numberList);
	}
}