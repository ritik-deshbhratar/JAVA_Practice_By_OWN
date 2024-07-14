/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class QAN6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int FirstNumber = sc.nextInt();
    int SecondNumber = sc.nextInt();

    System.out.println("Sume of two number ");
    System.out.println(FirstNumber + SecondNumber);

    System.out.println("minus of Two number ");

    System.out.println(FirstNumber - SecondNumber);

    System.out.println("product of two number");

    System.out.println(FirstNumber * SecondNumber);

    System.out.println("Divided of Two number ");

    System.out.println(FirstNumber / SecondNumber);

    System.out.println("Modulo of two number ");

    System.out.println(FirstNumber % SecondNumber);

  }
}
