package inheritancePractice;

class Bank {
	// 1단계: private
	private String name;
	private int balance;
	private int members;
	
	// 2단계: 기본 및 초기화 생성자 구현
	public Bank() {;}
	public Bank(String name, int balance, int members) {
		super();
		this.name = name;
		this.balance = balance;
		this.members = members;
	}
	
	// 게터 및 세터 구현
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	
	
	
}

public class InheritancePractice2 {
	public static void main(String[] args) {
		
	}

}
