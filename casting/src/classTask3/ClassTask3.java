package classTask3;

//동물 연구소 클래스
//checkAnimal(){}
//각각 동물이 들어오면 어떤 동물에 속하는지 출력해주는 메서드

//동물들이 들어오면 각각의 동물들을 분리한다.
//초식동물(Harbivore)
//- 코알라, 사슴

//육식동물(Carnivore)
//- 사자, 곰

//잡식동물(Omivore)
//- 강아지, 고양이

public class ClassTask3 {
	public static void main(String[] args) {
		AnimalLab lab = new AnimalLab("동물 연구소");
		Animal[] animalList = null;
		
		Harbivore coala = new Harbivore("코알라", 10);
		Harbivore deer = new Harbivore("사슴", 10);
		
		Carnivore lion = new Carnivore("사자", 5);
		Carnivore bear = new Carnivore("곰", 3);
		
		Omivore dog = new Omivore("뽀삐", 4);
		Omivore cat = new Omivore("나비", 2);
		
		animalList = new Animal[] {coala, deer, lion, bear, dog, cat};
		for(int i = 0; i < animalList.length; i++) {
			lab.checkAnimal(animalList[i]);
			animalList[i].eatFood();
		}
	}
}
