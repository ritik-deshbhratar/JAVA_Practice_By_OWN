/* Write ajava  program to find maximum between three numbers.,   */

import java.util.Scanner;

public class QAN20 {
  public static void main(String[] args) {
    int num1, num2, num3;
    Scanner sc = new Scanner(System.in);

    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();

    if (num1 <= 0 && num2 <= 0 && num3 <= 0 && num1 == num2 && num1 == num3 && num2 == num3) {
      System.out.println("DATA IS INVALIDE ");
    } else if (num1 > num2 && num1 > num3) {
      System.out.println("Number 1 is greater than Num 2 & num3 " + num1);
    } else if (num2 > num3) {
      System.out.println("Num 2 is Greter than Num1 & num3 " + num2);

    } else {
      System.out.println("Number 3 is graeater than num1 & num2 " + num3);
    }
  }
}
