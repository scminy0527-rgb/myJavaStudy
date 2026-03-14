package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest016 {
	public static void main(String[] args) {
		CodingTest016 ct = new CodingTest016();
		String my_string1 = "i    love  you",
				my_string2 = "    programmers  ";
		
		ct.solution(my_string1);
		ct.solution(my_string2);
		
	}
	
	public String[] solution(String my_string) {
        String[] answer = null;
        String[] strArr = null;
        List<String> strList = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        
        strArr = my_string.split(" ");
        strList = Arrays.asList(strArr);
        
        
        result = strList.stream()
        .filter(str -> !str.equals(""))
        .collect(Collectors.toList());
        
//        System.out.println(result);
        answer = result.stream().toArray(String[]::new);

        for(String str : answer) {
        	System.out.println(str);
        }
        
        
        return answer;
    }
	
	
}
