package classTask3;

public class AnimalLab {
	private String labName;

	public AnimalLab() {;}
	public AnimalLab(String labName) {
		this.labName = labName;
	}
	
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	 
//	동물 체크하는 매서드
	public void checkAnimal(Animal animal){
		String name = null, type = null;
		name = animal.getName();
		
		if(animal instanceof Harbivore) {
			type = "초식동물";
		} else if(animal instanceof Carnivore) {
			type = "육식동물";
		} else if(animal instanceof Omivore) {
			type = "잡식동물";
		}
		
		System.out.printf("%s는 %s 입니다.\n", name, type);
	}
	
	
}
