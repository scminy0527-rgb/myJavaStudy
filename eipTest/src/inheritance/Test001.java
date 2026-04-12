package inheritance;

public class Test001 {
	public static void main(String[] args) {
		A b = new B();
		b.paint();
		b.draw();
	}
}

class A {
	public void paint() {
		System.out.println("A");
		draw();
	}
	
	public void draw() {
		System.out.println("B");
		draw();
	}
}

class B extends A {
	public void paint() {
		super.draw();
		System.out.println("C");
		this.test();
	}
	
	public void draw() {
		System.out.println("D");
	}
	
	public void test() {
		System.out.println("Test");
	}
}
