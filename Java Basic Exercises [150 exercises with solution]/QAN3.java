/* 3. Write a Java program to divide two numbers and print them on the screen.
   Test Data :
   50/3
   Expected Output :
   16  */

import java.util.Scanner;

public class QAN3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    int divide;
    divide = num1 / num2;

    System.out.println("the divide of num1 & num2 is " + divide);
  }
}
