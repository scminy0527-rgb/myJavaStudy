package operTest;

import java.util.Scanner;

public class OperTest {
   public static void main(String[] args) {
      
//      정수 + 정수 = 정수
//      정수 / 정수 = 정수
//      System.out.println(10 / 3);
//      System.out.println(10.0 / 3);
//      System.out.println(13.2 % 2);
      
//      두 수를 받아서 비교
      Scanner sc = new Scanner(System.in);
      int num1 = 0, num2 = 0, result = 0;
      String message = "두 정수를 입력하세요.\nex)10 30";
      
      System.out.println(message);
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      
//      System.out.println(num1);
//      System.out.println(num2);
      
      result = num1 > num2 ? num1 : num1 < num2 ? num2 : -1;
      System.out.println(result);
      
   }
}








