package switchTask;

import java.util.Scanner;

public class SwitchTask {
   public static void main(String[] args) {
//      계절 맞추기
//      12 1 2 겨울
//      3 4 5 봄
//      6 7 8 여름
//      9 10 11 가을 
//      사용자가 입력한 값의 계절을 맞추는 코드 작성
//      사용자 입력: 9
//      출력 예시: 가을
	   
//	   변수 선언 및 초기화
	   int month = 0;
	   String message = "월 을 입력해 주세요 ex) 3", season = "",
			   haru = "봄", summer = "여름", aki = "가을", winter = "겨울";
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println(message);
	   month = sc.nextInt();
	   
//	   설정
//	   여기서 먼저 올바른 월 선택 
	   if(month >= 1 && month <= 12) {
		   switch (month) {
		   case 12, 1, 2:
			   	season = winter;
		   		break;
		   case 3, 4, 5:
			   	season = haru;
		   		break;
		   case 6, 7, 8:
			   	season = summer;
		   		break;
		   case 9, 10, 11:
			   	season = aki;
		   		break;
		   
		   default: 
			   	season = "선택 오류";
			   	break;
		   }
//	   		결과 출력
		   	System.out.printf("%d월은 %s입니다.", month, season);
	   } else {
		   System.out.println("잘못 입력");
	   }
	   
	   
   }
}