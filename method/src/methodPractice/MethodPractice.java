package methodPractice;

public class MethodPractice {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();
		int[] numArr = {1,-5};
//		mp.printArr(numArr);
		mp.sortArr(numArr);
	}
	
	// 배열을 오름차순으로 정렬 하는 하는거 정의
	void sortArr(int[] arr) {
		int len = arr.length;
		int[] result = new int[len];
		for(int i = 0; i < len; i++) {
			result[i] = arr[i];
		}
		switch(len) {
		case 1: 
//			result = arr;
			break;
		default:
			for(int i = 0; i < len - 1; i++) {
				int min = result[i], idx = i, temp = 0;
				for(int k = 1+i; k < len; k++) {
					if(result[k] < min) {
						min = result[k];
						idx = k;
					}
				}
				temp = result[i];
				result[i] = min;
				result[idx] = temp;
			}
		}
		printArr(result);
		// return result;
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
