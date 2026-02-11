package whileTask;

import java.util.Scanner;

public class KioskFirst {
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
		
		String item1 = "아메리카노", item2 = "카페라떼", item3 = null, item4 = null,
				itemName = "";
		boolean itemAddAvail = true;
		int price1 = 2000, price2 = 3000, price3 = 0, price4 = 0,
				itemCount = 2,
				select = 0, itemSelect = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			일단 현재 기준으로 상품 등록 가능한지 체크
			itemAddAvail = itemCount < 4;
			
//			안내문 띄워주기
			System.out.println("=======================");
			System.out.println("원하시는 서비스를 선택해주세요");
			if(itemAddAvail) {
				System.out.println("1. 상품등록");
			}
			System.out.println("2. 상품판매");
			System.out.println("3. 이름변경");
			System.out.println("4. 가격변경");
			System.out.println("5. 상품삭제");
			System.out.println("6. 종료");
			System.out.println("=======================");
			
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("1. 상품등록 선택");
				
				System.out.println("원하시는 슬롯을 선택하세요 ex) 1");
				
//				가능한 번째 선택
				if(item1 == null) {
					System.out.println("1번 슬롯");
				}
				if(item2 == null) {
					System.out.println("2번 슬롯");
				}
				if(item3 == null) {
					System.out.println("3번 슬롯");
				}
				if(item4 == null) {
					System.out.println("4번 슬롯");
				}
				itemSelect = sc.nextInt();
				
//				선택한 슬롯 가능여부 검증
				if(item1 == null && itemSelect == 1) {
					System.out.println("1번 슬롯에 추가 할 상품이름 및 가격 설정 ex) 사과 1000");
					item1 = sc.next();
					price1 = Integer.parseInt(sc.next());
					itemCount++;
					break;
				}
				if(item2 == null && itemSelect == 2) {
					System.out.println("2번 슬롯에 추가 할 상품이름 및 가격 설정 ex) 사과 1000");
					item2 = sc.next();
					price2 = Integer.parseInt(sc.next());
					itemCount++;
					break;
				}
				if(item3 == null && itemSelect == 3) {
					System.out.println("3번 슬롯에 추가 할 상품이름 및 가격 설정 ex) 사과 1000");
					item3 = sc.next();
					price3 = Integer.parseInt(sc.next());
					itemCount++;
					break;
				}
				if(item4 == null && itemSelect == 4) {
					System.out.println("4번 슬롯에 추가 할 상품이름 및 가격 설정 ex) 사과 1000");
					item4 = sc.next();
					price4 = Integer.parseInt(sc.next());
					itemCount++;
					break;
				}
				
//				만야겡 올바른 슬롯을 선택 했다면 상품 이름과 가격을 받기
				System.out.println("선택한 슬롯은 이미 사용중입니다.");
				
				break;
			case 2:
				System.out.println("2. 상품판매 선택");
				System.out.println("원하시는 상품을 선택하세요 ex) 1");
				
//				가능한 번째 선택
				if(item1 != null) {
					System.out.println("1. " + item1);
				}
				if(item2 != null) {
					System.out.println("2. "+ item2);
				}
				if(item3 != null) {
					System.out.println("3. "+ item3);
				}
				if(item4 != null) {
					System.out.println("4. "+ item4);
				}
				itemSelect = sc.nextInt();
				
				
				
				
				break;
			case 3:
				System.out.println("3. 이름변경 선택");
				break;
			case 4:
				System.out.println("4. 가격변경 선택");
				break;
			case 5:
				System.out.println("5. 상품삭제 선택");
				break;
			case 6:
				System.out.println("6. 종료 선택");
				break;
			default:
				System.out.println("올바른 서비스를 선택하세요");
				break;
			}
			
//			종료선택 했으면 종료
			if(select == 6) {
				break;
			}
			
		}
		
	}

}
