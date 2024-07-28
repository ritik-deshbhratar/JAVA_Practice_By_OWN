/*A7.Write java program to converta given integer (in days) to years, inonths and days, assumes that all months
have 30 days and all years have 365 ilays.
Test Data :
Input no. of days: 2535
Expected Output:
Yitar(s)
11 Months)
15 Dayls)  */

import java.util.Scanner;

public class QAN47 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the number of days
    System.out.print("Input no. of days: ");
    int totalDays = scanner.nextInt();

    // Convert days to years, months, and days
    int years = totalDays / 365;
    int remainingDays = totalDays % 365;
    int months = remainingDays / 30;
    int days = remainingDays % 30;

    // Print the result
    System.out.println("There are:");
    System.out.println(years + " Year(s)");
    System.out.println(months + " Month(s)");
    System.out.println(days + " Day(s)");

  }
}
