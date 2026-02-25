package lambdaTask1;

public class LambdaTask1 {
	public static void main(String[] args) {
		String result2 = null;
//      1~10까지 출력해주는 메서드
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 
		PrintNum printNum = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		};
		
//		두번째 매서드 정의
		ChangeStr cs = (str, c, idx) -> {
			String result = "";
			int len = str.length();
			for(int i = 0; i < len; i++) {
				if(i == idx) {
					result += c;
					continue;
				}
				result += str.charAt(i);
			}
			return result;
		};
		
//		실행 부분
		printNum.printNum();
		result2 = cs.changeStr("이규혁", '학', 2);
		System.out.println(result2);
	}
}
