package classTask2;

public class Yojung extends Monster {
	private String dropItem = "날개";
	private String type = "요정";
	
	public Yojung() {;}

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

	String yojungAttack() {
		System.out.println("요정이 마법을 사용한다");
		return dropItem;
	}
}
