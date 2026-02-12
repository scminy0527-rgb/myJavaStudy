package arrayTask;

import java.util.Scanner;

public class ArrayTaskTemp02 {
	public static void main(String[] args) {
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//      출력예시) 실수 2개, 정수 2개
//		계속 유동적으로 배열 참조 바꿔치기 하는걸로 동적 길이 구현 (메모리에는 나쁠 수 있지만...)
		String[] strArr = null;
		String numStr = null;
		int strIndex = 0, intCount = 0, doubleCount = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			숫자를 입력
			System.out.println("리스트에 입력 할 숫자를 입력하세요.");
			System.out.println("예시: 10, 10.6, 9");
			System.out.println("입력을 종료 하기 위해서는 '종료' 입력");
			
			numStr = sc.nextLine();
//			여기에서 ra 이런 식의 입력에 대해서 거르는 예외처리문도 추후 필요
			
			if(numStr.equals("종료")) {
				break;
			}
			
//			임시 지역변수 설정
			String[] tempArr = new String[strIndex + 1];
			
			
//			strIndex 가 0: 처음 단계 / 1 이상 : 진행중인 단계
			if(strIndex == 0) {
				tempArr[0] = numStr;
			} else {
//				계속 입력 중인 단계
//				기존 strArr 에 있는 값을 가져와서 임시 배열에 할당
				for(int i = 0; i < strArr.length; i++) {
					tempArr[i] = strArr[i];
				}
				tempArr[strIndex] = numStr;
			}
//			임시 배열 참조를 정식 배열 참조로 할당 및 인덱스 증가
			strArr = tempArr;
			strIndex++;
		}
		
//		테스트 : 배열 출력해보기
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
//			정수 실수 여부 판단
			if(strArr[i].contains(".")) {
				doubleCount++;
			} else {
				intCount++;
			}
		}
		System.out.println();
		
//		최종 결과 출력
		System.out.printf("정수: %d개 / 실수: %d개", intCount, doubleCount);
	}
}
