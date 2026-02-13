package methodTask;

public class MethodTask03 {
	public static void main(String[] args) {
		MethodTask03 mt = new MethodTask03();
//		단 반드시 배열을 사용해야함
//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
		String str = "일공이사", firstResult = null,
				intStr = "0058", secondResult = null;
		String[] strArr = str.split(""), intArr = null;
		int[] lotto = null;
		
		mt.changeStrToInt(strArr);
//		mt.printArr(strArr);
		firstResult = mt.makeStrByArr(strArr);
		System.out.println("1번 결과: "+firstResult);
		
//      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
		intArr = intStr.split("");
//		mt.printArr(intArr);
		mt.changeIntToHangel(intArr);
//		mt.printArr(intArr);
		secondResult = mt.makeStrByArr(intArr);
		System.out.println("2번 결과: "+secondResult);
		
//      번외 로또 추첨하기
//      로또 번호 6개를 배열에 담아서 결과를 반환해주는 메서드
		lotto = mt.makeLottoNum();
		System.out.println("로또 번호");
		mt.printIntArr(lotto);
	}
	
//	배열의 원소들을 하나의 문자열로 합쳐서 반환하는 함수
	String makeStrByArr(String[] arr) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void printIntArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
//	한글로 된 배열을 정수로 바꿔주는거 (주소로 접근해서 값 변경)
	void changeStrToInt(String[] arr) {
		String word = "공일이삼사오육칠팔구";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(word.indexOf(arr[i]));
		}
	}
	
//	정수로 된 배열을 한글로 바꾸기
	void changeIntToHangel(String[] arr) {
		String word = "공일이삼사오육칠팔구";
		for(int i = 0; i < arr.length; i++) {
			int idx = Integer.parseInt(arr[i]);
//			System.out.println("프린트");
//			System.out.println(word.charAt(idx));
			arr[i] = "" + word.charAt(idx);
		}
	}
	
//	로또 만들어주는 함수
	int[] makeLottoNum() {
//		똑같은 수가 여러번 나오는 거도 감안 해야 함
		int[] lottoArr = new int[6];
		int index = 0;
		
		while(true) {
//			만약 index 가 arr 길이 값이랑 동일해 지면 중단
			if(index == lottoArr.length) {
				break;
			}
			
//			로또 번호는 1 부터 45까지
			int lottoNum = (int)Math.floor(Math.random()*44 + 1);
			
//			랜덤 특성 상 나온 숫자가 나올 수 있음
//			따라서 lottoArr 에 현재 만들어진 lottoNum 가 있나 확인 필요
			if(checkSameNum(lottoArr, lottoNum)) {
				continue;
			}
			
//			이상 없으면 배열에 담기
			lottoArr[index] = lottoNum;
			index++;
		}
		
//		다 만들어지면 반환
		return lottoArr;
	}
	
//	리스트에 해당 숫자가 있는지 확인 하는 매서드
	boolean checkSameNum(int[] arr, int num) {
		boolean isIn = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				isIn = true;
				break;
			}
		}
		return isIn;
	}
}
