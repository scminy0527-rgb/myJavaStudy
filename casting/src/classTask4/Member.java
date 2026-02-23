package classTask4;

public class Member {
	private String name;
	private String phoneNum;
	private int money;
	private double point;
	
	public Member() {;}
	public Member(String name, String phoneNum, int money) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
//	매서드 정의 (포인트 추가)
	public void addPoint(int price) {
		System.out.println("포인트 적립");
	}
	
//	돈 및 포인트 조회
	public void showPoint() {
		System.out.printf("%s님의 포인트는 %f점 돈은 %d원 있습니다.\n", this.name, this.point, this.money);
	}
	
//	유저 마다의 판매 가격을 추출하기 위한 매서드
	public int calcSalePrice(int price) {
		return price;
	}
	
//	유저가 구매를 한 금액 만큼 돈을 감소 시키는 매서드
	public void spendMoney(int money) {
		this.money -= money;
	}
	
}
