package codingTest;

import java.util.ArrayList;

public class CodingTest008 {
	public static void main(String[] args) {
		CodingTest008 ct = new CodingTest008();
		String my_string1 = "banana", my_string2 = "programmers";
		ct.solution(my_string1);
		ct.solution(my_string2);
		
	}
	public String[] solution(String my_string) {
        String[] answer = null;
        String temp = "";
        int len = my_string.length(), listLen = 0;
        ArrayList<String> tempList = new ArrayList<String>();
        
//      일단 담기
        for(int i = 0; i < len; i++) {
        	for(int j = 0; i + j < len; j++) {
        		int idx = i + j;
//        		System.out.print(idx + " ");
        		char c = my_string.charAt(idx);
        		temp += c;
        	}
//        	System.out.println(temp);
        	tempList.add(temp);
        	temp = "";
        }
        tempList.sort(null);
//        System.out.println(tempList);
        listLen = tempList.size();
        answer = new String[listLen];
        for(int i = 0; i < listLen; i++) {
        	answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}
