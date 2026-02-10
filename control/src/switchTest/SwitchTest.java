package switchTest;

import java.util.Scanner;

public class SwitchTest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cocaColaPrice = 2000, pepsiPrice = 1500, mcColPrice = 1000, money = 10000,
            choice = 0, stock = 0, totalPrice = 0;
      
      String coca = "코카콜라", pepsi = "팹시", mcCol = "맥콜", choiceDrink = "",
            exampleMessage1 = "상품을 고르세요.\n1. 코카콜라\n2. 팹시\n3. 맥콜",
            exampleMessage2 = "구매 수량을 입력하세요.\nex)10",
            result = "구매상품: %s %d개\n"
                  + "판매가격: %d원\n"
                  + "거스름돈: %d원";
      
      System.out.println(exampleMessage1);
      choice = sc.nextInt();
      
      System.out.println(exampleMessage2);
      stock = sc.nextInt();
      
      switch(choice) {
      case 1:
         choiceDrink = coca;
         totalPrice = cocaColaPrice * stock;
         break;
      case 2:
         choiceDrink = pepsi;
         totalPrice = pepsiPrice * stock;
         break;
      case 3:
         choiceDrink = mcCol;
         totalPrice = mcColPrice * stock;
         break;
      default:
         System.out.println("잘못 입력하셨습니다.");
         break;
      }
      
      money -= totalPrice;
      
      System.out.printf(result, choiceDrink, stock, totalPrice, money);
   }
}
