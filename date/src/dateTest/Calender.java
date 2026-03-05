package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
//		싱글톤 패턴
//		프로그램 전체에서 단 하나의 객체만 존재하는것을 보장하는 디자인패턴 
//		여러개가 생기면 안되는 경우 (지금 처럼의 달력 등)
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.getTime());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		
//		Date -> LocalDate
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초")));
		System.out.println(LocalDate.parse("1900년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
	}
}
