package classTask2;

public class Charactor {
	private String name;
	private String job;
	private int hp;
	private String[] itemList = null;
	
//	생성자
	public Charactor() {;}
	public Charactor(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
//	개터 세터	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
//	초기화 블럭
	{
		this.hp = 100;
	}
	
//	공격 메서드
	void attackMonster(Monster monster) {
		String item = null;
		
		// 일단 공격 할 몬스터 타입 확인
		monster.monsterEncount();
		
//		각 몬스터 들의 고유의 반격 동작을 수행
		if(monster instanceof Oak) {
			item = ((Oak) monster).oakAttck();
		} else if(monster instanceof Yojung) {
			item = ((Yojung) monster).yojungAttack();
		} else if(monster instanceof Human) {
			item = ((Human) monster).humanAttack();
		}
		
//		공격 및 전리품 획득
		monster.monsterAttack();
		System.out.println(item+"을(를) 얻는다.");
		
//		아이템을 전리품 상자에 담는거도 생각
		
	}
	
//	전리품 조회 매서드
	
//	전리품 넣는 매서드
	void insertItem() {
		
	}
	
}
