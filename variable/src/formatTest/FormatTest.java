package formatTest;

//서식 문자(format)
//반드시 따옴표 안에서 작성한다.
//
//%d : decimal(10진수 정수)
//%o : octal(8진수 정수)
//%x : hexadecimal(16진수 정수)
//%f : float(실수)
//%c : character(문자)
//%s : string(문자열)
public class FormatTest {
	public static void main(String[] args) {
		String name = "신철민";
		int age = 30;
		double height = 180.5;
		
		System.out.printf("이름: %s 님\n",  name);
		System.out.printf("나이: %d살\n",  age);
		System.out.printf("키: %.2fcm",  height);
	}

}
