package interfaceTask;

//사람
//이름, 나이
//먹기, 등교하기, 회사가기

//학생(Student), 직장인(Employee), 백수(UnEmployee)
//강제성 Adapter Class를 활용해서 없애고,
//필요한 메서드만 구현하기 
public class InterfaceTask1 {
	public static void main(String[] args) {
//		학생은 먹고 학교에 갈 수 있음
		Student student = new Student("이규학", 18);
		student.eat();
	}
	
}
