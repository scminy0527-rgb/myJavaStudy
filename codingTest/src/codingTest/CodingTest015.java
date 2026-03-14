package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest015 {
	public static void main(String[] args) {
		CodingTest015 ct = new CodingTest015();
		
		String myString1 = "oxooxoxxox";
		String myString2 = "xabcxdefxghi";
		
		ct.solution(myString1);
		ct.solution(myString2);
		
	}
	
	public int[] solution(String myString) {
		int len = myString.length();
        int[] answer = null;
        String[] charArr = null;
        List<Integer> charCount = new ArrayList<Integer>();
        
        charArr = myString.split("x");
        ArrayList<String> charList = new ArrayList<String>(Arrays.asList(charArr));
        
//      엣지 케이스
//      1. 맨 끝이 x 로 끝나는 경우에는 그냥 0을 추가해주기
        charCount = charList.stream()
        .map(str -> str.length())
        .collect(Collectors.toList());
        
        if(myString.charAt(len - 1) == 'x') {
        	charCount.add(0);
        }
        
//        System.out.println(charCount);
        answer = charCount.stream()
        		.mapToInt(Integer::intValue)
        		.toArray();
        
        return answer;
    }
}
