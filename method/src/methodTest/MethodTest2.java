package methodTest;

public class MethodTest2 {
   
   int[] test(int[] data) {
      data[0] = 20;
      return data;
   }
   
   public static void main(String[] args) {
      MethodTest2 ts = new MethodTest2();
      int[] data = {50};
      
      ts.test(data);
      System.out.println(data[0]);
   }
}
