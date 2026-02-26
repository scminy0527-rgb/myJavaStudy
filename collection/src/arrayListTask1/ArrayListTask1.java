package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		int index = 0;
		
		for(int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}
		
		System.out.println(datas);
		
//		실습
//		50 뒤에 500을 삽입
		index = datas.indexOf(50);
		datas.add(index + 1, 500);
		System.out.println("실습 1");
		System.out.println(datas);
		
//		80 삭제
//		1. 인덱스로 삭제하기 (값 모름)
		System.out.println();
		System.out.println("실습 2");
		index = datas.indexOf(80);
		datas.remove(index);
		System.out.println(datas);
		
//		문제속에 답이 있다.....
		
//		60 삭제
//		2. 값으로 삭제하기 (값 알음)
		System.out.println();
		System.out.println("실습 3");
		datas.remove((Integer)60);
		System.out.println(datas);
	}
}
