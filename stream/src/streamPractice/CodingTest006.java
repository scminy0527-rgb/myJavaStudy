package streamPractice;

import java.util.ArrayList;

public class CodingTest006 {
	public static void main(String[] args) {
		CodingTest006 ct = new CodingTest006();
		
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		ct.solution(arr, flag);
	}
	
	public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = null;
        int len = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < len; i++) {
        	int num = arr[i];
        	if(flag[i]) {
        		for(int j = 0; j < num * 2; j++) result.add(num);
        	} else {
        		for(int j = 0; j < num; j++) result.remove(result.size() - 1);
        	}
        }
        
        answer = result.stream().mapToInt(n -> n).toArray();
        return answer;
    }
}
