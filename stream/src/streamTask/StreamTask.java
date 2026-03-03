package streamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask {
   
   public String addNamePrefix(String name) {
      return "이름 :" + name;
   }
   
   public static void main(String[] args) {
      User user1 = new User(1L, "홍길동", 20, "개발자", "남"); 
      User user2 = new User(2L, "장보고", 30, "기획자", "남"); 
      User user3 = new User(3L, "이순신", 35, "사장", "남"); 
      User user4 = new User(4L, "김영희", 25, "간호사", "여"); 
      User user5 = new User(5L, "김철수", 35, "소방관", "남"); 
      User user6 = new User(6L, "김영숙", 22, "유튜버", "여"); 
      
      ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
//      이름만 출력 
//      이름: 홍길동
//      users.stream().map((user) -> "이름: " + user.getName()).forEach((name) -> { System.out.println(name);});
//      ※ ↓ 참조형으로 변경하기
      
      StreamTask st = new StreamTask();
      users.stream().map(User::getName).map(st::addNamePrefix).forEach(System.out::println);
      
      System.out.println("30대 유저 직업만 거꾸로 돌리기");
      users.stream()
      .filter(user -> user.getAge() >= 30 && user.getAge() < 40)
      .map(User::getName)
      .forEach(st::newReverseName);
      
   }
   
   public void newReverseName(String name) {
	   String result = new StringBuilder(name).reverse().toString();
	   System.out.println(result);
   }
   
   public void reverseName(String name) {
	   int len = name.length();
	   String result = "";
	   for(int i = 0; i < len; i++) {
		   result += name.charAt(len - 1 - i);
	   }
	   System.out.println(result);
   }
}

