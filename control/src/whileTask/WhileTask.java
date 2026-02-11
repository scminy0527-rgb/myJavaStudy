package whileTask;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
//      키오스크 만들기
//      기본 판매 상품
//      아메리카노: 2000원
//      카페라떼: 3000원
		
//      1. 상품 등록
//      2. 상품 판매
//      3. 이름 변경
//      4. 가격 변경
      
//      등록된 물품을 판매하는 시스템
//      판매가 완료되면 다시 첫 화면으로 돌아오기!
		
//		슬롯 설정
		String sellingSlot = "1\n2\n";
		
		String item1 = "1. 아메리카노\n", item2 = "2. 카페라떼\n", item3 = "",
				item4 = "", item5 = "", item6 = "",
				itemList = item1 + item2 + item3 + item4 + item5 + item6,
				mainMessage = "조작하려면 버튼을 터치하세요\n"
				+ "1. 상품 등록\n"
				+ "2. 상품 판매\n"
				+ "3. 이름 변경\n"
				+ "4. 가격 변경\n",
				slotMsg = "상품을 등록할 슬롯을 1~6에서 선택하세요\n" + "다음 슬롯은 제외" + sellingSlot,
				itemEnrollMsg = "등록하실 상품의 이름을 입력하세요",
				priceEnrollMsg = "해당 상품의 가격을 설정해주세요",
				buyMsg = "구매 할 상품을 선택해주세요\n" + itemList;
		
//		임시 저장 하는거
		String tempName = "";
		int tempPrice = 0;
		boolean isItemInputted = false, isSelectItem = false;
				
				
		int price1 = 2000, price2 =3000, price3 = 0,
				price4 = 0, price5 = 0, price6 = 0;
		
//		키오스크에서 타입 선택
		int select = 0;
		
//		상품 종류 선택하는거
		int itemNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
//		무한 반복
		while(true) {
			System.out.println(mainMessage);
			select = sc.nextInt();
			
			System.out.println(select);
			
			switch(select) {
			case 1:
			System.out.println(slotMsg);
			itemNum = sc.nextInt();
				
//				해당 슬롯 이용 가능한지
				if(sellingSlot.indexOf(itemNum) < 0) {
//				이름 입력
					System.out.println(itemEnrollMsg);
					tempName = itemNum + ". " + sc.next() + "\n";
					System.out.println(priceEnrollMsg);
					tempPrice = Integer.parseInt(sc.next());
					sellingSlot += (itemNum + "\n");
					
					isItemInputted = true;
				} else {
					System.out.println("해당 슬롯은 이용 불가합니다.");
				}
//				System.out.println(itemEnrollMsg);
//				item3 = sc.nextLine();
//				System.out.println(priceEnrollMsg);
//				price3 = sc.nextInt();
				break;
				
			case 2:
				System.out.println(buyMsg);
				itemNum = sc.nextInt();
				
//				상품 선택 완료
				isSelectItem = true;
				
			default:
				break;
				
			}
			
			
//			만약에 추가 혹은 수정으로 temp 에 있는 경우
			if(isItemInputted) {
				switch(itemNum) {
				case 1:
					item1 = tempName;
					price1 = tempPrice;
					break;
				case 2:
					item2 = tempName;
					price2 = tempPrice;
					break;
				case 3:
					item3 = tempName;
					price3 = tempPrice;
					break;
				case 4:
					item4 = tempName;
					price4 = tempPrice;
					break;
				case 5:
					item5 = tempName;
					price5 = tempPrice;
					break;
				case 6:
					item6 = tempName;
					price6 = tempPrice;
					break;
				default:
					break;
				}
				
//				수정 고려
				itemList = item1 + item2 + item3 + item4 + item5 + item6;
				buyMsg = "구매 할 상품을 선택해주세요\n" + itemList;
				isItemInputted = false;
			}
			
//			만약에 구매를 할 상품을 선택한 경우
			if(isSelectItem) {
				switch(itemNum) {
				case 1:
					tempName = item1;
					tempPrice = price1;
					break;
				case 2:
					tempName = item2;
					tempPrice = price2;
					break;
				case 3:
					tempName = item3;
					tempPrice = price3;
					break;
				case 4:
					tempName = item4;
					tempPrice = price4;
					break;
				case 5:
					tempName = item5;
					tempPrice = price5;
					break;
				case 6:
					tempName = item6;
					tempPrice = price6;
					break;
				
				default:
					break;
				}
				
				System.out.printf("구매 상품: %s구매가격: %d원\n", tempName, tempPrice);
				isSelectItem = false;
			}
		}
	}
}
