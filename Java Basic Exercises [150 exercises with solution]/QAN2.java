//package Java Basic Exercises [150 exercises with solution];

/*2. Write a Java program to print the sum of two numbers.
  Test Data:
  74 + 36
  Expected Output :
  110 */
import java.util.*;

public class QAN2 {
  public static void main(String arsg[]) {
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    int sum;
    sum = num1 + num2;
    System.out.println("Sume of num1 & num2 is " + sum);
  }
}
