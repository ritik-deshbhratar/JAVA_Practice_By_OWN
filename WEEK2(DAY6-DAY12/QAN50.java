/* 50. Write a java  program that reads an integer and check the specified range where it belongs. Print an error
message if the number is negative and Test Data: greater than 80.
Input an integer: 15
Expected Output:
Range (0, 20  */

import java.util.Scanner;

public class QAN50 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Input the integer
    System.out.print("Input an integer: ");
    int number = scanner.nextInt();

    // Check the range and print the appropriate message
    if (number < 0 || number > 80) {
      System.out.println("Error: The number is negative or greater than 80.");
    } else if (number >= 0 && number <= 20) {
      System.out.println("Range (0, 20)");
    } else if (number >= 21 && number <= 40) {
      System.out.println("Range (21, 40)");
    } else if (number >= 41 && number <= 60) {
      System.out.println("Range (41, 60)");
    } else if (number >= 61 && number <= 80) {
      System.out.println("Range (61, 80)");
    }

  }

}
