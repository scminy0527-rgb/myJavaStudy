package anonymousTask1;

public class Starbucks {
//	입점을 할 때 상품 등록
//	Form 인터페이스
	private String[] menu;
	private String[] eventMenu; 
			
	public Starbucks() {;}
	public Starbucks(String[] menu) {
		this.menu = menu;
	}
	
//	게터세터
	public String[] getMenu() {
		return menu;
	}
	public void setMenu(String[] menu) {
		this.menu = menu;
	}
	public String[] getEventMenu() {
		return eventMenu;
	}
	public void setEventMenu(String[] eventMenu) {
		this.eventMenu = eventMenu;
	}
	
	public void register(Form form) {
		System.out.println("등록");
		this.setMenu(form.getMenu());
		this.setEventMenu(form.eventMenu());
	}
	
	public void newSell() {
		
	}
	
//	어느 지점에서 어떤걸 판매 중인지 봐야지 뭘 세일 하는지 알 수 있음
	public void sell(String menu, Starbucks starbucks) {
		String[] menus = this.getMenu();
		boolean isSell = false;
		for(int i = 0; i < menus.length; i++) {
			if(menus[i].equals(menu)) {
				isSell = true;
				if(starbucks instanceof EventMarker) {
					if(menu.equals("아메리카노")) {
						System.out.println("무료 행사~");
					} else {
						System.out.println("판매 완료");
					}
					break;
				} else {
					System.out.println("판매 완료");
					break;
				}
			}
		}
		
		
		if(!isSell) {
			System.out.println("판매 준비중");
		}
	}
}
