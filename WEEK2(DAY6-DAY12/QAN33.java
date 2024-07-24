
/* 33.Write a java program to input all sides of a triangle and check whether triangle Is valid or not */
import java.util.*;

public class QAN33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int side1 = input.nextInt();
    int side2 = input.nextInt();
    int side3 = input.nextInt();
    if ((side1 + side2) > side3)
      if ((side2 + side3) > side1)
        if ((side1 + side3) > side2)
          System.out.println("Triangle is valid.");
        else
          System.out.println("Triangle is not valid.");
      else
        System.out.println("Triangle is not valid.");
    else
      System.out.println("Triangle is not valid.");
  }
}
