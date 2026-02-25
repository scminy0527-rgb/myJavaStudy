package payment;

public class CardPayment extends PayAdaptor {
//	카드 결제를 구현
//	그런데 신성한 대한민국 에서는 애플 페이 사용을 못하게 해야 함
	public CardPayment() {;}
	public CardPayment(int price, String name, String phoneNum, String email) {
		super(price, name, phoneNum, email);
	}
	
	@Override
	public void requestPayment() {
		// TODO Auto-generated method stub
		System.out.println("카드 결제를 요청 합니다.");
	}
	
	@Override
	public void handleResponse() {
		// TODO Auto-generated method stub
		System.out.println("결제 결과를 핸들링 합니다.");
	}
	
	@Override
	public void samsungPay() {
		// TODO Auto-generated method stub
		System.out.println("삼성 페이로 간편 결제를 하사 합니다.");
	}
	
//	여기서 문제... 애플페이를 무조건 정의를 해야 함
//	그래서 어댑터를 정의 PaymentAdaptor 하려고 해도 상속은 하나만 받기 가능...
//	따라서 부모를 어뎁터에 상속 하고 해당 어탭터를 여기로 상속 받기

}
