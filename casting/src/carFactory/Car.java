package carFactory;

public class Car {
//	자동차가 상위 항목에서 가질 수 있는 여러 항목을 정의
	private String name;
	private String numberPlate;
	
	public Car() {;}
	public Car(String name, String numberPlate) {
		this.name = name;
		this.numberPlate = numberPlate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
}
