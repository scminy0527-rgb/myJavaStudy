package hashMap.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	public static void main(String[] args) {
//		Key: String | Value: Integer 타입의 빈 Map 생성
//		기본적으로 자료형은 오브젝트 타입이 와야 하기에 int 대신에 Integer 사용
		HashMap<String, Integer> dataMap = new HashMap<String, Integer>();
		
//		데이터 추가
		dataMap.put("student_1", 80);
		dataMap.put("student_2", 90);
		dataMap.put("student_3", 70);
		dataMap.put("student_4", 55);
		dataMap.put("student_4", 55);
		dataMap.put("student_4", 55);
		dataMap.put("student_5", 95);
		dataMap.put("student_4", 55);
		
//		순서에 상관 없이 담김
		System.out.println("결과");
		System.out.println(dataMap);
		
//		순서대로 각각의 값에 접근을 하고자 함
		Set<Entry<String, Integer>> entry = dataMap.entrySet();
		System.out.println(entry);
		for(Entry<String, Integer> e : entry) {
			System.out.printf("%s : %d\n", e.getKey(), e.getValue());
		}
		
		Iterator<Entry<String, Integer>> itor = entry.iterator();
		System.out.println("itorator: " + itor);
		while(itor.hasNext()) {
//			이거의 목적 : 값을 지우는거에 있음
			Entry<String, Integer> et = itor.next();
//			System.out.println(et.getKey() + " " + et.getValue());
			if(et.getValue() == 55) {
				itor.remove();
			}
		}
		System.out.println(dataMap);
	}
}
