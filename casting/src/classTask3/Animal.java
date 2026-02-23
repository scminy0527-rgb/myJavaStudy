package classTask3;

// 모든 동물의 어머니
public class Animal {
	private String name;
	private int age;
	
	public Animal() {;}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	먹이 섭취
	public void eatFood() {
		System.out.println("먹이를 먹습니다.");
	}
	
//	public void speak() {
//		System.out.println("동물이 웁니다.");
//	}
}
