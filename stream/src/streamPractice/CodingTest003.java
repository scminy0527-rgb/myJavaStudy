package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest003 {
	public static void main(String[] args) {
		CodingTest003 ct = new CodingTest003();
		int[] arr1 = {5, 9, 7, 10},
				arr2 = {2, 36, 1, 3},
				arr3 = {3, 2, 6};
		
		int divisor1 = 5, divisor2 = 1, divisor3 = 10;
		
		ct.solution(arr1, divisor1);
		ct.solution(arr2, divisor2);
		ct.solution(arr3, divisor3);
	}
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = null;
        int len = 0;
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();
        for(int num : arr) {
        	arrList.add(num);
        }
        
        resultList = arrList.stream()
        .filter(n -> n % divisor == 0)
        .collect(Collectors.toList());
//        .forEach(System.out::println);
        
        resultList.sort(null);
        len = resultList.size();
        
        if(len == 0) return new int[] {-1};
        answer = new int[len];
        for(int i = 0; i < len; i++) {
        	answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
