package streamTask;

import java.util.stream.Collectors;

public class StreamTask05 {
	public static void main(String[] args) {
		StreamTask05 st = new StreamTask05(); 
		String myString1 = "ABBAA", pat1 = "AABB";
		System.out.println(st.solution(myString1, pat1));
	}
	
	public int solution(String myString, String pat) {
        int answer = 0;
        String changedStr = myString.chars()
        		.mapToObj(c -> "" + (char)c)
        		.map(c -> {
        			if(c.equals("A")) {
        				return String.valueOf("B");
        			} else if(c.equals("B")) {
        				return String.valueOf("A");
        			}
        			return c;
        		}).collect(Collectors.joining(""));
        
        System.out.println(changedStr);
        answer = changedStr.contains(pat) ? 1 : 0;
        
        return answer;
    }
}
