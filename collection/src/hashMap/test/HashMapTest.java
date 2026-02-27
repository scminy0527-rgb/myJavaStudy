package hashMap.test;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;   // ✅ 추가

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<String, Object> userMap = new HashMap<>();

		userMap.put("name", "홍길동");
		userMap.put("age", 20);
		userMap.put("address", "서울시 강남구");
		userMap.put("name", "김길동"); // key 중복 → 덮어쓰기

		System.out.println(userMap);
		System.out.println(userMap.get("name"));
		System.out.println(userMap.size());

		Set<String> keys = userMap.keySet();
		System.out.println(keys);

		Set<Entry<String, Object>> users = userMap.entrySet();
		System.out.println(users);

		// ✅ Iterator 사용
		Iterator<Entry<String, Object>> iter = users.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, Object> entry = iter.next();
//			System.out.println(entry);
			System.out.println(entry.getValue());
		}
	}
}