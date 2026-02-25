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
	
	public void sell() {
		if(eventMenu == null) {
//			이벤트가 현재 없는 매장
			System.out.println("판매 완료");
		} else {
//			이벤트 중인거 불러오기
			String[] eventMenu = this.getEventMenu();
			for(int i = 0; i < eventMenu.length; i++) {
				System.out.print(eventMenu[i] + " ");
			}
			System.out.println("는 무료 행사 진행중");
 		}
	}
}
