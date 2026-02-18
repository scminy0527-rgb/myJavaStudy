package basicCoding;

public class Basic002 {
	public static void main(String[] args) {
		Basic002 ct = new Basic002();
//		정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
//
//		위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
		int[] result = null;
		
		result = ct.solution(arr, queries);
		ct.printArr(result);
		
	}
	
	public int[] solution(int[] arr, int[][] queries) {
		int arrLen = arr.length;
        int[] answer = new int[arrLen];
        
        // 반환을 위한 새로운 배열 생성을 위한 첫 걸음
        for(int i = 0; i < arrLen; i++) {
        	answer[i] = arr[i];
        }
        
        // 쿼리를 가지고 임무 수행
        for(int i = 0; i < queries.length; i++) {
        	int ss = queries[i][0];
        	int ee = queries[i][1];
        	int kk = queries[i][2];
        	
        	for(int k = ss; k <= ee; k++) {
        		if(k % kk == 0) {
        			answer[k] += 1;
        		}
        	}
        }
        
        return answer;
    }
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
