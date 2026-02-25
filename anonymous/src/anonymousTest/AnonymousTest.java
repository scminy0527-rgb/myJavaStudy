package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
//		인터페이스를 객체화
//		객체화가 된거긴 함
//		내부 클래스
//		정확히는 익명 내부 클래스 (생성자만 있기에)
//		용도: 클래스 내에서 1회성으로 만 사용
		Study study = new Study() {
			
			@Override
			public void setTopic(String topic) {
				System.out.println("주제: " + topic);
			}
		};
		study.setTopic("규혁이");
	}
}
