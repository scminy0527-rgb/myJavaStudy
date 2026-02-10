package ifTask;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//      거스름돈 계산하기
//      1번 상품: 코카콜라 - 2000원
//      2번 상품: 팹시 - 1500원
//      3번 상품: 맥콜 - 1000원

//      가진돈은 10000
//      사용자가 상품과 구매개수를 입력해서
//      거스름돈을 계산하는 로직을 완성하시오
//      출력 예시)
//      구매상품: 콜라 2개
//      판매가격: 4000원
//      거스름돈: 6000원
		
//		변수 선언 및 초기화
		String cocaCola = "코카콜라", pepsi = "펩시", macCol = "맥콜",
				message = "구매할 상품과 갯수 입력하세요\n(예시) 코카콜라 2";
		String selectedItem = "", itemNum = "";
		int cocaPrice = 2000, pepsiPrice = 1500, macColPrice = 1000;
		int myMoney = 10000, itemPrice = 0, totalPrice = 0, change = 0;
		
		boolean isCoca = false, isPepsi = false, isMacCol = false;
		boolean isBuyAvail = false, isError = false;
		Scanner sc = new Scanner(System.in);
		
//		사용자로부터 입력 받기
		System.out.println(message);
		selectedItem = sc.next();
		itemNum = sc.next();
		
//		입력 받은 상품 판단
		isCoca = selectedItem.equals(cocaCola);
		isPepsi = selectedItem.equals(pepsi);
		isMacCol = selectedItem.equals(macCol);
		
//		상품 총 가격 계산
		if(isCoca) {
			itemPrice = cocaPrice;
		} else if(isPepsi) {
			itemPrice = pepsiPrice;
		} else if(isMacCol) {
			itemPrice = macColPrice;
		} else {
			isError = true;
		}
		
		totalPrice = Integer.parseInt(itemNum) * itemPrice;
		change = myMoney - totalPrice;
		
//		총 가격 이랑 가진 돈 비교
		if(myMoney >= totalPrice) {
			isBuyAvail = true;
		}
		
//		출력
//		1. 일단 올바른 상품 했는지
		if(!isError) {
//			2. 돈 충분한지 개념
			if(isBuyAvail) {
				System.out.printf("구매상품: %s %s개\n", selectedItem, itemNum);
				System.out.printf("판매가격: %d원\n", totalPrice);
				System.out.printf("거스름돈: %d원\n", change);
			} else {
				System.out.println("돈이 부족합니다.");
			}
		} else {
			System.out.println("올바른 상품을 입력하세요");
		}
	}
}
