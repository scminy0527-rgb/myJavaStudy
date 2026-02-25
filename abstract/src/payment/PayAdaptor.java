package payment;

public abstract class PayAdaptor extends Payment implements Pay {
	
	public PayAdaptor() {;}
	public PayAdaptor(int price, String name, String phoneNum, String email) {
		super(price, name, phoneNum, email);
	}


	@Override
	public void requestPayment() {;}

	@Override
	public void handleResponse() {;}

	@Override
	public void samsungPay() {;}

	@Override
	public void applePay() {;}

}
