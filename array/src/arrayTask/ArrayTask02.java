package arrayTask;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {
//      골드
//      1. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
		int count = 0, index = 0;
		double number = 0.0, maxNum = 0.0, minNum = 0.0;
		String arrList1 = "[";
		double[] numArr = null;
		
		Scanner sc = new Scanner(System.in);
		
//		사용자한테 몇개 입력 받을건지 물어보기
		System.out.println("1 이상의 입력할 숫자의 갯수를 입력하세요. ex) 6");
		count = sc.nextInt();
		
//		count가 1 이상 일 때만 정상 작동 하게 하기
		if(count > 0) {
			numArr = new double[count];
			
			while(true) {
				System.out.println("숫자를 입력하세요");
				number = sc.nextDouble();
				
//				여기서 올바른 숫저가 아니면 예외 처리를 추후에 해줘야 함
				
//				배열에 할당
				numArr[index] = number;
				arrList1 += number;
				index++;
				
				if(index >= count) {
					System.out.println("입력 완료");
					break;
				}
				arrList1 += ", ";
			}
//			배열 가장 앞에 값을 큰거 작은거로 할당
			maxNum = numArr[0];
			minNum = numArr[0];
			
//			크키 비교
			for(int i = 0; i < numArr.length - 1; i++) {
				int idx = i + 1;
				maxNum = numArr[idx] > maxNum ? numArr[idx] : maxNum;
				minNum = numArr[idx] < minNum ? numArr[idx] : minNum;
			}
			
//			결과 출력
			System.out.println(arrList1+" 의 최대 최소값 원소");
			System.out.printf("최대값: %f, 최소값: %f\n", maxNum, minNum);
			
		} else {
			System.out.println("오류! 1 이상의 입력할 숫자의 갯수를 입력해야 합니다.");
		}
		
      
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//      출력예시) 실수 2개, 정수 2개
//		계속 유동적으로 배열 바꿔치기 하는걸로 동적 길이 구현 (메모리에는 나쁠 수 있지만...)
		String[] strArr = null;
		String numStr = null;
		int strIndex = 0, intCount = 0, doubleCount = 0;
		String dummy = null;
		
		dummy = sc.nextLine();
		
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
