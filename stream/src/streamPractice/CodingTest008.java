package streamPractice;

import java.util.stream.IntStream;

public class CodingTest008 {
	public static void main(String[] args) {
		CodingTest008 ct = new CodingTest008();
		
		int n1 = 10, n2 = 15;
		
//		System.out.println(ct.solution(n1));
		System.out.println(ct.solution(n2));
		
	}
	
	public int solution(int n) {
        int answer = 0;
        
//      검증용
        IntStream.rangeClosed(1, n)
        .filter(num -> isHapSeongSu(num))
        .forEach(System.out::println);
        
        answer = IntStream.rangeClosed(1, n)
        .filter(num -> isHapSeongSu(num))
        .map(num1 -> 1)
        .sum();
        
        return answer;
    }
	
	public boolean isHapSeongSu(int num) {
		boolean result = false;
		int sqrtInt = 0;
		if(num < 4) return false;
		
//		소수의 갯수를 구하기 제곱근 이용
		sqrtInt = (int)Math.sqrt(num);
		for(int i = 2; i <= sqrtInt; i++) {
			if(num % i == 0) return true;
		}
		
		return result;
	}
}
