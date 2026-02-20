package classTask;

// PlayerA
// 10 170 16 24 35

// PlayerB
// 53 22 74 12 13

// 클래스 PlayerA
// 카드 뽑기
// PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드

// 클래스 PlayerB
// 카드 뽑기
// PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드

// 기존 카드에서도 카드가 사라져야하고, 기존에 카드덱에 추가 되어야됩니다.

// 1. 객체화 PlayerA, PlayerB
// 2. PlayerA 카드뽑기
// 3. PlayerB 카드뽑기
// 4. PlayerA 가진 모든 카드를 출력
// 5. PlayerB 가진 모든 카드를 출력

class PlayerA {
	// 만약 처음에 카드 들을 알면 선언과 동시에 값을 넣어서 초기화도 가능함
	int[] cards;
	String name;
	
	// 기본 및 초기화 생성자
	public PlayerA() {;}
	public PlayerA(String name, int[] cards) {
		this.cards = cards;
		this.name = name;
	}

	// 초기화 블럭
	{
		this.cards = new int[5];
	}
	
	// 플레이어 a 의 특징적인 메서드
	// b 카드 중 가장 큰 수와 가장 작은 수 가져올 수 있는거
	// 가장 큰 수, 가장 작은 수: 총 2개 추가
	
	// 카드를 추출
	int[] getPlayerBCard(PlayerB playerB) {
		int[] playerBCards = playerB.bCards;
		int minNum = playerBCards[0], maxNum = playerBCards[0];
		for(int i = 1; i < playerBCards.length; i++) {
			int cardNum = playerBCards[i];
			minNum = cardNum < minNum ? cardNum : minNum;
			maxNum = cardNum > maxNum ? cardNum : maxNum;
		}
		return new int[] {minNum, maxNum};
	}
	
	// 남 에게서 카드를 가져오는 매서드 구현
	void getCardsAndInsert(int[] cards, PlayerB playerB) {
		insertCard(cards);
		playerB.removeCard(cards);
	}
	
	// 카드를 포켓에 집어넣는 매서드 그리고 상대방 에게서도 카드를 제거하기
	// A는 상대로부터 무조건 2개의 카드만 뽑을 수 있음
	void insertCard (int[] cards) {
		int len = cards.length;
		int[] tempCards = new int[this.cards.length + len];
		int originalCardsLen = this.cards.length;
		
		for(int i = 0; i < tempCards.length; i++) {
			if(i < originalCardsLen) {
				tempCards[i] = this.cards[i];
			} else {
				tempCards[i] = cards[i - originalCardsLen];
			}
		}
		this.cards = tempCards;
	}
	
	// 카드를 포켓에서 제거하는 매서드
	void removeCard (int[] cards) {
		// 몇개를 제거 할 지는 모르기에...
		int len = cards.length, tempIdx = 0;
		int[] tempCards = new int[this.cards.length - cards.length];
		
		// 먼저 제거 대상 카드를 -1 로 변경
		for(int i = 0; i < len; i++) {
			for(int k = 0; k < this.cards.length; k++) {
				if(this.cards[k] == cards[i]) {
					this.cards[k] = -1;
					break;
				}
			}
		}
		
		// tempCards 로 옮기기
		for(int i = 0; i < this.cards.length; i++) {
			if(this.cards[i] == -1) {
				continue;
			}
			
			tempCards[tempIdx] = this.cards[i];
			tempIdx++;
		}
		
		// 바꿔치기
		this.cards = tempCards;
	}
}
	
class PlayerB {
	int[] bCards;
	String bName;
	
	public PlayerB() {;}
	public PlayerB(String bName, int[] bCards) {
		this.bCards = bCards;
		this.bName = bName;
	}
	
	// 초기화 블럭
	{
		this.bCards = new int[5];
	}
	
	// 상대방 a의 카드 중 모든 홀수를 추출
	int[] getPlayerACards (PlayerA playerA) {
		int[] aCards = playerA.cards;
		int[] tempResult = new int[aCards.length],
				result = null;
		int tempIdx = 0;
		
		for(int i = 0; i < aCards.length; i++) {
			int num = aCards[i];
			if(num % 2 == 1) {
				tempResult[tempIdx] = num;
				tempIdx++;
			}
		}
		// for문이 끝나면tempIdx 는 새롭게 만들 배열의 길이가 됨 (마지막에 1 더해서)
		
		// result 로 옮기기
		result = new int[tempIdx];
		for(int i = 0; i < tempIdx; i++) {
			result[i] = tempResult[i];
		}
		return result;
	}
	
	// 남 에게서 카드를 가져오는 매서드 구현
	void getCardsAndInsert(int[] cards, PlayerA playerA) {
		insertCard(cards);
		playerA.removeCard(cards);
	}
	
	// 카드를 자신의 포켓에 집어넣는 매서드
	void insertCard (int[] cards) {
		int len = cards.length;
		int[] tempCards = new int[this.bCards.length + len];
		int originalCardsLen = this.bCards.length;
		
		for(int i = 0; i < tempCards.length; i++) {
			if(i < originalCardsLen) {
				tempCards[i] = this.bCards[i];
			} else {
				tempCards[i] = cards[i - originalCardsLen];
			}
		}
		this.bCards = tempCards;
	}
	
	// 카드를 포켓에서 제거하는 매서드
	void removeCard (int[] cards) {
		// 몇개를 제거 할 지는 모르기에...
		int len = cards.length, tempIdx = 0;
		int[] tempCards = new int[this.bCards.length - cards.length];
		
		// 먼저 제거 대상 카드를 -1 로 변경
		for(int i = 0; i < len; i++) {
			for(int k = 0; k < this.bCards.length; k++) {
				if(this.bCards[k] == cards[i]) {
					this.bCards[k] = -1;
					break;
				}
			}
		}
		
		// -1을 제외한 나머지 카드를 tempCards 로 옮기기
		for(int i = 0; i < this.bCards.length; i++) {
			if(this.bCards[i] == -1) {
				continue;
			}
			tempCards[tempIdx] = this.bCards[i];
			tempIdx++;
		}
		
		// 바꿔치기
		this.bCards = tempCards;
	}
}

public class ClassTask3 {
   public static void main(String[] args) {
	   ClassTask3 ct = new ClassTask3();
	   PlayerA playerA = new PlayerA("이규학", new int[] {10, 170, 16, 24, 35});
	   PlayerB playerB = new PlayerB("약소훈", new int[] {53, 22, 74, 12, 13});
	   int[] temp = null;
	   
	   System.out.println("게임 시작 전 가진 카드");
	   ct.printArr(playerA.cards);
	   ct.printArr(playerB.bCards);
	   
	   // a 차례
	   System.out.println("플레이어A는 플레이어 B 의 카드를 뽑습니다.");
	   temp = playerA.getPlayerBCard(playerB);
	   playerA.getCardsAndInsert(temp, playerB);
//	   playerA.insertCard(temp);
//	   playerB.removeCard(temp);
	   ct.printArr(playerA.cards);
	   ct.printArr(playerB.bCards);
	   
	   // b 차례
	   System.out.println("플레이어B는 플레이어 A의 카드를 뽑습니다.");
	   temp = playerB.getPlayerACards(playerA);
	   playerB.getCardsAndInsert(temp, playerA);
//	   playerB.insertCard(temp);
//	   playerA.removeCard(temp);
	   ct.printArr(playerA.cards);
	   ct.printArr(playerB.bCards);
	   
	   
//	   최종 결과
	   System.out.println("플레이어A가 가진 카드");
	   ct.printArr(playerA.cards);
	   System.out.println("플레이어B가 가진 카드");
	   ct.printArr(playerB.bCards);
   }
   
// 	배열 출력하는 기능 매서드 (검증용)
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%d" : "%d, ");
			System.out.printf(st, arr[i]);
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
	}
}
