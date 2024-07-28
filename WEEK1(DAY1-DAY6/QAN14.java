
/*4.Write aC program to u ute the perimeter and ares of a cirete with a radius of 6 inches.
Expe ted Output: 

Perimeter of the Circle Area of 37.680000 inches the Circle = 113.040001 square inches
*/
import java.util.*;

public class QAN14 {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double radius = 6;

    double Circle;
    double Area, perimeter;
    /* Calculating the perimeter of the circle */
    perimeter = 2 * 3.14 * radius;
    System.out.println("Perimeter of the Circle =" + perimeter);

    /* Calculating the area of the circle */
    Area = 3.14 * radius * radius;
    System.out.println("Area of the Circle square inches " + Area);

  }

}
