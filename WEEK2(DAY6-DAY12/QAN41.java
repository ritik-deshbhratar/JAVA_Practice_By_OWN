/* Write A JAVA 
program that accepts an enployee's ID, total worked hours of a month and the amount he
received per hour. Print the employee's ID and salary (with two decimal places) of a particular month.
Test Data
laput the Employees ID{Max. 10 chars): 0342 Input the working hrs: 8 Salary amount/hr: 15000

Expected Output: Einployees ID = u342
Salary = US 120000.00 */

import java.util.Scanner;

public class QAN41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("lnput the Employees ID{Max. 10 chars):");
    String employeeID = sc.nextLine();
    System.out.println("0342 Input the working hrs: 8");
    float work_hour_Inmonth = sc.nextFloat();
    System.out.println("Salary amount/hr: 15000");
    float amount_PerHour = sc.nextFloat();
    float salary;
    // Calculating the salary for the month
    salary = work_hour_Inmonth * amount_PerHour;

    // Printing the employee's ID and salary
    System.out.printf("Employee's ID = %s%n", employeeID);
    System.out.printf("Salary = U$ %.2f%n", salary);

  }
}
/*
 * Mohammad Laif
 * on Aug 24, 2017
 * They are format specifiers used in some methods like printf() to format the
 * string.
 * 
 * The %s is replaced with the times value (below in the example).
 * The %n tells the console print it in a new line.
 */