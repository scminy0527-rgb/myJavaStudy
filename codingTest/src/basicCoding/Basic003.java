package basicCoding;

public class Basic003 {
	public static void main(String[] args) {
		Basic003 ct = new Basic003();
//		정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 
//		오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//		만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
		int l = 10;
		int r = 20;
		int[] result = null;
		
		// 검증
		result = ct.solution(l, r);
		ct.printArr(result);
		
		
		
	}
	
	public int[] solution(int l, int r) {
        int[] answer = null;
        String[] strNumArr = null;
        String tempResult = "";
        int count = 0;
        boolean start = false;
//        5 50 55 500 505 550 555
//        1 10 11 100 101 110 111
        
        for(int i = l; i <= r; i++) {
        	// 해당 숫자가 5 혹은 0 으로만 이루어진 여부를 판단
        	String numStr = "" + i;
        	boolean isFive = true;
        	for(int k = 0; k < numStr.length(); k++) {
        		char c = numStr.charAt(k);
        		int cc = Integer.parseInt("" + c);
        		if(cc % 5 != 0) {
        			isFive = false;
        			break;
        		}
        	}
        	
        	if(isFive) {
//        		System.out.println(i);
        		count++;
        		if(start) {
        			tempResult = tempResult + "," + i;
        		} else {
        			tempResult += i;
        			start = true;
        		}
        	}
        	
        }
        
//        System.out.println(tempResult);
        if(count > 0) {
        	strNumArr = tempResult.split(",");
        	answer = new int[strNumArr.length];
        	for(int i = 0; i < strNumArr.length && strNumArr.length != 0; i++) {
        		answer[i] = Integer.parseInt(strNumArr[i]);
        	}
        }
        
        if(count == 0) {
        	int[] temp = new int[1];
        	temp[0] = -1;
        	return temp;
        }
        
        
        return answer;
    }
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+i);
		}
		System.out.println();
	}

}


