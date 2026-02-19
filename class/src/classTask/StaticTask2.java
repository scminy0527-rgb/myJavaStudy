package classTask;

// 학생(Student)
// 이름, 학번, 국어점수, 영어점수, 수학점수
// 학생들은 총점과 평균을 출력해주는 메서드를 가지고 있습니다.
// 또한 학생들의 총 숫자를 출력할 수 있습니다.
// 필요시 필드는 추가로 구현할 수 있습니다.
class Student{
	// 초기값은 넣지 않아도 컴파일러가 기본 값으로 초기값을 넣음
	static int totalStudent;
	
	String name;
	String id;
	int koreanScore;
	int englishScore;
	int mathScore;
	
	int totalScore;
	double avgScore;
	
	// 클래스의 초기값: null
	
	// 클래스 내 필드 (매서드) 정의
	void printTotalScore() {
		String msg = "%s 님의 총 점은 %d점 입니다.\n";
		System.out.printf(msg, name, totalScore);
	}
	
	void printAvgScore() {
		String msg = "%s님의 평균 점수는 %.2f점 입니다.\n";
		System.out.printf(msg, name, avgScore);
	}
	
	void printStudentNums() {
		String msg = "우리 학교의 총 학생수는 %d명 입니다.\n";
		System.out.printf(msg, totalStudent);
	}
	
	// 기본 생성자....
	public Student() {;}
	
	// 초기화 생성자
	public Student(String name, String id, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.id = id;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
		// 받은 변수들 가지고 작업 하는과정
		this.totalScore = koreanScore + englishScore + mathScore;
		this.avgScore = this.totalScore / 3.0;
		
		
	}
	
	// static 블럭
	static {
		// 객체가 인스턴스 됬을 때 최초 딱 한번만 실행됨
		System.out.println("입학 축하합니다.");
	}
	
	{
		// 초기화 블럭
		// 객체가 만들어 졌을 때 초기값을 넣어주기 위한것 등등
		// ex) 학생들 에게는 모두 포인트가 5천원 씩 제공 됨
		// 학생이 생성 되면 총 학생 수는 증가
		// 인스턴스가 호출 될 때 마다 호출 됨
		// 기본 생성자 안건드리고 해결 가능함
		totalStudent++;
	}
}


public class StaticTask2 {
   public static void main(String[] args) {
	   // 학생들 정의
	   Student student1 = new Student("이규학", "id_001", 50, 60, 70);
	   Student student2 = new Student("약소훈", "id_002", 80, 90, 47);
	   Student student3 = new Student("장보고", "id_003", 100, 60, 80);
	   
	   // 학생 갖고 놀기
	   student1.printStudentNums();
	   student1.printTotalScore();
	   student1.printAvgScore();
	   System.out.println();
	   
	   student2.printStudentNums();
	   student2.printTotalScore();
	   student2.printAvgScore();
	   System.out.println();
	   
	   student3.printStudentNums();
	   student3.printTotalScore();
	   student3.printAvgScore();
   }
}