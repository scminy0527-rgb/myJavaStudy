package methodTask;

public class MethodTask02 {
	public static void main(String[] args) {
		MethodTask02 mt = new MethodTask02();
		int[] calcResult = null, minMaxResult = null;
		char c = 'G';
		int[] numArr = {1,20,-3,4,5};
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
		mt.infoCharType(c);
		
//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
		calcResult = mt.numCalc(10, 20);
		for(int i = 0; i < calcResult.length; i++) {
			System.out.println(calcResult[i]);
		}
		
//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
		minMaxResult = mt.teachMaxAndMin(numArr);
		for(int i = 0; i < minMaxResult.length; i++) {
			System.out.println(minMaxResult[i]);
		}
	}
	
	String infoCharType(char c) {
		String result = null;
//		글자를 판단
		if(c >= 'a' && c <= 'z') {
			result = "소문자";
		} else if(c >= 'A' && c <= 'Z') {
			result = "대문자";
		} else {
			result = "일반문자";
		}
		
//		최종 결과를 출력 해주는 부분
		System.out.printf("입력 하신 %c 는 '%s' 입니다.\n", c, result);
		return result;
		
	}
	
//	두 정수와 연산자를 받으면 결과를 반환해주는 메서드
	int[] numCalc(int num1, int num2) {
		int result = 0;
		int[] results = new int[4];
		
//		사직연산 결과 담기
		results[0] = num1 + num2;
		results[1] = num1 - num2;
		results[2] = num1 * num2;
		results[3] = num1 / num2;
		
//		연산 수행
//		switch(operator) {
//		case '+':
//			result = num1 + num2;
//			break;
//		case '-':
//			result = num1 - num2;
//			break;
//		case '*':
//			result = num1 * num2;
//			break;
//		case '/':
//			result = num1 / num2;
//			break;
//		default:
//			System.out.println("연산자 에러: 올바른 연산자를 입력하세요");
//			result = -1;
//			break;
//		}
		return results;
	}
	
//	5개 정수 받아서 큰거 작은거 알려주기
	int[] teachMaxAndMin(int[] numArr) {
		int[] results = new int[2];
		int limit = 5, maxNum = 0, minNum = 0;
//		5개가 입력 됬는지 확인
		if(numArr.length == limit) {
			System.out.println("5개 입력 완료");
			maxNum = numArr[0];
			minNum = numArr[0];
			
//			크기 비교
			for(int i = 0; i < numArr.length - 1; i++) {
				int idx = i + 1;
				maxNum = numArr[idx] > maxNum ? numArr[idx] : maxNum;
				minNum = numArr[idx] < minNum ? numArr[idx] : minNum;
			}
			
//			결과 출력
			System.out.printf("가장 큰 수: %d, 가장 작은 수: %d", maxNum, minNum);
			results[0] = maxNum;
			results[1] = minNum;
		} else {
			System.out.println("5개 정수 입력이 필요합니다.");
		}
		
		return results;
	}
}
