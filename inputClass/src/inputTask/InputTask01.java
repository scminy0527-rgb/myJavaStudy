package inputTask;

// Ctrl + Shift + O
import java.util.Scanner;

public class InputTask01 {
	// Scanner를 사용하여, 두 정수를 입력 받고,
    // 덧셈 결과를 출력하시오.
    // 단 next()만 사용 
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String message = "두 정수를 입력하세요. ex) 10 8";
		String finalResult = "%d + %d = %d";
		
		System.out.println(message);
		num1 = Integer.parseInt(sc1.next());
		num2 = Integer.parseInt(sc1.next());
		
//		연산 하기
		result = num1 + num2;
		
//		결과 출력
		System.out.printf(finalResult, num1, num2, result);
	}
}
