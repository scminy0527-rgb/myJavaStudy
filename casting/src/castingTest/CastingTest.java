package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		자동 형변환
//		정수 + 정수 = 정수
//		정수끼리 연산 하면 정수가 나오는걸로 기대
		System.out.println(1 + 2);
		System.out.println(10 / 3);
		
//		정수 + 실수 = 실수 (double)
		System.out.println(2 + 0.5);
		System.out.println(5.0 / 2);
		
//		강제 형변환 (일반적으로 소수점 뒤 자리는 버림)
//		값 앞에다가 바꾸고 싶은 타입 적기
		System.out.println((int)8.9999);
		
//		두 결과를 가지고 10 만들기
		System.out.println((int)8.6 + (int)2.5);
	}
}
