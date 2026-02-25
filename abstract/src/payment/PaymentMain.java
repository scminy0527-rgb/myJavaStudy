package payment;

public class PaymentMain {
	public static void main(String[] args) {
		CardPayment cardPay = new CardPayment(5000, "이규학", "010-0000-0000", "test123@gmail.com");
		cardPay.samsungPay();
		cardPay.applePay();
	}

}
