package castingTest;

public class CastingTest02 {
   public static void main(String[] args) {

      // 자동 형변환
      System.out.println("A" + 10);
      System.out.println('A');
      
      int a = 'A';
      char b = 13823 * 4;
      System.out.println(a);
      System.out.println(b);
      
      System.out.println('A' + "a");
      System.out.println("" + 'A' + 'B');
      
//      기본 자료형과 클래스 자료형
//      System.out.println((String)'a');
//      System.out.println((String)10);
//      System.out.println((int)"10");
      
//      강제 형변환
//      기본 자료형의 클래스형 자료형
//      int -> Integer
//      boolean -> Boolean
//      float -> Float
//      double -> Double
//      long -> Long
//      char -> Character
      
//      "10" -> 10
      int num1 = Integer.parseInt("10");
      
//      "3.6" -> 3.6
      double num2 = Double.parseDouble("3.6");
      
//      "true" -> true
      boolean isFalse = Boolean.parseBoolean("true");
      
//      10 -> "10"
      String data1 = String.valueOf(10);
      
//      false -> "false"
      String data2 = String.valueOf(false);
      
   }
}















