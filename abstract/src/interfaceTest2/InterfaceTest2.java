package interfaceTest2;

// 동물(Animal)

// 마커 인터페이스
// 육식동물(Canivore), 초식동물(Habivore)
// Line, Bear, Cat, Deer, Rebbit

public class InterfaceTest2 {
//	초식동물이 들어오면 채소를 먹이로 주기
//	육식동물이 들어오면 고기를 먹이로 주기
//	출력
	public void checkAnimal(Animal animal) {
		if(animal instanceof ChosikMarker) {
//			초식동물
//			다운 캐스팅
			this.feedChosik((ChosikMarker) animal);
		} else if(animal instanceof YuksikMarker) {
//			육식동물
			this.feedYuksik((YuksikMarker) animal);
		}
	}
	
//	인터페이스가 틀을 준거: 틀 이 부모인 개념/ 따라서 이건 업 캐스팅
	public void feedChosik(ChosikMarker harvibore) {
		System.out.println("채소를 줌");
	}
	public void feedYuksik(YuksikMarker carnivore) {
		System.out.println("규혁이 던짐");
	}
	
	public static void main(String[] args) {
		
	}
}
