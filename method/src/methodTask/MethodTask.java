package methodTask;

import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
		int n = 0, totalNum = 0;
//      1. 1~10까지 출력하는 메서드
		mt.printNum();
		
		System.out.println("================");
		
//      2. 1~n까지의 합을 반환해주는 메서드
		System.out.println("1~n 까지 합을 구할 때 원하는 n 을 입력하세요 ex) 10");
		n = sc.nextInt();
		
		totalNum = mt.sumNumbers(n);
		System.out.println(totalNum);
	}
	
//	각종 하위 메서드 만들기
//	
	void printNum() {
		System.out.println("1~10 숫자 출력");
		for(int i = 0; i < 10; i++) {
			int num = i + 1;
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	int sumNumbers(int n) {
//		혹시라도 1 아래 숫자가 나오는거 관련해서 예외
		if(n < 1) {
			System.out.println("1 이상의 숫자를 넣으셔야 합니다.");
			return -1;
		}
		
		System.out.printf("1부터 %d 까지 합 구하기\n", n);
		int total = 0;
		for(int i = 0; i < n; i++) {
			int num = i + 1;
			total += num;
		}
		return total;
	}

}
