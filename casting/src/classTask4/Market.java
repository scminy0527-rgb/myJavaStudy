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
	public int checkProduct(String name) {
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
	
//	가게에서 상품을 판매 하는 매서드
//	상품 판매를 위해서는 누가 무엇을 살 것인지 알아야 함
	public void sellProduct(Member member, String productName) {
//		먼저 멤버가 선택을 한 상품 추출 및 재고 파악
		 int pdIdx = checkProduct(productName),
				 salePrice = 0;
		 Product product = null;
//		 double saleRate = 0;
		 
		 if(pdIdx < 0) {
			 System.out.println("해당 상품은 존재하지 않습니다. 다시 골라주세요");
			 return;
		 }
		 product = productArr[pdIdx];
		 if(product.getStock() == 0) {
			 System.out.println("죄송합니다. 해당 상품은 재고가 없습니다.");
			 return;
		 }
		 
//		 맴버의 등급을 가지고 판매 가격 판단
		 salePrice = member.calcSalePrice(product.getPrice());
		 
//		 돈을 가지고 있기 전에 쿠폰으로 먼저 가능한지 확인
		 if(member instanceof MarketMember) {
			 MarketMember mkMember = (MarketMember) member;
			 int coupon = mkMember.getCoupon();
			 if(coupon >= 10) {
				 System.out.println("쿠폰으로 물건을 구매합니다.");
				 mkMember.buyByCoupon();
				 product.reduceStock();
				 return;
			 }
		 }
		 
//		 여기서 유저가 돈을 충분히 가지고 있는지 판단하기
		 if(member.getMoney() < salePrice) {
			 System.out.println("물건을 구매하는데 금액이 부족합니다.");
			 return;
		 }
		 
		 System.out.printf("%s 고객님 %s를 %d원에 구매 합니다.\n", member.getName(), product.getName(), salePrice);
		 
//		 물건을 구매 하면 재고 감소, 유저 포인트 증가, 쿠폰 증가, 유저 가진 돈 감소 해야 함
		 product.reduceStock();
		 member.spendMoney(salePrice);
		 if(member instanceof MarketMember) {
			 ((MarketMember) member).addCoupon();
		 }
		 member.addPoint(salePrice);
	}
}
