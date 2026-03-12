package codingTest;

public class CodingTest014 {
	public static void main(String[] args) {
		CodingTest014 ct = new CodingTest014();
		int[] numList = {12, 4, 15, 1, 14};
		
		System.out.println(ct.solution(numList));
		
	}
	
	public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){
            int num = num_list[i];
            System.out.println("while 들어가기 전: " + num);
            
            if(num == 1) continue;
            
            while(true){
            	System.out.println("num: " + num);
            	System.out.println("i: " + i);
                if(num % 2 == 0){
                    num = num / 2;
                }else{
                    num = (num - 1) / 2;
                }
                answer++;
                
                if(num == 1)break;
            }
        }
        
        return answer;
    }
}
