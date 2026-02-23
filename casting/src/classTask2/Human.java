package classTask2;

public class Human extends Monster {
	private String dropItem = "갑옷";
	private String type = "휴먼";
	
	public Human() {;}

	public String getDropItem() {
		return dropItem;
	}
	public void setDropItem(String dropItem) {
		this.dropItem = dropItem;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	void monsterEncount() {
		System.out.printf("당신은 %s을(를) 마주쳤습니다.\n", this.type);
	}
	
	@Override
	void monsterAttack() {
		System.out.printf("당신은 %s을(를) 공격합니다!!!\n", this.type);
	}

	String humanAttack () {
		System.out.println("휴먼이 숨는다");
		return getDropItem();
	}
}
