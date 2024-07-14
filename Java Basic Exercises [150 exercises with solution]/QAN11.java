
/*11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */
import java.util.Scanner;

public class QAN11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Radius = sc.nextDouble();
    // Calculate the perimeter of the circle using the constant radius
    double perimeter = 2 * Math.PI * Radius;

    // Calculate the area of the circle using the constant radius
    double area = Math.PI * Radius * Radius;

    // Print the calculated perimeter and area
    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);

  }
}
