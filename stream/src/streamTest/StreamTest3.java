package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import streamTask.User;

public class StreamTest3 {
   public static void main(String[] args) {
      User user1 = new User(1L, "홍길동", 20, "개발자", "남"); 
      User user2 = new User(2L, "장보고", 30, "기획자", "남"); 
      User user3 = new User(3L, "이순신", 35, "사장", "남"); 
      User user4 = new User(4L, "김영희", 25, "간호사", "여"); 
      User user5 = new User(5L, "김철수", 35, "소방관", "남"); 
      User user6 = new User(6L, "김영숙", 22, "유튜버", "여"); 
      
      ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
      
      System.out.println(IntStream.range(0, 10).max());
      System.out.println(IntStream.range(0, 10).min());
      System.out.println(IntStream.range(0, 10).sum());
      
//      
//      IntStream -> Stream<Integer>
//      .boxed()
//      .mapToObj()
      
//      Stream<Integer> -> IntStream
      int totalAge = users.stream()
         .mapToInt(user -> user.getAge())
         .sum();
      
      System.out.println(totalAge);
      
      
      
   }
}







