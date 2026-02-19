package classTask;

// 회사
class Company {
	static int income;
	String name;
	int age;
	
	public Company() {;}
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class StaticTask1 {
			
	public static void main(String[] args) {
		Company employee1 = new Company("홍길동", 20);
		Company employee2 = new Company("장보고", 20);
		Company employee3 = new Company("김철수", 30);
		
		employee1.income += 10000;
		employee1.income += 30000;
		employee1.income -= 40000;
		
		System.out.println(employee1.income);
	}
}
