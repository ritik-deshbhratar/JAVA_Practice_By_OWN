/*4. Wnte a java  program to read an amount (integer value) and break the amount into smallest possible number
of bank notes.
Test Data
Input the amount: 375
Expected Output: here are:
3 Notels) of 100.00
1 Note(s) of 50.00
I Note(s) of 20.00
O Noteis) of 10.00
1 Note(s) of 5.00
O Note(s) of 2.00
O Notels) of 1.00  */

import java.util.*;

public class QAN45 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the amount: ");
    int amount = scanner.nextInt();

    int hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0, twos = 0, ones = 0;

    if (amount >= 100) {
      hundreds = amount / 100;
      amount = amount % 100;
    }
    if (amount >= 50) {
      fifties = amount / 50;
      amount = amount % 50;
    }
    if (amount >= 20) {
      twenties = amount / 20;
      amount = amount % 20;
    }
    if (amount >= 10) {
      tens = amount / 10;
      amount = amount % 10;
    }
    if (amount >= 5) {
      fives = amount / 5;
      amount = amount % 5;
    }
    if (amount >= 2) {
      twos = amount / 2;
      amount = amount % 2;
    }
    if (amount >= 1) {
      ones = amount / 1;
      amount = amount % 1;
    }

    System.out.println("Here are:");
    System.out.println(hundreds + " Note(s) of 100.00");
    System.out.println(fifties + " Note(s) of 50.00");
    System.out.println(twenties + " Note(s) of 20.00");
    System.out.println(tens + " Note(s) of 10.00");
    System.out.println(fives + " Note(s) of 5.00");
    System.out.println(twos + " Note(s) of 2.00");
    System.out.println(ones + " Note(s) of 1.00");

  }
}
