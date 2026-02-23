package classTask4;

public class Market {
//	변수
	private String name;
	private Product[] productArr = null;
	
//	생성자
	public Market() {;}
	public Market(String name) {
		this.name = name;
	}
	
	{
		System.out.println("마트 개업을 했습니다.");
	}
	
//	게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product[] getProductArr() {
		return productArr;
	}
	public void setProductArr(Product[] productArr) {
		this.productArr = productArr;
	}
	
	//	상품 등록 매서드
	public void addProduct(Product product) {
		Product[] result = null;
		int len = 0;
//		상품이 아무것도 없는 경우라면 해야 하는거
		if(this.productArr == null) {
			this.productArr = new Product[] {product};
			return;
		}
		
		len = this.productArr.length;
		
//		상품이 이미 5개 라면 더이상 등록 못하게 하기
		if(len == 5) {
			System.out.println("상품은 5개 까지만 등록 가능합니다.");
			return;
		}
		
//		그리고 현재 이름이 동일한 상품이 존재 하는지 확인
		if(checkProduct(product.getName()) >= 0) {
			System.out.println("해당 상품은 이미 리스트에 존재 합니다.");
			return;
		}
		
//		판매 리스트에 상품을 추가하는 개념
		result = new Product[len + 1];
		for(int i = 0; i < len; i++) {
			result[i] = this.productArr[i];
		}
		result[len] = product;
		this.productArr = result;
	}
	
//	입력을 한 상품이 존재 하는지 확인
	int checkProduct(String name) {
		int idx = -1;
		for(int i = 0; i < productArr.length; i++) {
			Product pd = productArr[i];
			if(pd.getName().equals(name)) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
//	현재 판매중인 상품을 출력하는 매서드
	public void printProducts() {
		System.out.println("현재 판매중인 상품 리스트");
		System.out.println();
		for(Product product : productArr) {
			product.introduce();
		}
	}
}
