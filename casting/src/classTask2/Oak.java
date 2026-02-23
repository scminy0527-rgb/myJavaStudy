package classTask2;

public class Oak extends Monster {
	private String dropItem = "가죽";
	private String type = "오크";
	
	public Oak() {;}
	
//	게터 세터
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

	public String oakAttck() {
		System.out.println("오크가 달려든다!");
		return this.dropItem;
	}
}
