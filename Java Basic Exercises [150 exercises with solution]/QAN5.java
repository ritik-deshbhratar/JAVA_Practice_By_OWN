
/* 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.Scanner;

public class QAN5 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int product = num1 * num2;
    System.out.println(product);

  }
}
