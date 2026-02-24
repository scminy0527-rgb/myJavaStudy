package interfaceTask;

public abstract class PeopleAdaptor extends People implements Activity {
	public PeopleAdaptor() {;}
	public PeopleAdaptor(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {;}
	
	@Override
	public void goToSchool() {;}
	
	@Override
	public void goWork() {;}
}
