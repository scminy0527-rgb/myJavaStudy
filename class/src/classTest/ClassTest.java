package classTest;

// 동물 (Amimal)
// 이름 나이 종류
// 추상화 시킨 하나의 클래스
class Animal {
	String name;
	int age;
	String species;
	
	// 기본 생성자
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	// 건드리지 말자는게 개발자들의 약속
	// 객체 가 객체화 되는 순간에 자동으로 호출
	// 기본 생성자는 반드시 만들어야 함
	public Animal(String name, int age, String species) {
		// 초기화 생성자
		// 반드시 this 라는 변수를 붙어주어야 한다.
		// this. 는 자기자신
		this.name = name;
		this.age = age;
		this.species = species;
	}
}

// public 그 파일의 대장
// 토끼, 강아지, 고양이
public class ClassTest {
	public static void main(String[] args) {
		// 메모리에 할당 해야함 new 
		// new 를 칠 때마다 계속 힙 메모리에 새롭게 할당됨
//		Animal dog = new Animal();
		
		// 객체화가 된 코드라고 할 수 있음
		Animal rabbit = new Animal("토깽이", 20, "토끼");
		Animal cat = new Animal("치즈", 3, "고양이");
		
		rabbit.name = "토깽이";
		rabbit.age = 20;
		rabbit.species = "토끼";
		
		System.out.println(rabbit.name);
		System.out.println(cat.age);
	}
	
}
