package basicCoding;

public class Basic001 {
	public static void main(String[] args) {
		Basic001 ct = new Basic001();
//		정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//		각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//		단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
		int[] arr = {0, 1, 2, 4, 3};
		int[][] quries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		int[] result = null;
		
		result = ct.solution(arr, quries);
		ct.printArr(result);
		
		
	}
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int specialMin = 1000000;
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int kk = queries[i][2];
            
            // s 와 e 를 이용해서 arr for문 돌리기
            for(int k = s; k < e + 1; k++){
                
                specialMin = (arr[k] < specialMin && arr[k] > kk) ? arr[k] : specialMin;
            }
            
            answer[i] = specialMin == 1000000 ? -1 : specialMin;
            specialMin = 1000000;
        }
        return answer;
    }
	
//	단순히 프린트 하는 함수 (중간 검증용)
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+i);
		}
		System.out.println();
	}
}
