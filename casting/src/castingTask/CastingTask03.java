package castingTask;

public class CastingTask03 {
   public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
//	   변수 선언 및 초기화
	   char a = 'a', j = 'j', k = 'k';
	   char largeA = ' ', largeJ = ' ', largeK = ' ';
	   int gap = -('a' - 'A');
	   String segment = null;
	   String result = null;
	   
//	   연산
	   largeA = (char)(a + gap);
	   largeJ = (char)(j + gap);
	   largeK = (char)(k + gap);
	   
//	   최종 결과
	   segment = "%c -> %c";
	   result = segment + ',' + segment + ','+ segment;
	   System.out.printf(result, a, largeA, j, largeJ, k, largeK);
   }
}
