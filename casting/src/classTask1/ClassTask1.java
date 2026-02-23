package classTask1;

public final class ClassTask1 {
	public static void main(String[] args) {
//		넷플릭스
//		에니메이션, 영화, 드라마
		
//		선택한 영화에 따라서 다른 기능 구현
//		에니 이면 자막을 지원해주고 싶음
//		영화 라면 4d 기능을 탑재
//		드라마 라면 굿즈 판매 기능 활성화
		Netflix netflix = new Netflix();
		netflix.checkGenre(new Animation());
		netflix.checkGenre(new Movie());
		netflix.checkGenre(new Drama());
	}
}
