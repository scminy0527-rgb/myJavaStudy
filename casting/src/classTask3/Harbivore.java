package classTask3;

// 상속은 여러개가 안된 다.
public class Harbivore extends Animal {
	public Harbivore() {;}
	public Harbivore(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eatFood() {
		System.out.println("초식동물 답게 고기를 먹습니다.");
	}
}
