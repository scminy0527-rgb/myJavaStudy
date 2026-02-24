package codingTest;

public class CodingTest007 {
	public static void main(String[] args) {
		CodingTest007 ct = new CodingTest007();
		String s1 = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";
	}
//	키: 왼쪽 오른쪽 이 ( ) 인지 보기
	
	boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        answer = (s.charAt(0) == '(' && s.charAt(len - 1) == ')');

        return answer;
    }
}
