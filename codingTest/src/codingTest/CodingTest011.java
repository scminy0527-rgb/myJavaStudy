package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest011 {
	public static void main(String[] args) {
		CodingTest011 ct = new CodingTest011();
		int[] numbers1 = {1, 2, -3, 4, -5};
		System.out.println(ct.solution(numbers1));
		
	}
	
	public int solution(int[] numbers) {
        int answer = 0, len = numbers.length;
        int positiveResult = 0, negativeResult = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for(int num : numbers) {
        	numList.add(num);
        }
        
        numList.sort((a,b) -> b - a);
        System.out.println(numList);
        positiveResult = numList.get(0) * numList.get(1);
        negativeResult = numList.get(len - 1)* numList.get(len - 2);
        
        answer = positiveResult > negativeResult ? positiveResult : negativeResult;
         
        return answer;
    }
}
