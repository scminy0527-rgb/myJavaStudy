package forTask;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		 for(int i = 0; i < 6; i++) {
	         int value = i + 1;
	         System.out.println(value > 4 ? value + 4 : value);
	      }	
		 
		 
//	      브론즈
//	      1. 1~100까지 출력
	 	  System.out.println("1~100 출력");
		  for(int i = 0; i < 100; i++) {
			  int num = i + 1;
			  System.out.println(num);
		  }
//	      2. 100~1까지 출력
		  System.out.println("100~1까지 출력");
		  for(int i = 0; i < 100; i++) {
			  int num = 100 - i;
			  System.out.println(num);
		  }
		  
//	      골드
//	      1. 1~10까지 누적합을 출력
		  System.out.println("1~10까지 누적합을 출력");
		  int total = 0;
		  for(int i = 0; i < 10; i++) {
			  int num = i + 1;
			  total += num;
		  }
		  System.out.println(total);
		  
//	      2. 1~n까지 누적합 출력
		  System.out.println("1~n까지 누적합 출력");
		  int secondSum = 0;
		  int n = 0;
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("정수 n 을 입력하세요");
		  n = sc.nextInt();
		  
		  for(int i = 0; i < n; i++) {
			  int num = i + 1;
			  secondSum += num;
		  }
		  System.out.println("누적합: " + secondSum);
	      
//	      플레티넘
//	      1. A~F까지 출력
		  System.out.println("A~F까지 출력");
		  for(int i = 0; i < 6; i++) {
			  System.out.print((char)('A'+i));
		  }
		  System.out.println("\n");
		  
//	      2. A~F까지 중 C를 제외하고 출력
//		  ABDEF
		  System.out.println("A~F까지 중 C를 제외하고 출력");
		  for(int i = 0; i < 5; i++) {
			  int num = i < 2 ? i : i+1;
			  System.out.print((char)('A' + num));
		  }
		  System.out.println("\n");
	      
//	      다이아
//	      1. aBcDeFg...Z 출력
//		  a c e 
//		  0 2 4
//		  알파벳 갯수 모르면 구하기
		  int alphaCount = 'z' - 'a' + 1;
		  
		  for(int i = 0; i < alphaCount; i++) {
			  char alpha = (i % 2 == 0) ? (char)('a' + i): (char)('A' + i);
			  System.out.print(alpha);
		  }
		  System.out.print("\n");
		  
//	      2. 별찍기 
//	        *
//	       ***
//	      *****
//		  몇층 별 쌓을지 결정
		  int floor = 10;
		  for(int i = 0; i < floor; i++) {
//			  먼저 스페이스 공백 줘서 공간 만들기
			  int spaceCount = floor - 1 - i;
			  for(int j = 0; j < spaceCount; j++) {
				  System.out.print(" ");
			  }
//			  그 다음 점 찍기
			  int starCount = 2*i + 1;
			  for(int k = 0; k < starCount; k++) {
				  System.out.print("*");
			  }
			  System.out.print("\n");
		  }
	      
//	      마스터
//	      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//	      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//	      입력 예시) a1b3c2
//	      출력 예시) abbbcc
		  char strAlpha = ' ';
		  int strLength = 0;
		  
		  String strForPrint = "",
				  msg = "문자 및 반복할 횟수를 입력하세요 (입력 예시) a1b3c2",
				  firstResult = "";
		  
		  System.out.println(msg);
		  strForPrint = sc.next();
		  strLength = strForPrint.length();
		  
		  for(int i = 0; i < strLength; i++) {
//			  홀짝에 따른 다른 비즈니스 로직
			  if(i % 2 == 0) {
//				  값 추출
				  strAlpha = strForPrint.charAt(i);
			  } else {
//				  횟수 만큼 반복 (카운트 숫자를 만들기)
				  int count = Integer.parseInt("" + strForPrint.charAt(i));
				  for(int j = 0; j < count; j++) {
					  System.out.print(strAlpha);
					  firstResult += strAlpha;
				  }
			  }
		  }
		  System.out.print("\n");
		  
//	      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//	      입력한 횟수 만큼 문자를 만들어주는 프로그램
//	      입력 예시) a1b22c357
//	      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
//		  '1' 아스키: 49 // '9' 아스키: 57
		  
//		  잘 받았나 확인
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















