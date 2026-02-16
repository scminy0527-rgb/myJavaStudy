package codingTest;

public class CodingTest001 {
	public static void main(String[] args) {
		CodingTest001 ct = new CodingTest001();
//		문자열의 뒤의 n 글자
//		문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 
//		n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		String my_string = "ProgrammerS123", result = null;
		int n = 11;
		
		result = ct.solution(my_string, n);
		System.out.println(result);
		
	}
	
	public String solution(String my_string, int n) {
        String answer = "";
        int strLen = my_string.length();
        
        for(int i = 0; i < strLen; i++) {
        	char c = my_string.charAt(i);
        	
        	// 뒤의 n 글자 인덱스 정의
        	if(i < strLen - n) {
        		continue;
        	}
        	
        	answer += c;
        }
        return answer;
    }

}
