package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest017 {
	public static void main(String[] args) {
		CodingTest017 ct = new CodingTest017();
		int i1 = 1, i2 = 10, i3 = 3;
		int j1 = 13, j2 = 50, j3 = 10;
		int k1 = 1, k2 = 5, k3 = 2;
		
		System.out.println(ct.solution(i1, j1, k1));
		System.out.println(ct.solution(i2, j2, k2));
		System.out.println(ct.solution(i3, j3, k3));
	}
	
	public int solution(int i, int j, int k) {
        int answer = 0;
        
        answer = IntStream.rangeClosed(i, j)
        .mapToObj(String::valueOf)
        .mapToInt(st -> countNum(st, k))
        .sum();
        
        return answer;
    }
	
//	문자열 에서 특정 숫자 갯수를 세는거
	public int countNum(String str, int k) {
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str.split("")));
		int count =  strList.stream()
		.filter(s -> s.equals("" + k))
		.collect(Collectors.toList())
		.size();
		
		return count;
	}
}
