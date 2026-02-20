package inheritanceTask;

//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask {
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {;}
	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	void work () {
		System.out.println("일을 한다");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}
//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
class StudentTask extends PersonTask {
	String instaId;
	
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String instaId) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}
	
	// 학생에 맞는 매서드를 오버라이딩
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다");
	}
}

//   
//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
//   
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

class EmployeeTask extends PersonTask{
	int emgMoney;
	
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phone, int emgMoney) {
		super(name, age, address, phone);
		this.emgMoney = emgMoney;
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
}

public class InheritanceTask {
   public static void main(String[] args) {
	   // 객체화 하기
	   PersonTask person = new PersonTask("이규학", 20, "경기도 하남시", "010-0000-0000");
	   StudentTask student = new StudentTask("장보고", 18, "서울시 종로구", "010-1234-5678", "my_insta@");
	   EmployeeTask employee = new EmployeeTask("약소훈", 25, "서울시 서초구", "010-8888-5678", 50000);
	   
	   person.work();
	   person.sleep();
	   person.eat();
	   
	   student.work();
	   student.sleep();
	   student.eat();
	   
	   employee.work();
	   employee.sleep();
	   employee.eat();
   }
}
