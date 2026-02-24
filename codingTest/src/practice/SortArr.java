package practice;

public class SortArr {
	public static void main(String[] args) {
		SortArr sa = new SortArr();
//		벼열을 정렬하는 날거 함수를 미리 정의
		int[] arr1 = {1, 10, 5, 99, -5};
		sa.sortArr(arr1);
	}
	
	int[] sortArr(int[] arr) {
		int[] result = null;
		int len = arr.length;
		if(len == 1) {
			return arr;
		}
		
		result = new int[len];
		for(int i = 0; i < len; i++) {
			result[i] = arr[i];
		}
		
		for(int i = 0; i < len - 1; i++) {
			int min = result[i];
			int idx = i, temp = 0;
			for(int j = i + 1; j < len; j++) {
				int num = result[j];
				if(num < min) {
					min = num;
					idx = j;
				}
			}
			temp = result[i];
			result[i] = min;
			result[idx] = temp;
		}
		return result;
	}
	
	// 배열 출력하는 기능 매서드
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%d" : "%d, ");
			System.out.printf(st, arr[i]);
		}
		System.out.print("]");
	}

}
