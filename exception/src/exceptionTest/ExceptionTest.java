package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arrData = new int[5];
		int num = 0;
		
		try {
			System.out.println(arrData[3] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("인덱스 범위 벗어남");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) {
//			모든 에러 (부모) 는 가장 아래
			e.printStackTrace();
		} finally {
			System.out.println("에러가 발생 하던 안하던 무조건 실행이 되는 코드");
		}
	}
}
