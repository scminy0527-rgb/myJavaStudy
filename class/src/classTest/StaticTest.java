package classTest;

public class StaticTest {
   int data = 10;
   static int data_s = 10;
   
   void increase() {
      System.out.println(++data);
   }
   
   static void increase_s() {
      System.out.println(++data_s);
   }
   
   
   public static void main(String[] args) {
	   
	   StaticTest st = new StaticTest();
//	   st.increase();
//	   st.increase();
//	   st.increase();
//	   st.increase();
//	   st.increase();
//	   st.increase();
//	   st = new StaticTest();
//	   st.increase();
//	   st.increase();
//	   st.increase();
//	   st.increase();
	   
	   // 객체화와 상관 없이 쓸 수 있는 static 매서드
	   increase_s();
	   st.increase_s();
	   st.increase_s();
	   st.increase_s();
	   st.increase_s();
	   st.increase_s();
	   st = new StaticTest();
	   st.increase_s();
	   st.increase_s();
	   st.increase_s();
	   st.increase_s();
	   
      
      
      
      
   }
}