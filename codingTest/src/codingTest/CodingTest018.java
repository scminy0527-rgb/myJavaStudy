package codingTest;

public class CodingTest018 {
	public static void main(String[] args) {
		CodingTest018 ct = new CodingTest018();
		String numbers1 = "onetwothreefourfivesixseveneightnine",
				numbers2 = "onefourzerosixseven";
		
		ct.solution(numbers1);
		ct.solution(numbers2);
	}
	
	public long solution(String numbers) {
        long answer = 0;
        String temp = numbers;
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numStr.length; i++) {
        	temp = temp.replaceAll(numStr[i], "" + i);
        }
        answer = Long.parseLong(temp);
        
        return answer;
    }
}
