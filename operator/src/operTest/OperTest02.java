package operTest;

public class OperTest02 {
	public static void main(String[] args) {
		String data1 = "a", data2 = "b", data3 = "a";
		String data4 = new String("a");
		// 문자열끼리 == 를 사용하면 안됨
//		주소값 개념 조심
//		.equals()를 사용해야함
		
		System.out.println(data1 == data2);
		System.out.println(data4);
		System.out.println(data1 == data4);
	}
}
