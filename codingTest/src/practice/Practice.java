package practice;

public class Practice {
	public static void main(String[] args) {
		Practice pr = new Practice();
		int[] arr = {1};
		arr = pr.addNumToArr(arr, 2);
		arr = pr.addNumToArr(arr, 3);
		arr = pr.addNumToArr(arr, 4);
		arr = pr.addNumToArr(arr, 5);
		arr = pr.addNumToArr(arr, 6);
		
		// 결과 출력
		pr.printArr(arr);
	}
	
	// 원소를 추가하는 매서드를 억지로 정의
	int[] addNumToArr(int[] arr, int num) {
		int[] result = null;
		int arrLen = arr.length;
		
		result = new int[arrLen + 1];
		for(int i = 0; i < arrLen + 1; i++) {
			if(i == arrLen) {
				result[i] = num;
				break;
			}
			
			result[i] = arr[i];
		}
		
		return result;
	}
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
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
