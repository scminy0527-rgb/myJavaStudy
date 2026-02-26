package lambdaTask4;

public class LambdaTask4 {
//  1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//  입력 예시)
//  3
//  출력 예시)
//  3 x 1 = 3
//  ...
//  3 x 9 = 27
  
//  2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//  입력 예시1)
//  10, 20, "+"
//  
//  출력 예시1)
//  30
  
//  입력 예시2)
//  10, 20, "-"
//  
//  출력 예시2)
//  -10
  
  
//  3. 배열에 10개의 무작위 정수를 전달하면,
//  큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//  입력 예시)
//  {10, 3, 7, 8, 0, 9}
  
//  출력 예시)
//  {10, 9, 8, 7, 3, 0}
	public static void main(String[] args) {
		LambdaTask4 lt = new LambdaTask4();
		Gugudan gd = (num) -> {
			for(int i = 0; i < 9; i++) {
				System.out.printf("%d x %d = %d\n", num, i + 1, num * (i + 1));
			}
		};
		
		gd.printGugudan(3);
		
		SortArr sa = (int[] arr) -> {
			int[] result = null;
			int len = arr.length;
			if(len == 1) {
				return arr;
			}
			
			result = new int[len];
			for(int i = 0; i < len; i++) {
				result[i] = arr[i];
			}
			
			for(int i = 0; i < len - 1; i++) {
				int min = result[i];
				int idx = i, temp = 0;
				for(int j = 1; j + i < len; j++) {
					int num = result[j + i];
					if(num > min) {
						min = num;
						idx = j + i;
					}
				}
				temp = result[i];
				result[i] = min;
				result[idx] = temp;
			}
			return result;
		};
		
		lt.printArr(sa.sortArr(new int[] {10, 3, 7, 8, 0, 9, 7, 98, -44, 55}));
	}
	
	// 배열 출력하는 기능 매서드
	void printArr(int[] arr) {
		System.out.println("검증 실행");
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			String st = (i == arr.length - 1 ? "%d" : "%d, ");
			System.out.printf(st, arr[i]);
		}
		System.out.print("]");
	}

}
