package streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> newList = list.stream()
				.filter(n -> n %2 == 0)
				.collect(Collectors.toList());
		System.out.println(newList);
		
		boolean isUnder10 = list.stream()
		.allMatch(n -> n < 10);
		
		System.out.println(isUnder10);
		
		List<User> userList = Arrays.asList(
				new User("id001", "홍길동", 20),
				new User("id002", "이규학", 17),
				new User("id003", "약소훈", 23));
		System.out.println(userList);
		
		List<String> audltName = userList.stream()
				.filter(user -> user.getAge() >= 20)
				.map(user -> user.getName())
				.collect(Collectors.toList());
		
		System.out.println(audltName);
		
	}
}
