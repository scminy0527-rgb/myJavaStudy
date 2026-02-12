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
		
		System.out.println();
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
		
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//      입력예시)
//      test123!@#
      
//      비밀번호 이외의 특수문자가 나올 수 있음.
//      출력 예시)
//      ???????
      
//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
		String[] menus = {"아메리카노", "카페라떼", "에이드", "밀크쉐이크"};
      
//      orders의 정수는 menus의 주문 번호입니다.
      
//      다이아
//      1. 계산기 만들기
//      사용자의 수식의 결과 값을 출력하는 계산기를 만드세요.
//      입력 예시1)
//      10 + 7 + 9
//      출력 예시1)
//      26
      
//      입력 예시2)
//      -7 + 8 + 11
//      출력 예시2)
//      12

//      힌트) 문자열의 메서드 .split()은 구분점으로 잘라 배열로 리턴하는 메서드이다.
//      자바에서는 구분점을 여러 개 전달할 수 있으며 여러개를 전달할 때에는 | 연산자를 이용한다
//      예를 들어 +, -를 구분점으로 자른다면 .split(\\+|\\-)로 전달해야한다.
//      \\는 제어문자가 아닌 문자열로 인식하기 위함이다.
		
//		사용자한테 수식 입력 받기
		String susik = null;
		
		System.out.println("계산을 원하는 수식을 입력하세요");
		System.out.println("예시1) 10 + 7 + 9");
		System.out.println("예시2) -7 + 8 + 11");
		susik = sc.nextLine();
		
	}
}
