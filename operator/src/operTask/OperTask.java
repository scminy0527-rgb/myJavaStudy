package operTask;

import java.util.Scanner;

public class OperTask {
   public static void main(String[] args) {
      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
      // 총점과 평균을 구한다.
      // 평균이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
      // 단 if문을 사용하지 않는다.
      // 평균은 소수점 2번째 자리까지만 표기한다.
	   
//	   변수 선언 및 초기화
	   int math = 0, english = 0, korean = 0, limit = 60;
	   double totalScore = 0.0, average = 0.0;
	   String message = "수학, 영어, 국어 점수를 입력해주세요 ex) 60 70 80",
			   result = null,
			   finalMsg = null;
	   
//	   사용자한테 값 입력받는 단계
	   Scanner sc = new Scanner(System.in);
	   System.out.println(message);
	   math = sc.nextInt();
	   english = sc.nextInt();
	   korean = sc.nextInt();
	   
//	   총점 및 평균 구하기
	   totalScore = math + english + korean;
	   average = totalScore / 3;
	   
//	   평균 점수에 따른 결과 판단
	   result = average > limit ? "합격" 
			   : average < limit ? "불합격" : "재평가";
	   finalMsg = "수학: %d점, 영어: %d점, 국어: %d점\n평균: %.2f\n시험결과: %s\n";
	   System.out.printf(finalMsg, math, english, korean, average, result);
   }
}
