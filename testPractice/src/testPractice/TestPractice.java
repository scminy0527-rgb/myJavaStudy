package testPractice;

public class TestPractice {
	public static void main(String[] args) {
		int total = 0;
		int[] arr = new int[] {1, 2, 3, 4, 5};
//		빠른 for문
		for(int num : arr) {
			System.out.println(num);
			total += num;
		}
		
		System.out.println(total);
	}
}
