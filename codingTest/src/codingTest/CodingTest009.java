package codingTest;

import java.util.ArrayList;

public class CodingTest009 {
	public static void main(String[] args) {
		CodingTest009 ct = new CodingTest009();
		int n1 = 4;
		int[] slicer1 = {1, 5, 2};
		int[] new_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		ct.solution(n1, slicer1, new_list);
	}
	
	public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int a = slicer[0], b = slicer[1], c = slicer[2], len = 0;
        
        switch(n) {
        case 1:
        	for(int i = 0; i <= b ; i++) {
        		result.add(num_list[i]);
        	}
        	break;
        case 2:
        	for(int i = a; i < num_list.length; i++) {
        		result.add(num_list[i]);
        	}
        	break;
        case 3:
        	for(int i = a; i <= b; i++) {
        		result.add(num_list[i]);
        	}
        	break;
        case 4:
        	for(int i = 0; a + c*i <= b; i++) {
        		int idx = a + c*i;
        		result.add(num_list[idx]);
        	}
        	break;
        default:
        	break;
        }
        System.out.println(result);
        
//        ArrayList 를 int[]로
        len = result.size();
        answer = new int[len];
        for(int i = 0; i < len; i++) {
        	answer[i] = result.get(i);
        }
        
        return answer;
    }
}
