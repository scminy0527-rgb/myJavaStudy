package classTask4;

public class Product {
	private String name;
	private int price;
	private int stock;
	
	public Product() {;}
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
//	상품 자기 자신을 소개하는 매서드
	public void introduce() {
		System.out.println("상품명: " + this.name);
		System.out.println("가격: " + this.price + "원");
		System.out.println("재고 수량 : " + this.stock);
		System.out.println();
	}
	
//	해당 상품의 갯수 줄이는거 구현
	public void reduceStock() {
		this.stock--;
	}
	
}
