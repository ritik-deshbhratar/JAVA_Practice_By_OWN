/*)write the java  program that accepts two item's weight (floating points' values ) and number of purchase
(Hoating points' values) and calculate the average value of the items.  */

import java.util.Scanner;

public class QAN40 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input for the first item's weight and quantity
    System.out.print("Enter the weight of the first item: ");
    float weight1 = scanner.nextFloat();
    System.out.print("Enter the quantity of the first item: ");
    float quantity1 = scanner.nextFloat();

    // Input for the second item's weight and quantity
    System.out.print("Enter the weight of the second item: ");
    float weight2 = scanner.nextFloat();
    System.out.print("Enter the quantity of the second item: ");
    float quantity2 = scanner.nextFloat();

    // Calculating total weight and total quantity
    float totalWeight = (weight1 * quantity1) + (weight2 * quantity2);
    float totalQuantity = quantity1 + quantity2;

    // Calculating the average weight
    float averageWeight = totalWeight / totalQuantity;

    // Output the average weight
    System.out.println("The average weight of the items is: " + averageWeight);
  }

}
