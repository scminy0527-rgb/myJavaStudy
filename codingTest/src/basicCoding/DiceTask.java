package basicCoding;

public class DiceTask {
	public static void main(String[] args) {
		DiceTask ct = new DiceTask();
//		1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//
//		네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//		세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//		주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//		어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//		네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//		네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		ct.solution(6, 4, 2, 5);
	}
	
	public int solution(int a, int b, int c, int d) {
        int answer = 0,
        		maxCount = 0, minCount = 0,
        		p = 0, q = 0, r = 0;
        
        // 먼저 주사위 나온 번호를 구현 할 2차원 배열을 초기화
        int[][] diceArr = new int[4][6];
        int[] totalDice = new int[6];
        
        diceArr[0][a-1] = 1;
        diceArr[1][b-1] = 1;
        diceArr[2][c-1] = 1;
        diceArr[3][d-1] = 1;
        
        for(int i = 0; i < 4; i++) {
        	for(int k = 0; k < 6; k++) {
        		if(diceArr[i][k] == 1) {
        			totalDice[k] += 1;
        		}
        	}
        }
        printArr(totalDice);
        
        // 여기서 totalDice 의 최소 최대를 가지고 어떠한 경우인지 판단을 해야 함
        // 최대 4 / 3/ 2 / 1
        maxCount = 1;
        minCount = 4;
        for(int i = 0; i < totalDice.length; i++) {
        	int count = totalDice[i];
        	maxCount = (count > maxCount && count > 0) ? count : maxCount;
        	minCount = (count < minCount && count > 0) ? count : minCount;
        }
        
        System.out.printf("최대 갯수: %d // 최소 갯수: %d\n",maxCount, minCount);
        // 최대가 4 일 때는 별도로 처리
        
        switch(maxCount) {
        case 4:
        	// 해당 인덱스 찾아서 숫자로 변환 해서 계산
        	int idx = getIndex(totalDice, maxCount);
        	answer = 1111 * (idx + 1);
        	System.out.println("네 주사위가 모두 같은 경우: " + answer);
        	break;
        case 3:
        	p = getIndex(totalDice, maxCount) + 1;
        	q = getIndex(totalDice, minCount) + 1;
        	answer = (10 * p + q) * (10 * p + q);
        	System.out.println("세 주사위가 모두 같은 경우: " + answer);
        	break;
        case 2:
        	// 여기선 두가지 경우가 있음
        	if(minCount == 2) {
        		p = getIndex(totalDice, maxCount) + 1;
        		q = getReverseIndex(totalDice, minCount) + 1;
        		
        		int abs = (p - q) > 0 ? p - q : q - p;
        		answer = (p + q) * abs;
        		System.out.println("2-1 경우: " + answer);
        	} else if (minCount == 1) {
        		q = getIndex(totalDice, minCount) + 1;
        		r = getReverseIndex(totalDice, minCount) + 1;
        		answer = q * r;
        		System.out.println("2-2 경우: " + answer);
        	}
        	break;
        case 1:
        	// 가장 작은거 구하기
        	for(int i = 0; i < totalDice.length; i++) {
        		if(totalDice[i] == 1) {
        			answer = i + 1;
        			break;
        		}
        	}
        	System.out.println("1 경우: " + answer);
        	
        	break;
        }
        
        return answer;
    }
	
	// 배열에서 특정 원소의 인덱스를 반환 해주는 함수를 정의해보기
	int getIndex(int[] arr, int num) {
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				idx = i;
			}
		}
		return idx;
	}
	
	// 거꾸로 해서 찾는 개념
	int getReverseIndex(int[] arr, int num) {
		int idx = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == num) {
				idx = i;
			}
		}
		return idx;
	}
	
	// 배열 출력하는 기능 매서드
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%d" : "%d, ");
			System.out.printf(st, arr[i]);
		}
		System.out.print("]");
	}
}
