import java.util.*;

/* 30. Write java  program to input month number and print number of days In that month */
public class QAN30 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Eneter Month between 1 - 12 ");
    int month = sc.nextInt();
    if (month == 1) {
      System.out.println("Number of Days 31..& the name of month is Junvary");
    } else if (month == 2) {

      System.out.println("Number of Days 28 ..& the name of month is Frebruary");

    } else if (month == 3) {
      System.out.println("Number of Days 31 ..& the name of month is March ");
    } else if (month == 4) {
      System.out.println("Number of Days 30 ..& the name of month is April");
    } else if (month == 5) {
      System.out.println("Number of Days 31 ..& the name of month is May ");
    } else if (month == 6) {
      System.out.println("Number of Days 30 ..& the name of month is June");
    } else if (month == 7) {
      System.out.println("Number of Days 31 ..& the name of month is July");
    } else if (month == 8) {
      System.out.println("Number of Days 31 ..& the name of month is August");
    } else if (month == 9) {
      System.out.println("Number of Days 30..& the name of month name is september ");
    } else if (month == 10) {
      System.out.println("Number of Days 31 ..& the name of month is octomber");
    } else if (month == 11) {
      System.out.println("Number of Days 30 ..& the name of month is November ");
    } else if (month == 12) {
      System.out.println("Number of Days 31..& the name of month is December");
    }

    else {
      System.out.println("enter Valid month number 1 - 12 ");
    }
  }

}
// using switch case mport java.util.Scanner;

/*
 * public class Number_OfDays
 * {
 * public static void main(String[] args)
 * {
 * Scanner input = new Scanner(System.in);
 * int mon = 0;
 * int days;
 * System.out.printf("Enter the Month Number : ");
 * mon = input.nextInt();
 * switch(mon)
 * {
 * case 1:
 * case 3:
 * case 5:
 * case 7:
 * case 8:
 * case 10:
 * case 12:
 * System.out.print("Number of Days 31..");
 * break;
 * case 4:
 * case 6:
 * case 9:
 * case 11:
 * System.out.print("Number of Days 30..");
 * break;
 * case 2:
 * days = 28;
 * break;
 * default:
 * System.out.printf("Invalid...Please Enter the 1 to 12...");
 * break;
 * }
 * }
 * }
 * 
 */