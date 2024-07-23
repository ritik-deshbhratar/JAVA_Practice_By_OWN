
// 22. Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;

public class QAN22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    num1 = sc.nextInt();
    if (num1 % 5 == 0 && num1 % 11 == 0) {
      System.out.println("num1 is divisible by 5 and 11 ");
      int divendt = num1 / 5;
      System.out.println("num1 divide by 5 and ans is " + divendt);

      int divendt2 = num1 / 6;
      System.out.println("num1 divide by 11 and ans  is " + divendt2);
    }

    else {
      System.out.println("num is not divisible By 5 and 11 ");
    }

  }
}
