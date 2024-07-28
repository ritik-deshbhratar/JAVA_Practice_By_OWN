/* 39. Write a java  program to input electricity unit charges and calculate total electricity bill according to the given
ondition:
For first 50 units ks. For next 0.50/unit 100 units Rs. For next 100 0.75/unit units Rs. For unit 1.20/unit above 250 Rs. An 1.50/unit additional surcharge of 20% is added to 0.)write the bill */

import java.util.Scanner;

public class QAN39 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter The Electricity Unit : ");
    int unit = input.nextInt();
    float amt, surcharge, bill_amt;
    if (unit <= 50) {
      amt = unit * 0.50f;
    } else if (unit <= 150) {
      amt = unit * 0.75f;
    } else if (unit <= 250) {
      amt = unit * 1.20f;
    } else {
      amt = unit * 1.50f;
    }

    surcharge = amt * 0.2f;
    bill_amt = amt + surcharge;
    System.out.println("Total Electricity Bill : " + bill_amt);
  }
}
