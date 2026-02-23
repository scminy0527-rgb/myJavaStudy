package classTask2;

public class Monster {
	private int hp;
	
	{
		this.hp = 100;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	//	유저가 해당 몬스터를 마주쳤을 때 흘러나올 안내문 정의
//	어떤 몬스터 이든지 간에 마주치는건 무조건 발생하는 일
	void monsterEncount() {
		System.out.println("몬스터를 마주쳤습니다.");
	}
	
//	유저가 몬스터를 공격 할 때 발생하는 메세지
	void monsterAttack() {
		System.out.println("당신은 몬스터를 공격합니다.");
	}
}
