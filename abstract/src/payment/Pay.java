package payment;

public interface Pay {
//	각 결제에 필요한 거를 구현해 놓음
	void requestPayment();
	void handleResponse();
	void samsungPay();
	void applePay();
}
