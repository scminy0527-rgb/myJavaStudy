package operTask;

import java.util.Scanner;

public class OperTask02 {
   public static void main(String[] args) {
//      삼항 연산자
//      각각 사용자에게 동물을 입력 받고,
//      해당 동물에 해당되는 메세지를 출력하세요.
//      운명의 동물 찾기
//      사용자가 입력한 값에 따라 다른 결과를 출력하시오.
//      1. 고양이
//      고양이를 좋아하는 당신은 대훈이의 러버입니다.
      
//      2. 소
//      소를 좋아하는 당신은 세종이의 단짝입니다.
      
//      3. 강아지
//      강아지를 좋아하는 당신은 민균이의 짝사랑입니다.
      
//      4. 고라니
//      고라니를 좋아하는 당신은 미쳤습니다.
	   
//	   변수 선언 및 초기화
	   String cat = "고양이",
			   catMsg = "고양이를 좋아하는 당신은 대훈이의 러버입니다.",
			   cow = "소",
			   cowMsg = "소를 좋아하는 당신은 세종이의 단짝입니다.",
			   dog = "강아지",
			   dogMsg = "강아지를 좋아하는 당신은 민균이의 짝사랑입니다.",
			   gorani = "고라니",
			   goraniMsg = "고라니를 좋아하는 당신은 미쳤습니다.",
			   defaultMsg = "항목에 있는 동물을 선택하시오";
	   
	   String message = "좋아하는 동물을 입력하세요\n(고양이, 소, 강아지, 고라니 중 택1)",
			   likeAnimal = "",
			   result = "";
	   
//	   사용자로부터 입력 받기
	   Scanner sc = new Scanner(System.in);
	   System.out.println(message);
	   likeAnimal = sc.nextLine();
	   
//	   테스트
//	   System.out.printf("입력한 동물: %s", likeAnimal);
	   
//	   입력한 동물에 따른 각기 다른 메세지 출력
//	   이런 조건은 불리언 변수 로도 분리 가능함
	   result = (likeAnimal.equals(cat)) ? catMsg 
			   : likeAnimal.equals(cow) ? cowMsg
					   : likeAnimal.equals(dog) ? dogMsg
							   : likeAnimal.equals(gorani) ? goraniMsg
									   : defaultMsg;
	   
	   System.out.println(result);
   }
}