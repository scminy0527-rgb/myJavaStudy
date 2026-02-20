package inheritanceTask;

// Phone
// 이름, 브랜드, 가격
// 문자발신 sms()
// 전화 call()

class Phone {
	// 변수는 private
	private String name;
	private String brand;
	private int price;
	
	// 기본 및 초기화 생성자
	public Phone() {;}
	public Phone(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		
	// 게터 세터
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 기본 매서드 정의
	public void sms() {
		System.out.println("문자를 발신합니다.");
	}
	public void call() {
		System.out.println("전화를 겁니다.");
	}
}

// Phone2G
// 인터넷
class Phone2G extends Phone {
//	기본 생성자 및 초기화 생성자
	public Phone2G() {;}
	public Phone2G(String name, String brand, int price) {
		super(name, brand, price);
	}
	
	// 인터넷
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
}

// Phone3G
// 인터넷, 영상통화
class Phone3G extends Phone2G {
	// 생성자
	public Phone3G() {;}
	public Phone3G(String name, String brand, int price) {
		super(name, brand, price);
	}
	
	// 영상통화
	public void videoCall() {
		System.out.println("영상 통화를 합니다.");
	}
}

// Phone2G, Phone3G 객체화
// Phone2G: 인터넷 메서드를 호출
// Phone3G: 영상통화 메서드 호출
public class InheritanceTask3 {
	public static void main(String[] args) {
		Phone2G phone2G = new Phone2G("피쳐폰", "애니콜", 1000);
		Phone3G iphone4 = new Phone3G("iPhone 4", "Apple", 1100);
		phone2G.internet();
		phone2G.sms();
		iphone4.videoCall();
		iphone4.call();
		System.out.println(phone2G.getBrand());
		System.out.println(iphone4.getBrand());
	}
}
