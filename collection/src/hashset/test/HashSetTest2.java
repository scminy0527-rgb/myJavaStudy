package hashset.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
// HashSet

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ESTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("ISJT");
		mbtiType.add("ISJT");
		mbtiType.add("ENTJ");
		mbtiType.add("ENTJ");
		mbtiType.add("ENTJ");
		
//		출력은 잡히는대로 들고옴
		System.out.println(mbtiType);
		
//		값을 가져 오려면 문법이나 이터레이터 사용해야함
//		빠른 for문: 향상된 for문
		for(String mbti: mbtiType) {
			System.out.println(mbti);
		}
		System.out.println("테스트");
//		순서가 없을 때 순서를 붙여주는 인터페이스
//		카드를 손으로 모은 개념
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
//			System.out.println(mbti);
//			여기서 한번 더 iter.next 를 또 쓰는건 안됨
			if(mbti.equals("ENTJ")) {
				System.out.println(mbti);
			}
		}
		
//		중복된 데이터 삭제 할 때는 hashSet 이 꽤 유리
//      중복된 데이터 삭제 
	      ArrayList<Integer> datas =new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40));
	      datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
	      System.out.println(datas);
		
		
	}
}
