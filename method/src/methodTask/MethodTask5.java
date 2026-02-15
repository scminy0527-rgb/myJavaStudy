package methodTask;

import java.util.Scanner;

public class MethodTask5 {
	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
		Scanner sc = new Scanner(System.in);
		String str2 = null, result2 = null;
//      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
		int num1 = 10, num2 = 3, result3 = 0;
		int[] arr = null;
		String str3 = null, sc3 = null;
		
		// 4번 관련 변수 초기값
		int index4 = 0;
		int[] intArr4 = new int[5], result4 = null;
		
		
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
		System.out.println("문장을 입력하세요. ex) apple");
		str3 = sc.nextLine();
		System.out.println("입력한 문장에서 찾을 문장을 입력하세요 ex) p");
		sc3 = sc.nextLine();
		
//		System.out.println(str3+" "+sc3);
		result3 = mt.getCharCount(str3, sc3);
		System.out.printf("갯수: %d개\n", result3);
      
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
		System.out.println("5개의 정수를 입력하세요");
		
		while(true) {
			System.out.println(index4 + "번째 인덱스 값 입력");
			if(index4 == intArr4.length) {
				break;
			}
			int num = sc.nextInt();
//			예외처리 추후 넣기
			
			intArr4[index4] = num;
			index4++;
		}
		
//		mt.printArr(intArr4);
		result4 = mt.getMinMinNum(intArr4);
		mt.printArr(result4);
      
//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
//		랜덤값을 만드는 거를 정의
		for(int i = 0; i < 100; i++) {
			
		}
      
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
	
	// 사용자가 찾고자 하는 글자를 입력하면 몇개 잇는지 결과 반환
	int getCharCount(String str, String sc) {
		int result = 0;
		// 순회
		for(int i = 0; i < str.length(); i++) {
			String c = "" + str.charAt(i);
			if(c.equals(sc)) {
				result += 1;
			}
		}
		
		return result;
		
	}
	
	// 원소 5개 배열에서 가장 작은 값과 두번째로 작은 값 찾기
	int[] getMinMinNum(int[] numArr) {
		int len = numArr.length,
				tempMinNum = numArr[0], tempIdx = 0;
		int[] result = new int[2];
		
		for(int i = 0; i < 2; i++) {
			for(int k = 0; k < len - 1; k++) {
				int idx = k + 1;
				tempMinNum = numArr[idx] <= tempMinNum ? numArr[idx] : tempMinNum;
				tempIdx = tempMinNum == numArr[idx] ? idx : tempIdx;
			}
			
			// 턴 끝나고 난 뒤
			numArr[tempIdx] = numArr[i];
			numArr[i] = tempMinNum;
			
			tempMinNum = numArr[i+1];
			tempIdx = i + 1;
		}
		
		// 출력
//		System.out.printf("가장 작은 수: %d, 두번째로 작은 수: %d", numArr[0], numArr[1]);
		result[0] = numArr[0];
		result[1] = numArr[1];
		return result;
		
	}
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("'%d' ", arr[i]);
		}
		System.out.println();
	}
}
