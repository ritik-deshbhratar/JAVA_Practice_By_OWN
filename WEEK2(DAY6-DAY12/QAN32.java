
/* 32. Write java  program to input angles of a triangle and check whether trlangle is valid or not */
import java.util.*;

public class QAN32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Three Angles of Triangle :");
    int angle1 = input.nextInt();
    int angle2 = input.nextInt();
    int angle3 = input.nextInt();
    int sum = angle1 + angle2 + angle3;
    if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
      System.out.println("Triangle is valid");
    } else {
      System.out.println("Triangle is not valid");
    }
  }
}
// anouther way }

/*
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter Three Sides of Triangle :");
 * int side1 = input.nextInt();
 * int side2 = input.nextInt();
 * int side3 = input.nextInt();
 * if((side1 + side2) > side3)
 * if((side2 + side3) > side1)
 * if((side1 + side3) > side2)
 * System.out.println("Triangle is valid.");
 * else
 * System.out.println("Triangle is not valid.");
 * else
 * System.out.println("Triangle is not valid.");
 * else
 * System.out.println("Triangle is not valid.");
 * }
 */