
/* 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
import java.util.Scanner;

public class QAN7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // multiplication table without any statment & loop
    int table;

    System.out.println(table = num1 * 1);
    System.out.println(table = num1 * 2);
    System.out.println(table = num1 * 3);
    System.out.println(table = num1 * 4);
    System.out.println(table = num1 * 5);
    System.out.println(table = num1 * 6);
    System.out.println(table = num1 * 7);
    System.out.println(table = num1 * 8);
    System.out.println(table = num1 * 9);
    System.out.println(table = num1 * 10);

  }
}
