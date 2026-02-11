package forTest;

import java.util.Scanner;

public class ForTempTest {
	public static void main(String[] args) {
//		2. 사용자가 입력한 횟수가 얼마인지 모르고,
//	      입력한 횟수 만큼 문자를 만들어주는 프로그램
//	      입력 예시) a1b22c357
//	      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
//		  '1' 아스키: 49 // '9' 아스키: 57
		  char secondAlpha = ' ';
		  int secondLength = 0;
		  String secondStr = "",
				  charCount = "",
				  secondMsg = "문자 및 반복할 횟수를 입력하세요 (입력 예시) a1b22c357";
		  boolean nowMakingCount = false;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(secondMsg);
		  secondStr = sc.next();
		  secondLength = secondStr.length();
		  
//		  입력받은 문자열 각 요소의 char 의 아스키를 비교 해서 횟수면 횟수, 알파벳 이면 알파벳 으로 처리하기
		  for(int i = 0; i < secondLength; i++) {
			  char component = secondStr.charAt(i);
//			  알파벳 이라면 secondAlpha 에 저장
			  if((int)component >= 65) {
//				  만약에 이전 단계 (횟수 생성) 에서 넘어온 거라면 다음 과정 수행 해야 함
//				  횟수 만큼 이전 알파벳 출력
//				  그 다음에 새로운 알파벳 저장
				  if(nowMakingCount) {
					  int count = Integer.parseInt(charCount);
					  
					  for(int j = 0; j<count; j++) {
						  System.out.print(secondAlpha);
					  }
					  charCount = "";
					  nowMakingCount = false;
				  }
				  secondAlpha = component;
			  } else {
//				  '1' 형태의 숫자 형태 라면 charCount 형성 하는데 도움을 주기
				  nowMakingCount = true;
				  charCount += component;
				  
//				  맨 마지막 (숫자로 끝나는거도 고려 해야함)
				  if(i == secondLength - 1) {
					  int count = Integer.parseInt(charCount);
					  for(int j = 0; j<count; j++) {
						  System.out.print(secondAlpha);
					  }
				  }
			  }
		  }
	}
}
