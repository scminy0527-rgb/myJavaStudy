package classTask4;

public class ClassTask4 {
//  - 캐스팅 심화
//  Market
//  - 필드: 이름
//  - 메서드:
//  1. 상품 판매
//     - 등록된 상품만 판매할 수 있다.
//     - 유저가 가진 돈보다 적으면 판매할 수 없다.
//     - 유저가 마다의 할인율이 적용된다.
//        1. 비회원 할인율 5% 적용
//        2. 멤버 할인율 30% 적용
//     - 등록된 상품의 재고보다 작으면 판매할 수 없다.

//  2. 상품 등록
//     - 상품 등록은 최대 5개까지만 할 수 있다.
//     (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//     - 마트에 같은 이름의 상품은 등록할 수 없다.

//  3. 포인트 적립 메서드
//     - 회원이 각각 포인트를 가지도록
//     - 비회원은 5%
//     - 회원은 10%

//  4. 만약 비회원이라면
//     - 회원이 각각 쿠폰를 가지도록
//     - 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

//  Product 상품
//     - 필드: 이름, 가격, 재고
//
//  MarketMember 
//     - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//  
//  MarketNonMember
//     - 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//     - 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

//  공통 필드로 추상화 작업 필요**
	public static void main(String[] args) {
		// 마트 개업
		Market market = new Market("코사 마트");
		
//		상품 추가
		market.addProduct(new Product("램카드", 100000, 5));
		market.addProduct(new Product("사과", 3000, 4));
		market.addProduct(new Product("치킨공식 식권", 89000, 10));
		
//		상품 출력
		market.printProducts();
		
//		고객 만들기
		MarketMember member = new MarketMember("이규학", "010-1234-5678", 10000);
		MarketNonMember mem2 = new MarketNonMember("홍길동", "010-0000-0000", 9999999);
		
		market.sellProduct(member, "사과");
		market.sellProduct(mem2, "램카드");
		member.showPoint();
		mem2.showPoint();
		market.printProducts();
		
	}
}
