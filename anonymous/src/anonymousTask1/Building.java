package anonymousTask1;

// 무료 인곳 아닌곳을 마커 인터페이스로 설정
// 매장에 무언가를 판매 수행할 때 판단

public class Building {
	public static void main(String[] args) {
		Gnagnam gangnam = new Gnagnam();
		Jamsil jamsil = new Jamsil();
		Yeoksam yeoksam = new Yeoksam();
		Sinchon sinchon = new Sinchon();
		String americano = "아메리카노";
		
		Form gangnamForm = new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {americano};
			}
			
			@Override
			public String[] eventMenu() {
				return new String[] {americano};
			}
		};
		
//		개점 (개점 시 1회적으로 해야 하는거)
//		판매 메뉴 및 이벤트 메뉴 초기 설정 (매장이 오픈 하면 기본적으로 이벤트를 함)
//		여기서는 값을 하드코딩 하지만 원래는 서버에서 불러오는 과정을 수행하기도 함
		gangnam.register(gangnamForm);
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {americano, "아이스크림", "프라푸치노"};
 			}
			
			@Override
			public String[] eventMenu() {
				return null;
			}
		});
		
		yeoksam.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {americano, "녹차라떼", "애플민트티"};
			}
			
			@Override
			public String[] eventMenu() {
				return new String[] {americano};
			}
		});
		
		sinchon.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {americano, "자몽허니블랙티", "자몽에이드"};
			}
			
			@Override
			public String[] eventMenu() {
				return null;
			}
		});
		
//		각 지점을 판매
//		판매 라는 매서드는 한번만 쓰는게 아니라 매번 사용되어야 함
		System.out.println("1. 강남점 에서 아메리카노 구매");
		gangnam.sell("아메리카노", gangnam);
		System.out.println("2. 잠실점 에서 디카페인 아메리카노 구매");
		jamsil.sell("아이스크림", jamsil);
		System.out.println("3. 역삼점 에서 아메리카노 구매");
		yeoksam.sell("아메리카노", yeoksam);
		System.out.println("4. 신촌점 에서 자몽에이드 구매");
		sinchon.sell("자몽에이드", sinchon);
	}
}
