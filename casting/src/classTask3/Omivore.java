package classTask3;

public class Omivore extends Animal {
	public Omivore() {;}
	public Omivore(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eatFood() {
		System.out.println("잡식성으로 뭐든지 잘먹습니다.");
	}
}
