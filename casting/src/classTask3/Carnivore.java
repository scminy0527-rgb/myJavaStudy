package classTask3;

public class Carnivore extends Animal {
	public Carnivore() {;}
	public Carnivore(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eatFood() {
		System.out.println("육식동물 답게 야채를 먹습니다.");
	}
}
