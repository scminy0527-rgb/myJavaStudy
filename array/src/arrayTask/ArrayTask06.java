package arrayTask;

public class ArrayTask06 {
	public static void main(String[] args) {
//      마스터
//      1. 배열이 다음과 같이 있을 때
//      배열을 오름차순 정렬 후 출력하시오.
		int[] arrData1 = {1, 2, 4, 5, 9};
		int arrLen1 = arrData1.length;
      
//      최종 배열 안의 값: {1, 2, 4, 5, 9}
//      출력 결과: 9 5 4 2 1
		
//		선택정렬 응용
		for(int k = 0; k < arrLen1; k++) {
			for(int i = 0; i < arrLen1 - 1; i++) {
//			참고를 할 것
				int idx = i + 1;
				
//				System.out.println(arrData1[idx]);
				int tempInt = 0;
				
				for(int j = 0; j < idx; j++) {
//				해당 원소와 상위 for 에 있는 원소랑 비교
					if(arrData1[j] > arrData1[idx]) {
						tempInt = arrData1[j];
						arrData1[j] = arrData1[idx];
						arrData1[idx] = tempInt;
						break;					
					}
				}
			}
		}
		
//		배열 출력
		System.out.print("출력 결과: ");
		for(int i = 0; i < arrLen1; i++) {
			int idx = arrLen1 - 1 -i;
			System.out.print(arrData1[idx]+" ");
		}
		
      
//      2. 4행 4열의 2차원 배열이 존재할 때
		int n = 4;
      	int[][] arrData2 = new int[n][n];
      
//      아래와 같이 배열의 값을 넣고, 출력하시오
//      출력 예시)
//      0 1 0 1
//      1 0 1 0
//      0 1 0 1
//      1 0 1 0
      
//      힌트)
//      2차원 배열은 행부터 접근이 가능하다
//      예를 들면 arrData[2][1]의 의미는 2행 1열의 데이터를 의미한다.
	}
}
