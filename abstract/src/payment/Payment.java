package payment;

public class Payment {
//	일단 카카오페이든 카드 isp 결제 이든 간편 결제 이든 가격 및 신상 정보를 받음
	private int price;
	private String name;
	private String phoneNum;
	private String email;
	
	public Payment() {;}
	public Payment(int price, String name, String phoneNum, String email) {
		this.price = price;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
