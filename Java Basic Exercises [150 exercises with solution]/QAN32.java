/* 32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
Click me to see the solution  */

import java.util.Scanner;

public class QAN32 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    if (number1 == number2)
      System.out.printf("%d == %d\n", number1, number2);
    if (number1 != number2)
      System.out.printf("%d != %d\n", number1, number2);
    if (number1 < number2)
      System.out.printf("%d < %d\n", number1, number2);
    if (number1 > number2)
      System.out.printf("%d > %d\n", number1, number2);
    if (number1 <= number2)
      System.out.printf("%d <= %d\n", number1, number2);
    if (number1 >= number2)
      System.out.printf("%d >= %d\n", number1, number2);

  }
}
