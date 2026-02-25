package anonymousTask1;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		Starbucks yeoksam = new Starbucks();
		Starbucks sinchon = new Starbucks();
		
		Form gangnamForm = new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노"};
			}
			
			@Override
			public String[] eventMenu() {
				return new String[] {"아메리카노"};
			}
		};
		
//		개점 (개점 시 1회적으로 해야 하는거)
//		판매 메뉴 및 이벤트 메뉴 초기 설정 (매장이 오픈 하면 기본적으로 이벤트를 함)
//		여기서는 값을 하드코딩 하지만 원래는 서버에서 불러오는 과정을 수행하기도 함
		gangnam.register(gangnamForm);
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "아이스크림", "프라푸치노"};
 			}
			
			@Override
			public String[] eventMenu() {
				return null;
			}
		});
		
		yeoksam.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메라키노", "녹차라떼", "애플민트티"};
			}
			
			@Override
			public String[] eventMenu() {
				return new String[] {"아메리카노"};
			}
		});
		
		sinchon.register(new Form() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"};
			}
			
			@Override
			public String[] eventMenu() {
				return null;
			}
		});
		
//		각 지점을 판매
//		판매 라는 매서드는 한번만 쓰는게 아니라 매번 사용되어야 함
		gangnam.sell();
		jamsil.sell();
		yeoksam.sell();
		sinchon.sell();
	}
}
