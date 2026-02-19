package methodTask;

import java.util.Scanner;

public class MethodTask5_6 {
	public static void main(String[] args) {
//		6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda
      
//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd
		
		// 사용자 한테 입력 받기
		MethodTask5_6 mt = new MethodTask5_6();
		Scanner sc = new Scanner(System.in);
		String str = null, result = null;
		System.out.println("문자를 입력하세요 ex) aabbccd");
		str = sc.nextLine();
		
//		System.out.println(str);
		result = mt.deleteDup(str);
		
		System.out.println(result);
	}
	
	// 매서드 정의
	// result 에 담으면서 result 에 contains 를 이용 해서 이미 있는지 보는 역 생각 하는 거도 가능
	String deleteDup(String str) {
		String result = "";
		char tempChar = ' ';
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(i == 0) {
				result += c;
				tempChar = c;
			}
			
			if(c == tempChar) {
				continue;
			} else {
				result += c;
				tempChar = c;
			}
		}
		return result;
	}

}
