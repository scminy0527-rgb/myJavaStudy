package classTask3;

public class Harbivore extends Animal {
	public Harbivore() {;}
	public Harbivore(String name, int age) {
		super(name, age);
	}
	
	@Override
	void eatFood() {
		System.out.println("초식동물 답게 고기를 먹습니다.");
	}
}
