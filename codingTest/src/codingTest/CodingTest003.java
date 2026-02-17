package codingTest;

public class CodingTest003 {
	public static void main(String[] args) {
		CodingTest003 ct = new CodingTest003();
//		1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//		(1은 소수가 아닙니다.)
//
//		제한 조건
//		n은 2이상 1000000이하의 자연수입니다.
		
		// 소수가 아닌 수 라면 무조건 소수로 나누어 떨어져야 함
		// 자기보다 작은 소수로도 안나누어 떨어지면 해당 수는 소수 라고 판별 가능
		int n1 = 5, n2 = 10;
		int result1 = 0, result2 = 0;
		
		
		result1 = ct.solution(n1);
		result2 = ct.solution(n2);
		
		System.out.println("결과1: "+result1);
		System.out.println("결과2: "+result2);
	}
	
	public int solution(int n) {
		// 문제 핵심 n*n 복잡도가 안되게 해야 함
		// n 개의 원소 false 리스트를 만든 후 만약 합성수 라면 true 로 바꾸고
		// 나중에 최종적으로 false 원소의 갯수만 세기
        int answer = 0;
        boolean[] isHapSungSu = new boolean[n];
        
        for(int i = 0; i < n; i++) {
        	int num = i + 1;
        	countSosuNum(isHapSungSu, num, n);
        }
        
        for(int i = 0; i < isHapSungSu.length; i++) {
        	if(!isHapSungSu[i]) {
        		answer++;
        	}
        }
        return answer;
    }
	
	// 소수의 갯수를 구해주는 문제
	void countSosuNum(boolean[] isHapSungSu, int num, int n) {
		// 1 처리
		if(num == 1) {
			isHapSungSu[0] = true;
			return;
		};
		// 일단 2 랑 3 만 가지고 리스트 하기
		if(num == 2 || num == 3) {
//			isHapSungSu[num - 1] = true;
			// 합성 수 인걸 true 해버리기
			for(int i = 0; num*num + num*i <= n; i++) {
				int idx = (num*num + num*i) - 1;
				isHapSungSu[idx] = true;
			}
		}
		
		// 4 부터 처리를 하는 개념 (만약 자기 인덱스가 true 라면 넘어가기)
		if(isHapSungSu[num - 1]) {
			return;
		} else {
			for(int i = 2; i*i <= num; i++) {
				if(num % i == 0) {
					isHapSungSu[num - 1] = true;
					return;
				}
			}
		}
	}
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(boolean[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+i);
		}
		System.out.println();
	}
}
