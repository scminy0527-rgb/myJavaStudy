package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
//		배열: 크기 고정
//		값 을 내 맘대로 추가할 수 없음
		int[] arData = new int[5];
		
		arData[0] = 10;
		
//		해시 주소 출력
		System.out.println(arData[0]);
		
		int[] tempData = new int[5];
		System.out.println(tempData[1]);
		
//		클래스 형태의 변수의 초기값은 항상 null
		String[] arData2 = new String[3];
		System.out.println(arData2[1]);
		
//		이렇게 초기에 원소를 넣으면 크기도 해당 방 갯수만큼 처음에 정해짐
		boolean[] arData3 = {false, false, false};
		
		
		int[] arrData1 = {10, 3, 9, 6, 7};
		
//		순서대로 접근을 한다면???
//		length: arrData1 의 '필드'
		for(int i = 0; i < arrData1.length; i++) {
			System.out.println(arrData1[i]);
		}
		
//		자동 형변환
//		확실하게 아스키코드로 만들 수 있는거라면 컴파일러가 형태를 바꿈
		char[] chars = {'A', 'b', 'c', 'd'};
		chars[0] = 97;
		
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
	}
}
