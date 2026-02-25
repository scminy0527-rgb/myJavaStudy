package innerClassTest;

public class InnerClassTest {
	class InnerClass {
		int value;
		
		{
			this.value = 20;
		}
		
		public InnerClass() {;}
		public InnerClass(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
		public void printValue() {
			System.out.println(this.value);
		}
	}
	
	public static void main(String[] args) {
		InnerClassTest it = new InnerClassTest();
//		InnerClass는 은닉이 됨
		
//		굳이 이렇게까지 해야하나
		InnerClassTest.InnerClass inner = new InnerClassTest().new InnerClass();
	}
}
