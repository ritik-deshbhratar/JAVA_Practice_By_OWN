/*13. Write a i program to tonpute the perimeter and area of a rectang vwith a he-ght of 7 inches. and widtn
of S in hes
Expecd Output:
Perim tr d the rectangle* 4 inces Area he rectangle r *5 S0are inhe */

public class QAN13 {
  public static void main(String[] args) {
    int width;
    int height;

    int area; /* Variable to store the area of the rectangle */
    int perimeter; /* Variable to store the perimeter of the rectangle */

    /* Assigning values to height and width */
    height = 7;
    width = 5;

    /* Calculating the perimeter of the rectangle */
    perimeter = 2 * (height + width);
    System.out.printf("Perimeter of the rectangle = inches\n", perimeter);

    /* Calculating the area of the rectangle */
    area = height * width;
    System.out.printf("Area of the rectangle = square inches\n", area);
  }
}
