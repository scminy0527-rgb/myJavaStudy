package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import streamTask.User;

public class OptionalTest {
   
   ArrayList<User> users = new ArrayList<User>(
         Arrays.asList(
            new User(1L, "홍길동", 20, "개발자", "남"),
            new User(2L, "장보고", 30, "기획자", "남"),
            new User(3L, "이순신", 35, "사장", "남")
         )
      );
   
//   한 번이라도 if문에 들어가지 않으면
//    null -> NPE 발생할 수 있는 상황
   public Optional<User> findById(Long id) {
      User user = null;
      for(User userInDb: users) {
         if(userInDb.getId() == id) {
            user = userInDb;
         }
      }
      return Optional.ofNullable(user);
   }
   
   public static void main(String[] args) {
      
      OptionalTest ot = new OptionalTest();
      
//      System.out.println(ot.findById(1L).getName());
//      System.out.println(ot.findById(100L).getName());
      
      Optional<User> member = ot.findById(100L);
//      .orElseThrow(): Optional 객체의 리턴 값이 null이라면 throw 아니라면 객체(값)를 리턴
//      member.orElseThrow(() -> new NoSearchUserException("그런 사람 없습니다."));
      
//      .isPresent(): Optional 객체의 리턴이 null이 아닌 경우 true, null인 경우 false 리턴
      if(member.isPresent()) {
         System.out.println("사용자가 있음");
         member.get();
      }else {
         System.out.println("사용자가 없음");
      }
      
//      .get(): Optional 객체에서 객체(값)를 꺼내오는 메서드
      
      
//      Optional 객체가 null이 아닐때 return 값을 받아서 로직을 처리
      member.ifPresent((m) -> {
         
      });
      
      
      member.ifPresentOrElse((m) -> {}, () -> new NoSearchUserException());
      
   }
}













