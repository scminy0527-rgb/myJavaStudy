package lambdaTask2;

public class LambdaTask2 {
	public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
      
//      출력 예시
//      "abcabc"
		PrintJump pj = (str, idx) -> {
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				if((i + 1) % idx == 0) {
					continue;
				}
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println(pj.jumpString("abcdabcd", 4));
      
//      2) 문자열과 문자형을 전달하면 찾은 문자열의 총 갯수에 해당 인덱스에 해당하는 글자를 반환(리턴) 메서드
//      없을 시 -1
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
		
		FindChar fc = (str, c) -> {
			String result = null;
			int count = 0;
			for(char wc : str.toCharArray()) {
				if(wc == c) {
					count++;
				}
			}
			result = count == 0 ? result = "" + -1 : "" + str.charAt(count);
			return result;
		};
		System.out.println(fc.findChar("abcdabcd", 'a'));
      
//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
      
//      출력 예시
//      "가나다라마바사"
		RemoveDup rd = new RemoveDup() {
			@Override
			public String removeDuplication(String str) {
				String result = "";
				for(char c : str.toCharArray()) {
//					해당 문자가 result 에 없을 때에만 넣기
					if(result.contains("" + c)) continue;
					result += c;
				}
				return result;
			}
		};
		System.out.println(rd.removeDuplication("가나다라마바사가나다라가나다"));
		
      
//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"
      
//      출력 예시
//      "987654321"
		Reverse rs = (str) -> {
			String result = "";
			int len = str.length();
			for(int i = 0; i < len; i++) {
				result += str.charAt(len - i - 1);
			}
			return result;
		};
		
		System.out.println(rs.reverseStr("123456789"));
	}
}
