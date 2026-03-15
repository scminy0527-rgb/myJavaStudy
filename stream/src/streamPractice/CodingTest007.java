package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest007 {
	public static void main(String[] args) {
		CodingTest007 ct = new CodingTest007();
		
		String myString1 = "axbxcxdx",
				myString2 = "dxccxbbbxaaaa";
		
		System.out.println(ct.solution(myString1));
		System.out.println(ct.solution(myString2));
	}
	
	public String[] solution(String myString) {
        String[] answer = null;
        
        List<String> strList = new ArrayList<String>(Arrays.asList(myString.split("x")));
        strList = strList.stream()
        		.filter(str -> !str.isEmpty())
        		.collect(Collectors.toList());
        strList.sort(null);
        answer = strList.stream().toArray(String[]::new);
        
        return answer;
    }
}
