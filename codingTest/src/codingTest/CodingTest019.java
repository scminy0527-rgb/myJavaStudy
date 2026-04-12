package codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest019 {
	public static void main(String[] args) {
		CodingTest019 ct = new CodingTest019();
		int[] arr = {1, 2, 3, 100, 99, 98};
		ct.solution(arr);
	}
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> numList = Arrays.stream(arr)
        		.boxed()
        		.map(n -> numMapper(n))
        		.collect(Collectors.toList());
        
        answer = numList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
	
	public int numMapper(int num) {
		if(num >= 50 && num % 2 == 0) {
			return num /= 2;
		}
		
		if(num < 50 && num % 2 == 1) {
			return num *= 2;
		}
		
		return num;
	}
}
