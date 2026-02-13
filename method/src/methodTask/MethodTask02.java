package methodTask;

public class MethodTask02 {
	public static void main(String[] args) {
		MethodTask02 mt = new MethodTask02();
		int calcResult = 0;
		char c = 'G';
		int[] numArr = {1,20,-3,4,5};
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
		mt.infoCharType(c);
		
//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
		calcResult = mt.numCalc(10, 20, '+');
		System.out.println(calcResult);
		
//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
		mt.teachMaxAndMin(numArr);
	}
	
	void infoCharType(char c) {
//		글자를 판단
		if(c >= 'a' && c <= 'z') {
			System.out.println("소문자 입니다.");
		} else if(c >= 'A' && c <= 'Z') {
			System.out.println("대문자 입니다.");
		} else {
			System.out.println("일반문자 입니다.");
		}
	}
	
//	두 정수와 연산자를 받으면 결과를 반환해주는 메서드
	int numCalc(int num1, int num2, char operator) {
		int result = 0;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 에러: 올바른 연산자를 입력하세요");
			result = -1;
			break;
		}
		return result;
	}
	
//	5개 정수 받아서 큰거 작은거 알려주기
	void teachMaxAndMin(int[] numArr) {
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
		} else {
			System.out.println("5개 정수 입력이 필요합니다.");
		}
	}
}
