package interfaceTask;

public class People {
//	사람이 가지고 있는 공통 특성 생각
	private String name;
	private int age;
	
	public People() {;}
	public People(String name, int age) {
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
}
