/*  $2 Write a java program that reads three floating values and check if it is possible to make a triangle with then.
Also calculate the perimeter of the triangle if the said values are valid. Test Data:
Input the first integer: 5
Input the second integer: 15
Input the third integer: 10
Expected Output:
Numbers in sorted oruer: 5 10 15*/

import java.util.Scanner;

public class QAN52 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the three floating values
    System.out.print("Input the first floating value: ");
    double a = scanner.nextDouble();
    System.out.print("Input the second floating value: ");
    double b = scanner.nextDouble();
    System.out.print("Input the third floating value: ");
    double c = scanner.nextDouble();

    // Check if the values can form a triangle
    if (a + b > c && a + c > b && b + c > a) {
      // Calculate the perimeter
      double perimeter = a + b + c;
      System.out.printf("The values can form a triangle.\nThe perimeter of the triangle is: %.2f\n", perimeter);
    } else {
      System.out.println("The values cannot form a triangle.");
    }
  }
}
