package streamPractice;

import java.util.stream.Collectors;

public class CodingTest004 {
	public static void main(String[] args) {
		CodingTest004 ct = new CodingTest004();
		
		String s = "Zbdcefg";
		ct.solution(s);
	}
	
	public String solution(String s) {
        String answer = "";
        String temp = s.chars().sorted()
        .mapToObj(c -> (char)c)
        .map(String::valueOf)
        .collect(Collectors.joining(""));
        
        answer = new StringBuilder(temp).reverse().toString();
        
        return answer;
    }
}
