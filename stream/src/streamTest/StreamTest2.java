package streamTest;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest2 {
   public static void main(String[] args) {
//      collect(), Collectors
//      Stream 객체의 형변환
      
//      ArrayList -> String
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach(datas1::add);
      
      System.out.println(datas1);
      String str = datas1.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(", "));
      
//      System.out.println(str);
      
      
//      mapToObj: 기본 자료형 -> 클래스형 자료형으로 형변환시켜주는 스트림 메서드
      
      String data = "ABCDEF";
//      "abcdef"
      String str2 = data
         .chars() // IntStream
         .map((c) -> c + 32) // IntStream
         .mapToObj((c) -> (char)c) // Stream<Character>
         .map(String::valueOf)
         .collect(Collectors.joining(""));
      
      System.out.println(str2);
      
      
      
   }
}








