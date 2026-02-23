package classTask2;

public class ClassTask2 {
//  게임 시스템
//  캐릭터는 몬스터를 사냥할 수 있다.
// 몬스터
//  오크, 요정, 휴먼
//  오크를 사냥하면 
//  "오크가 달려든다!"를 출력 +@
//  "가죽 얻는다"를 출력
  
//  요정을 사냥하면
//  "요정이 마법을 사용한다"를 출력 +@
//  "날개를 얻는다"를 출력
  
//  휴먼을 사냥하면
//  "휴먼이 숨는다"를 출력 +@
//  "갑옷을 얻는다"를 출력 
	public static void main(String[] args) {
		// 캐릭터 객체화
		Charactor charactor1 = new Charactor("이규학", "법사");
		
		charactor1.attackMonster(new Oak());
		charactor1.attackMonster(new Yojung());
		charactor1.attackMonster(new Human());
	}
}
