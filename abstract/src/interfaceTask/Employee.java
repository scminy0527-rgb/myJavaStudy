package interfaceTask;

public class Employee extends PeopleAdaptor {
	public Employee() {;}
	public Employee(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("직장인은 밥을 먹습니다.");
	}
	
	@Override
	public void goWork() {
		System.out.println("직장인은 일을 나갑니다.");
	}
	
}
