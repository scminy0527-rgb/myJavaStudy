package codingTest;

import java.util.ArrayList;

public class CodingTest013 {
	public static void main(String[] args) {
		CodingTest013 ct = new CodingTest013();
		int[] arr1 = {1,1,3,3,0,1,1},
				arr2 = {4, 4, 4, 3, 3};
		
		ct.solution(arr1);
		ct.solution(arr2);
	}
	
	public int[] solution(int []arr) {
        int[] answer = null;
        int len = arr.length;
        
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i = 0; i < len; i++) {
        	if(i == 0) {
        		tempList.add(arr[i]);
        		continue;
        	}
        	
        	int num = arr[i];
        	int tempLen = tempList.size();
        	
        	if(num == tempList.get(tempLen - 1)) {
        		continue;
        	} else {
        		tempList.add(num);
        	}
        }
        
//        System.out.println(tempList);
        len = tempList.size();
        answer = new int[len];
        
        for(int i = 0; i < len; i++) {
        	answer[i] = tempList.get(i);
        }

        return answer;
    }
}
