package classTask4;

public class MarketMember extends Member {
	private double pointRate = 0.1;
	private double saleRate = 1 - 0.3;
	private int coupon;
	
	public MarketMember() {;}
	public MarketMember(String name, String phoneNum, int money) {
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
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
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
	
//	멤버의 특징 (물건을 구매 하면 쿠폰을 쌓음)
	public void addCoupon() {
		this.coupon++;
	}
	
//	쿠폰을 이용해서 물건을 구매하는 개념
	public void buyByCoupon() {
		this.coupon -= 10;
	}
	
}
