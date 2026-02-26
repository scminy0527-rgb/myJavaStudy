package exceptionTest;

// 런타임 예외는 컴파일러가 검사 안함
public class BadwordException extends RuntimeException {
	public BadwordException() {;}
	public BadwordException(String message) {
		super(message);
	}

}
