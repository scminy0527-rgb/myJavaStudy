package classTask;

// 1. 스포츠 추상화
class Sport {
	String name;
	int members;
	
	// 기본 생성자
	public Sport() {
		// TODO Auto-generated constructor stub: Do not touch
		;
	}
	
	// 초기화 생성자
	public Sport(String name, int members) {
		this.name = name;
		this.members = members;
	}
}

// 2. 농구, 야구, 축구 에 대한 객체화
// 3. 객체화: 기본 생성자, 초기화 생성자
public class ClassTask {
	public static void main(String[] args) {
		Sport basketball = new Sport("농구", 8);
		Sport baseball = new Sport("야구", 10);
		Sport soccer = new Sport("축구", 12);
		
		System.out.println(basketball.name);
		System.out.println(baseball.name);
		System.out.println(soccer.name);
	}
}
