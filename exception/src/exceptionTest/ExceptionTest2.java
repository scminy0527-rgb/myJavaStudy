package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "채팅 입력 하세요", input = null;
		System.out.println(message);
		
		try {
			input = sc.nextLine();
//			Integer.parseInt(input);
					
			if(input.contains("바보")) {
				throw new BadwordException("바보라고 치면 안되요");
			}
			
			System.out.println(input);
		} catch (BadwordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("바보라고 치면 안되요");
		}
	}
}
