package codingTest;

public class CodingTest005 {
	public static void main(String[] args) {
		CodingTest005 ct = new CodingTest005();
//		연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 
//		두 정수 num과 total이 주어집니다. 
//		연속된 수 num개를 더한 값이 total이 될 때, 
//		정수 배열을 오름차순으로 담아 
//		return하도록 solution함수를 완성해보세요.
		int num1 = 3, total1 = 12;
		int[] result1 = ct.solution(num1, total1);
		ct.printArr(result1);
		
		int num2 = 5, total2 = 5;
		int[] result2 = ct.solution(num2, total2);
		ct.printArr(result2);
		
		int num3 = 4, total3 = 14;
		int[] result3 = ct.solution(num3, total3);
		ct.printArr(result3);
		
		
	}
	
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int namoji = 0;
        // 가운데 수 구하기 나머지를 가지고 하기
        // num 이 홀수냐 짝수냐 를 가지고 하기
        namoji = num % 2;
        
        switch(namoji) {
        case 1:
        	// 이때는 가운데 수 하나 존재
        	int middle = total / num;
        	int midIdx = num / 2;
        	
        	// for문을 돌려서 하기 위한 횟수 구하기
        	int repeatCount = (num - 1) / 2;
        	
        	// 1. 맨 가운데 값을 집어넣기
        	answer[midIdx] = middle;
        	
        	for(int i = 0; i < repeatCount; i++) {
        		// 오른쪽 왼쪽 에 채울 원소
        		int right = middle + 1 + i;
        		int left = middle - 1 - i;
        		int rightIdx = midIdx + 1 + i, leftIdx = midIdx - 1 - i;
        		answer[rightIdx] = right;
        		answer[leftIdx] = left;
        	}
        	
        	
        	break;
        case 0:
        	// 이때는 가운데 수 두개 존재
        	int leftNum = total / num, rightNum = leftNum + 1;
        	int rightIdx = num / 2, leftIdx = rightIdx - 1;
        	
        	// 반복 횟수
        	int repCount = (num / 2) - 1;
        	
        	// 초기값 넣기
        	answer[leftIdx] = leftNum;
        	answer[rightIdx] = rightNum;
        	
        	// 나머지 넣기
        	for(int i = 0; i < repCount; i++) {
        		answer[leftIdx - i - 1] = leftNum - i - 1;
        		answer[rightIdx + i + 1] = rightNum + i + 1;
        	}
        	
        	break;
        }
        
        
        return answer;
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
