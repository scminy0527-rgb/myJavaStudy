package basicCoding;

public class Basic006 {
	public static void main(String[] args) {
		Basic006 ct = new Basic006();
//		정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
//
//		변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//
//		1. 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
		
//		2.
//		stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//		stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
//		위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
		
//		제한사항
//		1 ≤ arr의 길이 ≤ 100,000
//		1 ≤ arr의 원소 ≤ 100,000
		
		int[] arr = {1, 4, 2, 5, 3};
		int[] result = ct.solution(arr);
		ct.printArr(result);
	}
	
	public int[] solution(int[] arr) {
		int[] result = null;
        int[] stk = new int[10];
        int arrIdx = 0;
        int i = 0;
        
        while(true) {
        	// 만약 i 가 arr의 길이가 되면 종료
        	if(i >= arr.length) {
        		System.out.println("dix 는"+arrIdx);
        		break;
        	}
        	
        	// 만약 arrIdx 가 skt 의 길이가 됬다면 배열 길이를 늘려줘야함
        	if(arrIdx == stk.length) {
        		int[] newArr = new int[stk.length * 2];
        		for(int k = 0; k < arrIdx; k++) {
        			newArr[k] = stk[k];
        		}
        		stk = newArr;
        	}
        	
        	// 1 조건
        	if(arrIdx == 0) {
        		stk[arrIdx] = arr[i];
        		i++;
        		arrIdx++;
        		continue;
        	}
        	
        	// 2조건
        	if((stk[arrIdx - 1] < arr[i])) {
        		stk[arrIdx] = arr[i];
        		i++;
        		arrIdx++;
        	} else {
        		stk[arrIdx - 1] = 0;
        		arrIdx --;
        	}
        }
        result = new int[arrIdx];
        for(int k = 0; k < result.length; k++) {
        	result[k] = stk[k];
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
