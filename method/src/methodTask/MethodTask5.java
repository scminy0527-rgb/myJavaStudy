package methodTask;

import java.util.Scanner;

public class MethodTask5 {
	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
		Scanner sc = new Scanner(System.in);
		String str2 = null, result2 = null;
//      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
		int num1 = 10, num2 = 3;
		int[] arr = null;
		arr = mt.calcMokAndNamoji(num1, num2);
		System.out.printf("%d / %d 의 몫: %d, 나머지: %d", num1, num2, arr[0], arr[1]);
	      
//      2. 사용자가 입력하는 값중 정수 분리하기
//      입력 예시)
//      안1녕2하3세4요
//      출력 예시)
//      1234
		System.out.println("문자열을 숫자와 골고루 썪어서 입력하세요");
		System.out.println("예시: '안녕13규학아12힘5내'");
		str2 = sc.nextLine();
		
		System.out.println(str2);
		result2 = mt.getNumAtStr(str2);
		System.out.println(result2);
		
      
//      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//      입력 예시) apple
//      찾을 글자 p
//      반환 2
      
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
      
//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
      
//      6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda
      
//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd
		
	}
	
	int[] calcMokAndNamoji(int num1, int num2) {
		int mok = 0, namoji = 0;
		int[] arr = new int[2];
		
		// 계산 수행
		mok = num1 / num2;
		namoji = num1 % num2;
		arr[0] = mok;
		arr[1] = namoji;
		
		// qa
//		System.out.printf("%d / %d 의 몫: %d, 나머지: %d", num1, num2, mok, namoji);
		return arr;
	}
	
	// 숫자 분리
	String getNumAtStr(String str) {
		String result = "", numStr = "0123456789";
		for(int i = 0; i < str.length(); i++) {
			String c = "" + str.charAt(i);
			if(numStr.contains(c)) {
				result += c;
			}
		}
		
//		System.out.println(result);
		return result;
	}
}
