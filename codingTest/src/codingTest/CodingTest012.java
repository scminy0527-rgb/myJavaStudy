package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest012 {
	public static void main(String[] args) {
		CodingTest012 ct = new CodingTest012();
		ct.solution(144);
	}
	
	public int[] solution(int n) {
        int[] answer = null;
        int len = 0;
        
        int sqrt = (int)Math.sqrt(n);
        ArrayList<Integer> yaksuList = new ArrayList<Integer>();
        List<Integer> finalList = new ArrayList<Integer>();
        
        for(int i = 1; i <= sqrt; i++) {
        	if(n % i == 0) {
        		yaksuList.add(i);
        		yaksuList.add(n / i);
        	}
        }
        
        finalList = yaksuList.stream().distinct().collect(Collectors.toList());
        finalList.sort(null);
        len = finalList.size();
        answer = new int[len];
        
        for(int i = 0; i < len; i++) {
        	answer[i] = finalList.get(i);
        }
        
        return answer;
    }
}
