package inputTask;

import java.util.Scanner;

public class InputTask02 {
   public static void main(String[] args) {
//      사용자가 입력한 정수 또는 실수의 값이
//      정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
//      출력 예시)
//      10 -> 정수
//      10.5 -> 실수
//      10.0 -> 실수
	   Scanner sc = new Scanner(System.in);
	   String message = "정수 혹은 실수를 입력해주세요 ex) 5 10.3 99 등등";
	   String numStr = "", result = "", secondResult = "", finalResult = "", finalSecond = "";
	   int pointIndex = 0;
	   double changedNum = 0;
	   
	   System.out.println(message);
	   numStr = sc.nextLine();
	   
//	   1. 실수의 특징 이용
//	   .이 있는 여부로 결정 (만약 . 이 없다면 인덱스 값은 -1 임)
//	   contains 도 이용 가능
	   pointIndex = numStr.indexOf(".");
	   result = (pointIndex > 0) ? "실수" : "정수";
	   finalResult = "입력하신 %s는 %s 입니다.";
	   
//	   2. 아니면 받은 값을 정수로 바꾼 뒤에 다시 문자열로 바꿔서 확인하는거도 가능
	   changedNum = Double.parseDouble(numStr);
	   secondResult = (numStr == String.valueOf((int)changedNum)) ? "정수": "실수";
	   finalSecond = "입력하신 %s는 %s 입니다.";
	   
	   
	   System.out.printf(finalResult, numStr, result);
	   System.out.printf(finalSecond, numStr, secondResult);
	   System.out.println();
	   
   }
}
