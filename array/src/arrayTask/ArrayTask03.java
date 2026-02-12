package arrayTask;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 배열에 담고 출력
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!
		
		String inputMsg = null;
		String[] strArray = null;
		Scanner sc = new Scanner(System.in);
		int gap = 'a' - 'A', arrLen = 0;
		
		System.out.println("1. 원하시는 메세지를 입력하세요 ex) hello PARK");
		inputMsg = sc.nextLine();
		arrLen = inputMsg.length();
		
//		System.out.println(inputMsg);
//		System.out.println(inputMsg.length());
//		System.out.println(gap);
		
//		배열에 담기
		strArray = new String[arrLen];
		for(int i = 0; i < arrLen; i++) {
			char c = inputMsg.charAt(i);
			
//			대소문자 구분 및 변환
			if(c >= 'a' && c <= 'z') {
//				System.out.println(c+"는 소문자");
				c -= gap;
			}else if(c >= 'A' && c <= 'Z') {
//				System.out.println(c+"는 대문자");
				c += gap;
			}else {
//				그냥 한글 인 경우
			}
			strArray[i] = ""+ c;
		}
		
		System.out.println("입력한 문자: "+inputMsg);
		System.out.print("변환된 문자: ");
		
		for(int i = 0; i < arrLen; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println("======================");
		
      
//      2. 사용자가 입력한 모든값을 반대로 뒤집어주는 걸 배열에 담고 결과를 출력
//      입력 예시) apple
//      출력 예시) elppa
		
		char[] reversedStr = null;
		String msg2 = null;
		int strLen2 = 0;
		System.out.println("2. 반대로 뒤집을 값을 입력하세요");
		
		msg2 = sc.nextLine();
		strLen2 = msg2.length();
		reversedStr = new char[strLen2];
		
//		배열에 대입 및 출력 
		System.out.println("기존: " + msg2);
		System.out.print("신규: ");
		for(int i = 0; i < strLen2; i++) {
			int idx = strLen2 - 1 - i;
			reversedStr[i] = msg2.charAt(idx);
			System.out.print(reversedStr[i]);
		}
      
      
//      다이아
//      계산기 만들기
	}
}
