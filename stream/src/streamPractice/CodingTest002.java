package streamPractice;

import java.util.ArrayList;

public class CodingTest002 {
	public static void main(String[] args) {
		CodingTest002 ct = new CodingTest002();
		int[] arr1 = {293, 1000, 395, 678, 94},
				delete_list1 = {94, 777, 104, 1000, 1, 12};
		
		ct.solution(arr1, delete_list1);
		
	}
	
	public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = null;
        int len = 0;
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<Integer> delList = new ArrayList<Integer>();
        
        for(int num : arr) {
        	arrList.add(num);
        }
        
        for(int num : delete_list) {
        	delList.add(num);
        }
        
        delList.stream()
        .forEach(arrList::remove);
        
        len = arrList.size();
        answer = new int[len];
        for(int i = 0; i < len; i++) {
        	answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}
