package classTask4;

public class MarketNonMember extends Member {
	private double pointRate = 0.05;
	private double saleRate = 1 - 0.05;
	
	public MarketNonMember() {;}
	public MarketNonMember(String name, String phoneNum, int money) {
		super(name, phoneNum, money);
	}

	public double getPointRate() {
		return pointRate;
	}
	public void setPointRate(double pointRate) {
		this.pointRate = pointRate;
	}
	public double getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(double saleRate) {
		this.saleRate = saleRate;
	}
	
	@Override
	public void addPoint(int price) {
		// TODO Auto-generated method stub
		super.setPoint(price * this.pointRate);
	}
	
	@Override
	public int calcSalePrice(int price) {
		return (int)(price * saleRate);
	}
	
}
