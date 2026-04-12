package practice;

public class StarbucksDT extends StarbucksAdaptor implements DTMarker {
	public StarbucksDT(Long id, String name, String address) {
//		여기서 super 는 부모
		super(id, name, address);
	}
}
