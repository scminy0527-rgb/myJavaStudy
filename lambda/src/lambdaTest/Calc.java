package lambdaTest;

// 매서드는 딱 하나만 가질 수 있고 1회성으로 내가 만들어서 쓰겠다 라는 의미
@FunctionalInterface
public interface Calc {
//	있을거 같은거 정의
	public int add(int num1, int num2);
}
