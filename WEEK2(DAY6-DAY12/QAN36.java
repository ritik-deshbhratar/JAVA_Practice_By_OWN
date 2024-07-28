
/* 36. Write a java program to calculate profit or loss. */
import java.util.*;

public class QAN36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter your cost Price ");
    int Costprice = sc.nextInt();
    System.out.println("ENter your SellingPrice ");
    int SellingPrice = sc.nextInt();

    if (SellingPrice > Costprice) {
      int profit = SellingPrice - Costprice;
      System.out.println("Profit is " + profit + "RU");
    } else if (Costprice > SellingPrice) {
      int Loss = Costprice - SellingPrice;
      System.out.println("Loss is  " + Loss + "RU");
    } else {
      System.out.println("KUCH NHIN HUA ");
    }
    // Profit = Selling Price - Cost Price
    // loss = cost -selling price

  }
}
