/* Write aC program that read 5 numbers and sum of all odd values between them. Test Data:
Input the first number: 11
nput the second number: 17
input the third number: 13
Input the fourth number: 12
Input the fifth number: 5
Expected Output:
Sum of all odd values: 46 */

import java.util.Scanner;

public class QAN51 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sumOfOdds = 0;

    // Reading 5 numbers and checking if they are odd
    for (int i = 1; i <= 5; i++) {
      System.out.print("Input number " + i + ": ");
      int number = scanner.nextInt();

      // Check if the number is odd
      if (number % 2 != 0) {
        sumOfOdds += number;
      }
    }

    // Displaying the sum of odd values
    System.out.println("Sum of all odd values: " + sumOfOdds);
  }
}