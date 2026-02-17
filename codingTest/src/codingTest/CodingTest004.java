package codingTest;

public class CodingTest004 {
	public static void main(String[] args) {
		CodingTest004 ct = new CodingTest004();
//		함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 
//		n개 지니는 리스트를 리턴해야 합니다. 
//		다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		
//		x는 -10000000 이상, 10000000 이하인 정수입니다.
//		n은 1000 이하인 자연수입니다.
		long[] result = null;
		
		int x = 1000000;
		int n = 500;
		
		result = ct.solution(x, n);
		ct.printArr(result);
		
	}
	
	public long[] solution(int x, int n) {
        long[] answer = null;
        answer = new long[n];
        
        for(int i = 0; i < n; i++){
        	// 강제 형변환을 통해서 long 의 연산이 되게하는게 핵심
        	// int int 연산이 아니라 long long 연산이 되도록 하기
            long num = (long)x + (long)x*i;
            answer[i] = num;
        }
        
        
        return answer;
    }
	
//	단순히 프린트 하는 함수 (중간 검증용)
	void printArr(long[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+i);
		}
		System.out.println();
	}

}
