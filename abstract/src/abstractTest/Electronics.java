package abstractTest;

public abstract class Electronics {
//	상수: 값이 안바뀌는거
	final int DATA_test = 10;
	
//	추상 매서드
	public abstract void on();
	public abstract void off();
	
//	일반 매서드
	public void safe() {
		System.out.println("안전 장치 발동!");
	}
}
