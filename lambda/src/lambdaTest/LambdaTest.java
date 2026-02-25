package lambdaTest;

public class LambdaTest {
	
	public static void main(String[] args) {
//		만약 중괄호가 있다면 비즈니스 로직 수행 가능 하며 리턴값이 있어야 함
		Calc calc = (num1, num2) -> num1 + num2;
		Calc2 calc2 = (num1, num2) -> num1 / (double)num2;
		
		System.out.println(calc2.divide(10, 3));
	}
}
