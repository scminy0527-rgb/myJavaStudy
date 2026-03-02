package codingTest;

public class CodingTest010 {
	public static void main(String[] args) {
		CodingTest010 ct = new CodingTest010();
		int n1 = 15;
		System.out.println(ct.solution(n1));
	}
	
	public int solution(int n) {
        int answer = 0, temp = 0;
        int limit = n / 2;
        
//      자기 자신 추가
//        자기 자신 추가
        answer++;
        
        for(int i = 1; i <= limit; i++) {
        	temp = 0;
        	int firstNum = i;
        	while(true) {
//        		System.out.println("firstNum: " + firstNum);
        		temp += firstNum;
        		if(temp >= n) {
        			int result = temp == n ? 1 : 0;
        			answer += result;
        			break;
        		}
        		firstNum++;
        	}
        }
        
        return answer;
    }

}
