package whileTask;

import java.util.Scanner;

public class KioskTemp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String name1 = "아메리카노", name2 = "카페라떼", name3 = "없음";
      int price1 = 2000, price2 = 3000, price3 = 0;

      while (true) {
         System.out.println("\n--- 카페 키오스크 ---");
         System.out.println("1. 상품 등록");
         System.out.println("2. 상품 판매");
         System.out.println("3. 이름 변경");
         System.out.println("4. 가격 변경");
         System.out.println("5. 종료");
         System.out.print("메뉴 선택 : ");
         int choice = sc.nextInt();
         

         if (choice == 5) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }

         switch (choice) {
         case 1:
            System.out.println("등록할 상품의 이름과 가격을 입력하세요.\nex) 아이스티 2500");
            String productName = sc.next();
            int productPrice = sc.nextInt();
            System.out.printf("[%s %d원]이 등록되었습니다.\n", productName, productPrice);
            break;
            
         case 2:
            System.out.println("1. " + name1 + "(" + price1 + "원)");
            System.out.println("2. " + name2 + "(" + price2 + "원)");
            
            System.out.print("판매할 번호 : ");
            int sellNum = sc.nextInt();

            if (sellNum == 1) {
               System.out.println(name1 + " 판매가 완료되었습니다. 결제 금액은 " + price1 + "원 입니다.");
            } 
            else if (sellNum == 2) {
               System.out.println(name2 + " 판매가 완료되었습니다. 결제 금액은 " + price2 + "원 입니다.");
            } 
            else {
               System.out.println("잘못된 번호입니다.");
            }
            
            break;
            
         case 3:
            System.out.println("이름을 변경할 상품을 선택해주세요.");
            System.out.println("1. " + name1);
            System.out.println("2. " + name2);
            
            int productNum = sc.nextInt();
            
            if(productNum == 1) {
               System.out.println(name1 + "의 이름을 변경해주세요.");
               productName = sc.next();
               System.out.println(name1 + " 상품이 " + productName + "(으)로 변경되었습니다.");
               name1 = productName;
            } 
            else if (productNum == 2) {
               System.out.println(name2 + "의 이름을 변경해주세요.");
               productName = sc.next();
               System.out.println(name2 + " 상품이 " + productName + "(으)로 변경되었습니다.");
               name2 = productName;
            } 
            else {
               System.out.println("잘못된 번호입니다.");
            }
            
            break;
            
         case 4:
            System.out.println("가격을 변경할 상품을 선택해주세요.");
            System.out.println("1. " + name1 + "(" + price1 + "원)");
            System.out.println("2. " + name2 + "(" + price2 + "원)");
            productNum = sc.nextInt();
            
            if(productNum == 1) {
               System.out.println(name1 + "의 가격을 변경해주세요.");
               productPrice = sc.nextInt();
               System.out.println(name1 + " 상품의 가격이 " + productPrice + "원으로 변경되었습니다.");
               price1 = productPrice;
            } 
            else if (productNum == 2) {
               System.out.println(name2 + "의 가격을 변경해주세요.");
               productPrice = sc.nextInt();
               System.out.println(name2 + " 상품이 " + + productPrice + "원으로 변경되었습니다.");
               price2 = productPrice;
            } 
            else {
               System.out.println("잘못된 번호입니다.");
            }
            
            break;
            
         default:
            System.out.println("우히히히");
            break;
            
         }
      }
   }
}