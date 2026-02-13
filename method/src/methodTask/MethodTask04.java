package methodTask;

import java.util.Scanner;

public class MethodTask04 {
	public static void main(String[] args) {
		MethodTask04 mt = new MethodTask04();
//      사용자는 1 ~ 999까지만 입력가능
	      
//      마스터
//      1. 소수 변환기
//      사용자의 입력값을 읽어 문자열로 출력하시오
//      입력 예시1)
//      12.34
//      출력 예시1)
//      십이점삼사
      
//      입력 예시2)
//      -57
//      출력 예시2)
//      마이너스오십칠
      
//      -237.27
//      마이너스이백삼십칠점이십칠
		
//		사용자한테 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 숫자를 입력하세요");
		System.out.println("예시: 10 또는 55.6 또는 -7.96");
		double userNum = sc.nextDouble();
		String result = null;
		
//		System.out.println(userNum);
		result = mt.doubleToHangel(userNum);
		System.out.println(result);
	}
	
	// 숫자를 한글로 하는 매서드 만들기
	String doubleToHangel(double num) {
		// 1. 먼저 점 이 있다면 점 기준으로 스플릿 하기
		String[] numStrArr = null;
		String doubleStr = "" + num,
				intSeg = "", floatSeg = "", finalResult = "";
		numStrArr = doubleStr.split("");
		boolean isIntFlag = true, isDouble = false;
		
		// 테스트
		printArr(numStrArr);
		
		// 만약에 각 부분 별로 숫자로 하는 개념
		// 1. 소수점 앞 부분만 먼저 가져오기
		for(int i = 0; i < numStrArr.length; i++) {
			String numChar = numStrArr[i];
			// 만약 마이너스로 시작 하면 마이너스 붙이기
			if(i == 0 && numChar.equals("-")) {
				finalResult += "마이너스";
				continue;
			}
			
			// 만약 점 이 있다면 플래스 바꾸고 이번 턴 넘기기
			if(numChar.equals(".")) {
				isIntFlag = false;
				isDouble = true;
				continue;
			}
			
			// 만약 정수 부분이라면 정수에 붙이고 소수라면 소수에 붙임 (1번째 인덱스 부터)
			if(i >= 0 && isIntFlag) {
				intSeg += numChar;
			}
			if(i >= 0 && !isIntFlag) {
				floatSeg += numChar;
			}
		}
		
		// 여기서 분해 결과를 가지고 문장열 완성하기
		finalResult += makeIntSegHangel(intSeg);
		
		if(!isIntFlag) {
			finalResult += "점";
			finalResult += makeFloatSegHangel(floatSeg);
		}
		
		// 결과 출력해보기 
//		System.out.println(finalResult);
		return finalResult;
		
		// 분해 결과
//		System.out.println(intSeg);
//		System.out.println(floatSeg);
	}
	
//	단순히 프린트 하는 함수 (중간 검증용)(문자열 배열 용)
	void printArr(String[] arr) {
		System.out.println("검증 실행");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("'%s' ", arr[i]);
		}
		System.out.println();
	}
	
	// 문자열로 정수 부분을 받아서 이걸 한국어로 해주기
	String makeIntSegHangel(String intSeg) {
		System.out.println(intSeg);
		int num = Integer.parseInt(intSeg),
				jalitsu = intSeg.length();
		String result = "", word = "  이삼사오육칠팔구", ilJariWord = " 일이삼사오육칠팔구";
		
		for(int i = 0; i < intSeg.length(); i++) {
			// 숫자 하나하나를 char 로 보는거
			String c = "" + intSeg.charAt(i);
			int idx = Integer.parseInt(c);
			
			if(idx != 0) {
				switch(jalitsu) {
				case 3:
					result += word.charAt(idx);
					result += "백";
					break;
				case 2:
					result += word.charAt(idx);
					result += "십";
					break;
				case 1:
					result += ilJariWord.charAt(idx);
				default:
					break;
				}
			}
			jalitsu--;
			
		}
		return result.trim();
	}
	
//	문자열로 소수 부분을 받기
	String makeFloatSegHangel (String floatSeg) {
		String word = "영일이삼사오육칠팔구", result = "";
		for(int i = 0; i < floatSeg.length(); i++) {
			String c = "" + floatSeg.charAt(i);
			int idx = Integer.parseInt(c);
			result += word.charAt(idx);
		}
		
		return result;
	}
}

