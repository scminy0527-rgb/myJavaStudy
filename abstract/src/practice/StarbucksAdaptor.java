package practice;

public class StarbucksAdaptor extends Starbucks implements StarbucksInterface {
	public StarbucksAdaptor(Long id, String name, String address) {
		super(id, name, address);
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void storeOpen() {
		// TODO Auto-generated method stub
	}
}
