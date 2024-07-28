
/* A Write java  program to calculate the distance between the two points.
Test Data
Input x1: 25
tnput y1: 15
Input x2: 35
Input y2: 10
Expected Output:
Distance between the said points: 11.1803  */
import java.util.Scanner;

public class QAN44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1 = sc.nextInt();
    double x2 = sc.nextInt();
    double y1 = sc.nextInt();
    double y2 = sc.nextInt();
    double Distance;
    // d=√((x2 – x1)² + (y2 – y1)²)

    Distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    // Math.sqrt((x2 - x1) * 2) + ((y2 * y1) * 2); its wrong wroteen by ritik
    System.out.printf("Distance between the said points: %.4f%n", Distance);
  }
}
