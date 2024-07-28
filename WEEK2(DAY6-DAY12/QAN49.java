/* 9. Write a java program to print the roots of Bhaskara's formula from the given three ffoating numbers. Display
a message if it is not
Test Data: possible to find the roots
Input the first number(a): 25
Input the second number(b): 35 input the third number(c): 12 Erfcted Output:
HO Jtl= -0.60000
Root2 = -o.80000  */

import java.util.Scanner;

public class QAN49 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the coefficients
    System.out.print("Input the first number (a): ");
    double a = scanner.nextDouble();

    System.out.print("Input the second number (b): ");
    double b = scanner.nextDouble();

    System.out.print("Input the third number (c): ");
    double c = scanner.nextDouble();

    // Calculate the discriminant
    double discriminant = b * b - 4 * a * c;

    // Check if roots are possible
    if (discriminant > 0) {
      // Two real and distinct roots
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.printf("Root1 = %.5f%n", root1);
      System.out.printf("Root2 = %.5f%n", root2);
    } else if (discriminant == 0) {
      // One real and repeated root
      double root = -b / (2 * a);
      System.out.printf("Root = %.5f%n", root);
    } else {
      // Roots are not real numbers
      System.out.println("It is not possible to find the roots.");
    }
  }
}
