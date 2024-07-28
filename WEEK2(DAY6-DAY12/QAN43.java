/* Write a C program to calculate a blke's average consumption from the glven total distance (integer value)
traveled in km) and spent fuel (n liters, float number-2 decimal polnt).
Test Data:
Input total distance in km: 350
Ioput total fuel spent in liters:5
Expected Outpiut:
Average consumption (kn/t) 70.000 */

import java.util.*;

public class QAN43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the traveled IN Kilometer ");
    int traveled_In_KM = sc.nextInt();
    System.out.println("Enter the spent_Fuel ");
    float spent_Fuel = sc.nextFloat();
    float average_Bike;

    average_Bike = (traveled_In_KM / spent_Fuel);

    System.out.printf("Average consumption (kn/t) %.2f%n", average_Bike);
    // here we are using + to print the average but ythe + is taken as Concatination
    // operator
    // System.out.println("Average consumption (kn/t) %.2f%n" + average_Bike);
  }
}
/*
 * Java provides the following three ways to display double in 2 decimal places:
 * 
 * Using DecimalFormat ("0.00")
 * Using String.format() Method ("%.2f") // "%.2f"
 * Using BigDecimal
 * Let's discuss the above ways one by one.
 */