package lambdaTask3;

public class LambdaTask3 {
//  1. 전달한 글자가 등장하는 거리 구하기
//  입력예시
//  "abcdababefda", "a"
//
//  출력예시
//  "3 -> 1 -> 4"
//  만약 중복된 글자가 없어 거리를 찾지 못하면
//  "-1"
//
//  2. 스파이가 남긴 암호를 해독하시오.
//  주어진 소문자(a~z) 범위라 가정한다.
//  주어진 암호를 원래 문자열을 복원하시오.
//
//  "1051081111181011069711897"
	public static void main(String[] args) {
		LambdaTask3 lt = new LambdaTask3();
		CheckDistance cd = (str, find) -> {
			String[] temp = null;
			int tempLen = 0, findCount = 0;
			boolean isStart = false;
//			먼저 find 를 찾으면 거리 측정 시작하기
			
//			split 을 이용?
			temp = str.split(find);
			tempLen = temp.length;
			
//			lt.printArr(temp);
//			lt.printLen(temp);
			System.out.println();
			
//			1. split 된 가장 첫번째 원소는 고려 안함
//			2. split 된 리스트 중 두번째 원소 부터 마지막 원소까지의 총 길이 판단
//			3. 꼬리 부분에 aaaaa 라고 나오는 예외 처리를 마무리
//			abcdababefdaa 라고 넣으면 3 -> 1 -> 4 -> 0 이 나와야 함
//			뒤에서 부터 find 가 몇 개인지 세기
			for(int i = 0; i < str.length(); i++) {
				int idx = str.length() - 1 - i;
				char c = str.charAt(idx);
				if(("" + c).equals(find)) {
					findCount++;
				} else {
					break;
				}
			}
			
//			출력
			for(int i = 1; i < tempLen; i++) {
				isStart = true;
				int distance = temp[i].length();
				if(i == tempLen - 1 && findCount == 0)break;
				System.out.print(distance + " ");
				if(i == tempLen - 1) break;
				
				if(i == tempLen - 2 && findCount == 0)break;
				System.out.print("-> ");
			}
			
			if(isStart && findCount > 1) {
				System.out.print("-> ");
			}
			
//			만약 findCount 가 1 보다 크다면 꼬리 처리
			if(findCount > 1) {
				for(int i = 0; i < findCount - 1; i++) {
					System.out.print("0");
					if(i == findCount - 2) break;
					System.out.print(" -> ");
				}
			}
			
//			만약 없다면 -1 출력
			if(!isStart) {
				System.out.println(-1);
			}
			System.out.println();
		};
		cd.checkDistance("abcdababefda", "a");
		
//		2번에 필요한 부수 기능 정의
		CheckType checkType = (c) -> {
			int type = 0;
			switch(c) {
			case '9':
				type = 2;
				break;
			case '1':
				type = 3;
				break;
			default:
				type = 3;
				break;
			}
			
			return type;
		};
		
//		2번 정의 
		Solve solve = (str) -> {
			String result = "", temp = "";
			int strLen = str.length(),
					standard = 0, count = 0;
			
//			범위: 97 ~ 122
//			만약 문자열을 맞닥뜨렸을 때 첫 숫자가 1 이면 세자리
//			9 라면 2자리 정수
			
			standard = checkType.checkType(str.charAt(0));
			for(int i = 0; i < strLen; i++) {
				temp += str.charAt(i);
				count++;
				
				if(standard == count) {
//					System.out.println(temp);
					int aski = Integer.parseInt(temp);
					result += (char)aski;
					temp = "";
					count = 0;
					
					if(i == strLen - 1) break;
					standard = checkType.checkType(str.charAt(i + 1));
				}
			}
			return result;
		};
		System.out.println(solve.resolve("1051081111181011069711897"));
	}
	
//	검증용 메서드
	// 배열 출력하는 기능 매서드
	void printArr(String[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%s" : "%s, ");
			System.out.printf(st, arr[i]);
		}
		System.out.print("]");
	}
	
	void printLen(String[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%d" : "%d, ");
			System.out.printf(st, arr[i].length());
		}
		System.out.print("]");
	}
}
