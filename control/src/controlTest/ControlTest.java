package controlTest;

public class ControlTest {
	public static void main(String[] args) {
//		10, 30
		int num1 = 10, num2 = 30;
		if(num1 > num2) {
			System.out.println(num1 + "이 더 큽니다.");
		} else if(num1 < num2) {
			System.out.println(num2 + "이 더 큽니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}
	}
}
