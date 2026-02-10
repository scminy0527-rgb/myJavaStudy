package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
// 		(심화)      
//     "0.12346", "0.5130", "78", "9.133";
//     4개 값을 더해서 123456789를 출력하기
//	   변수 선언 및 초기화 (tempNum 에 1에 해당하는 값 넣어서 처리)
	   String strNum1 = "0.12346", strNum2 = "0.5130", strNum3 = "78", strNum4 = "9.133";
	   int num1 = 0, tempNum1 = 0, num2 = 0, num4 = 0;
	   String result = "";
	   
//	   형 변환
	   tempNum1 = (int)(Double.parseDouble(strNum1) * 10);	// 1
	   num1 = (int)(Double.parseDouble(strNum1)*100000 - tempNum1);	// 12345
	   num2 = (int)(Double.parseDouble(strNum2)*10 + tempNum1);		// 6
	   num4 = (int)(Double.parseDouble(strNum4));					// 9
	   
//	   indexOf 도 사용 가능
	   int temp = strNum1.indexOf("6");
	   System.out.println(temp);
	   
//	   최종 결과 만들기
//	   result = changedNum1 + changedNum2 + strNum3 + changedNum4;
	   result = "" + num1 +num2 + strNum3 + num4;
	   System.out.println(result);
   }
}
