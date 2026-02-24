package codingTest;

public class CodingTest006 {
	public static void main(String[] args) {
		CodingTest006 ct = new CodingTest006();
		
		String s1 = "3people unFollowed me";
		String s2 = "for the la4t week";
		String s3 = " test  kick  ";
		System.out.println(ct.solution(s1+"."));
		System.out.println(ct.solution(s2+"."));
		System.out.println(ct.solution(s3+"."));
	}
	
	public String solution(String s) {
        String answer = "", temp = s.toLowerCase();
        int len = s.length();
        
//      각각 돌기
//        첫 문자열 더하기
        answer += changaToCapital(temp.charAt(0));
        for(int i = 1; i < len; i++) {
        	char c = temp.charAt(i);
        	if(s.charAt(i - 1) == ' ') {
        		answer += changaToCapital(c);
        		continue;
        	}
        	answer += c;
        }
        
        return answer;
    }
    
    // 소문자 일 때만 대문자로 변환
    char changaToCapital(char c){
        char result = ' ';
        int gap = 'A' - 'a';
        if(c >= 'a' && c <= 'z'){
            result = (char)(c + gap);
        } else {
            result = c;
        }
        return result;
    }
}
