/*
 * 13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class QAN13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double Width = sc.nextDouble();
    double Height = sc.nextDouble();

    double area = Width * Height;

    double Parameter = 2 * (Width + Height);

    System.out.println("area of of ractangle is " + area);

    System.out.println("-------------------------------------------------------------------");

    System.out.println("The parameter of racatangle  is " + Parameter);
  }
}
