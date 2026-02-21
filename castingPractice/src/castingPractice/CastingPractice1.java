package castingPractice;

class Doebutsu {}
class Inu extends Doebutsu {}

public class CastingPractice1 {
	public static void main(String[] args) {
		// 자동 캐스팅
		int a = 10;
		double b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		double numA = 10.5;
		int numB = (int)numA;
		System.out.println("numA: "+numA);
		System.out.println("numB: "+numB);
		
		// 업캐스팅
		Inu dog = new Inu ();
		
		Doebutsu animal = dog;
		Doebutsu dongmul = new Doebutsu();
		Inu inu = (Inu) dongmul; // 이건 에러. 동물 자체는 개 클래스가 아니니까 (개 에는 없는 속성 존재)
		// animal 은 dog 의 부모
		// 부모는 자식의 속성을 가지고 있음
		// 따라서 자동 업캐스팅 가능
	}
}
