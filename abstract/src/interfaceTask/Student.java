package interfaceTask;

public class Student extends PeopleAdaptor {
	public Student() {;}
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("학생은 밥을 먹습니다.");
	}
	
	@Override
	public void goToSchool() {
		// TODO Auto-generated method stub
		System.out.println("학생은 학교에 갑니다.");
	}
}
