package dateTest;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
//		.parse()
		try {
			simpleDateFormat.parse("2026년 3월 5일 1시 5분 39초");
			System.out.println(simpleDateFormat.parse("2026년 3월 5일 1시 5분 39초"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
