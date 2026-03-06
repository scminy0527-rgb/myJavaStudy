package streamPractice;

import java.util.stream.Collectors;

public class CodingTest001 {
	public static void main(String[] args) {
		CodingTest001 ct = new CodingTest001();
		String before1 = "olleh", after1 = "hello";
		ct.solution(before1, after1);
	}
	
	public int solution(String before, String after) {
        
        String newBefore = before.chars().sorted().mapToObj(c -> "" + (char)c).collect(Collectors.joining(""));
        String newAfter = after.chars().sorted().mapToObj(c -> "" + (char)c).collect(Collectors.joining(""));
        
        
        return newBefore.equals(newAfter) ? 1 : 0;
    }
}
