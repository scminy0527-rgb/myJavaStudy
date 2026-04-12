package practice;

public class AbstractPractice001 {
	public static void main(String[] args) {
		StarbucksDT dtStarbuck = new StarbucksDT(Long.valueOf(1), "신월 ic dt", "서울시 강서구");
		
		if(dtStarbuck instanceof DTMarker) {
			System.out.println("해당 매장은 dt 매장 입니다.");
		}
		if(dtStarbuck instanceof Starbucks) {
			System.out.println("해당 업소는 스타벅스 입니다.");
		}
		
	}
}
