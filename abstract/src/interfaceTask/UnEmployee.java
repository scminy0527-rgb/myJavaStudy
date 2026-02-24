package interfaceTask;

public class UnEmployee extends PeopleAdaptor {
	public UnEmployee() {;}
	public UnEmployee(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("백수는 먹기만 합니다.");
	}
}
