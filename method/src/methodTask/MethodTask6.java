package methodTask;

import java.util.Scanner;

public class MethodTask6 {
	public static void main(String[] args) {
		MethodTask6 mt = new MethodTask6();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String result = null;
//      사용자의 입력값은 1 ~ 1000000까지 입력
//      마스터 2.
//      정수를 한글 단위 숫자로 변환하시오
//      입력 예시1)
//      1000000
//      출력 예시1)
//      1백만
      
//      입력 예시2)
//      173200
//      출력 예시
//      17만3천2백
		
		// 일단 숫자 입력 받기
		while(true) {
			System.out.println("1~1000000 사이의 정수를 입력하세요");
			System.out.println("예시: 5215 또는 1000000 또는 154");
			int tempNum = sc.nextInt();
			
//			문자 입력 시 예외처리도 추후 필요
			
			if(tempNum >= 1 && tempNum <= 1000000) {
				num = tempNum;
				break;
			}
			System.out.println("에러: 올바른 방식으로 다시 입력해주세요");
		}
		System.out.println(num);
		
		// 결과 출력 해보기
		result = mt.changeNumToHangel(num);
		System.out.println("변환 결과: " + result);
	}
	
	// 변환하는 함수
	String changeNumToHangel(int num) {
		int tempNum = num;
		String result = "";
		int[] nanugiStandard = {1000000, 10000, 1000, 100, 10};
		String[] maeDecorator = {"백만", "만", "천", "백", "십"};
		
		for(int i = 0; i < nanugiStandard.length; i++) {
			int tempMoks = tempNum / nanugiStandard[i];
			if(tempMoks > 0) {
				result += tempMoks + maeDecorator[i];
				tempNum %= nanugiStandard[i];
			}
		}
		
		if(tempNum != 0) {
			result += tempNum;
		}
		
		return result;
	}
}
