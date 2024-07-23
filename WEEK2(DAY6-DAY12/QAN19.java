/* 19. Write a C program to find maximum between two numbers */

import java.util.Scanner;

public class QAN19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if (num1 > num2) {
      System.out.println("num1 is greater than Num2  =>" + num1);
    }
    if (num1 == num2) {
      System.out.println("Invalide inputes from user Both number is equals please enter the valide data ");
    } else {
      System.out.print("num2 is graeater than num1 => " + num2);
    }
  }
}
