package streamPractice;

import java.util.Collections;
import java.util.stream.Collectors;

public class CodingTest005 {
	public static void main(String[] args) {
		CodingTest005 ct = new CodingTest005();
		String rsp1 = "2",
				rsp2 = "205";
		
		ct.solution(rsp1);
		ct.solution(rsp2);
		
	}
	
	public String solution(String rsp) {
        String answer = "";
        answer = rsp.chars()
        .mapToObj(c -> (char)c)
        .map(c -> winRsp(c))
        .map(String::valueOf)
        .collect(Collectors.joining(""));
        
        return answer;
    }
	
	public char winRsp(char c) {
		char result = ' ';
		switch(c) {
		case '2':
			result = '0';
			break;
		case '0':
			result = '5';
			break;
		case '5':
			result = '2';
			break;
		}
		
		return result;
	}
}
