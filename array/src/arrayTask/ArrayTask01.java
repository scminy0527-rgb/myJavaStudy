package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
		
		int[] arr1 = new int[100];
		for(int i = 0; i < arr1.length; i++) {
			int num = i + 1;
			arr1[i] = num;
		}
		
//		테스트: 먼저 리스트에 있는거 출력
		System.out.println("홀수만 출력하기");
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				continue;
			}
			System.out.println(arr1[i]);
		}
		
		
//      2. 10~1까지 중 짝수만 배열에 담고 출력
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			int num = 10 - i;
			arr2[i] = num;
		}
		
//		출력해보기
		System.out.println("10~1까지 중 짝수만 배열에 담고 출력");
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 2 == 1) {
				continue;
			}
			System.out.println(arr2[i]);
		}
		
//      3. 1~77까지 중 짝수만 배열에 담고 출력
		int[] arr3 = new int[38];
		int index3 = 0;
		for(int i = 0; i < 77; i++) {
			int num = i + 1;
			if(num % 2 == 0) {
				arr3[index3] = num;
				index3++;
			}
			
		}
		
//		배열 내용 출력
		System.out.println("3. 1~77까지 중 짝수만 배열에 담고 출력");
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
      
//      실버
//      A~F까지 배열에 담고 출력
		char[] charArr = new char[6];
		char munja = 'A';
		for(int i = 0; i < charArr.length; i++) {
			char c = (char)(munja + i);
			charArr[i] = c;
		}
		
//		출력
		System.out.println("A~F까지 배열에 담고 출력");
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
		
		
		int[] numArray = new int[5];
		int maxNum = 0, minNum = 0;
		String numArrList = "[";
		for(int i = 0; i < numArray.length; i++) {
//			입력 받기
			System.out.println(i+"번째 인덱스에 들어갈 정수를 입력해주세요 ex) 5");
			numArray[i] = sc.nextInt();
			
			numArrList += numArray[i];
			if(i != numArray.length - 1) {
				numArrList += ", ";
			}
		}
		numArrList += "]";
		
//		테스트 출력
		maxNum = numArray[0];
		minNum = numArray[0];
		for(int i = 0; i < numArray.length; i++) {
//			최대 최소 비교
			maxNum = numArray[i] > maxNum ? numArray[i] : maxNum;
			minNum = numArray[i] < minNum ? numArray[i] : minNum;
		}
		
		System.out.println("numArray: " + numArrList);
		System.out.printf("리스트 에서 최대값: %d, 최소값: %d", maxNum, minNum);
	}
}
