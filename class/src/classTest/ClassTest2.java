package classTest;

// person bank
// 은행에다가 그 사람의 돈을 입금 하고 출금
// 클래스 간 상호작용 구현
class Bank {
	String bankName;
	int bankMoney;
	
	public Bank() {;}
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
//	사용자의 돈을 받아서 입금
//	수수료 천원씩 떼감
	void deposit(int money, Person person) {
		// 사용
		this.bankMoney += money + 1000;
		person.personMoney -= money + 1000;
	}
	
//	사용자의 돈을 출금
//	출금 수수료 5천원
	void withdraw(int money, Person person) {
		this.bankMoney -= (money - 5000);
		person.personMoney += (money - 5000);
	}
}

class Person {
	String personName;
	int personMoney;
	
	public Person() {;}
	public Person(String personName, int personMoney) {
		this.personName = personName;
		this.personMoney = personMoney;
	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		Bank kb = new Bank("국민은행");
		Person guehyeok = new Person();
		
		kb.deposit(10000, guehyeok);
		System.out.println("규혁이 돈: "+guehyeok.personMoney);
		System.out.println("은행 돈: "+kb.bankMoney);
		
		kb.withdraw(10000, guehyeok);
		System.out.println("규혁이 돈: "+guehyeok.personMoney);
		System.out.println("은행 돈: "+kb.bankMoney);
	}

}
