package arrayTask;

import java.util.Scanner;

public class ArrayTask04 {
	public static void main(String[] args) {
//      다이아
//      1. 계산기 만들기
//      사용자의 수식의 결과 값을 출력하는 계산기를 만드세요.
//      입력 예시1)
//      10 + 7 + 9
//      출력 예시1)
//      26
      
//      입력 예시2)
//      -7 + 8 + 11
//      출력 예시2)
//      12

//      힌트) 문자열의 메서드 .split()은 구분점으로 잘라 배열로 리턴하는 메서드이다.
//      자바에서는 구분점을 여러 개 전달할 수 있으며 여러개를 전달할 때에는 | 연산자를 이용한다
//      예를 들어 +, -를 구분점으로 자른다면 .split(\\+|\\-)로 전달해야한다.
//      \\는 제어문자가 아닌 문자열로 인식하기 위함이다.
		
//		사용자한테 수식 입력 받기
		Scanner sc = new Scanner(System.in);
		String susik = null, yeonsanja = "+-*/";
		String[] susikArray = null;
		double[] numSusik = null;
		char[] yeonsanArr = null;
		int susikLen = 0, yeonsanLen = 0, yIndex = 0;
		double calcResult = 0.0;
		
		System.out.println("계산을 원하는 수식을 입력하세요");
		System.out.println("예시1) 10 + 7 + 9");
		System.out.println("예시2) -7 + 8 + 11");
		susik = sc.nextLine();
		
		susikArray = susik.split("\\+|\\-|\\*|\\/");
		susikLen = susikArray.length;
		numSusik = new double[susikLen];
		yeonsanArr = new char[susikLen - 1];
		
//		1. 먼저 연산자 만 추출
		for(int i = 0; i < susik.length(); i++) {
			char y = susik.charAt(i);
			
			if(yeonsanja.contains(""+y)) {
				yeonsanArr[yIndex] = y;
				yIndex++;
			}
		}
		
//		가장 앞에 - 가 온 경우는 0 을 추가로 해서 보정하는거 생각
//		잘 검증
//		해당 yeonsanArr 에 있는 모든 원소는 단일 오퍼레이션 (더하기) 로만 되게 원소 바꾸기
		for(int i = 0; i < susikLen; i++) {
//			System.out.println(i+"인덱스"+susikArray[i]);
			if(i == 0 && yeonsanArr[0] == '-') {
				numSusik[0] = 0.0;
				continue;
			}
			
//			if(yeonsanArr[i] == '*') {
//				
//				
//			}
			
//			숫자를 넣을 때 연산자 - 에서 고려 해서 숫자를 변환하기
			if(i > 0 && yeonsanArr[i - 1] == '-') {
				numSusik[i] = -1 * (Double.parseDouble(susikArray[i]));
				continue;
			}
			numSusik[i] = Double.parseDouble(susikArray[i]);
		}
		
//		만약 / 혹은 * 가 여기 식 앞에 있거나 하면 그거도 더하는거 고려해서 바꾸기 (우선 연산 구현)
		for(int i = 0; i < susikLen - 1; i++) {
			if(numSusik[i] == 0) {
				continue;
			}
			if(yeonsanArr[i] == '*' || yeonsanArr[i] == '/') {
//				만약에 해당 숫자가 0 이면 그냥 넘어감
//				여기서 두 와일 쓰는 개념
				int tempIdx = i;
				while(true) {
//					여기서 tempIdx 도 검증을 해야함
					if(tempIdx == yeonsanArr.length) {
						break;
					}
					if(yeonsanArr[tempIdx] == '+' || yeonsanArr[tempIdx] == '-') {
						break;
					}
					
					if(yeonsanArr[tempIdx] == '*') {
						numSusik[i] *=  numSusik[tempIdx + 1];
						numSusik[tempIdx + 1] = 0;
					} else {
						numSusik[i] /=  numSusik[tempIdx + 1];
						numSusik[tempIdx + 1] = 0;
					}
					tempIdx++;
				}
				
			}
		}
		
//		테스트 숫자 반환
		for(int i = 0; i < susikLen; i++) {
			System.out.println(numSusik[i]);
		}
//		연산자 프린트
		for(int i = 0; i < yeonsanArr.length; i++) {
			System.out.println(yeonsanArr[i]);
		}
		
//		결과 반환
		for(int i = 0; i < susikLen; i++) {
			calcResult += numSusik[i];
		}
		
		System.out.println("연산 결과: " + calcResult);
	}
}
