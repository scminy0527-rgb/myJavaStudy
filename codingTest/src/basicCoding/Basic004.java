package basicCoding;

public class Basic004 {
	public static void main(String[] args) {
		Basic004 ct = new Basic004();
		int[] result = null;
//		모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 
//		계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
//
//		그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
//
//		계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
//
//		임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
		int n = 10;
		result = ct.solution(n);
		ct.printArr(result);
		
	}
	
	public int[] solution(int n) {
        int[] answer = {n};
        
        while(true) {
        	int arrLen = answer.length;
        	int x = answer[arrLen - 1];
        	int addX = x % 2 == 0 ? x / 2 : x*3 + 1;
        	
        	answer = addNumToArr(answer, addX);
        	if(addX == 1) {
        		break;
        	}
        }
        
        return answer;
    }
	
	// 현재 배운걸 토대로 리스트에 원소를 집어넣는 매서드를 만들기
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
