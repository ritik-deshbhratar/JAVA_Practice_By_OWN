
/* 37. Write a java  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
Caiculate percentage and grade according to follaowing: 
Percentage > 90%: Grode A 
Percentage >= 80% : Grade B
 Percentage >= 70% : Grade C 
 Percentage >= 60%:Grade D 
 percentage >= 40% : Grade E 
 percentage < 40% :Grade F */
import java.util.Scanner;

public class QAN37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Physics = sc.nextDouble();
    double Chemistry = sc.nextDouble();
    double Biology = sc.nextDouble();
    double Mathematics = sc.nextDouble();
    double Computer = sc.nextDouble();
    double Percentage, Total; // (value/total value)×100%.
    Total = (Physics + Chemistry + Biology + Mathematics + Computer);
    Percentage = Total / 500 * 100;

    if (Physics > 100 || Physics < 0) {
      System.out.print("Enter valid data in between 1 to 100");

    } else if (Chemistry > 100 || Physics < 0) {
      System.out.print("Enter valid data in between 1 to 100");

    } else if (Biology > 100 || Physics < 0) {
      System.out.print("Enter valid data in between 1 to 100");
    } else if (Mathematics > 100 || Physics < 0) {
      System.out.print("Enter valid data in between 1 to 100");
    } else if (Computer > 100 || Physics < 0) {
      System.out.print("Enter valid data in between 1 to 100");
    }

    else if (Percentage > 90) {
      System.out.println("You got a " + Percentage + " " + "Grade A ");
    }

    else if (Percentage >= 80) {
      System.out.println("You got a " + Percentage + "Grade B");
    }

    else if (Percentage >= 70) {
      System.out.println("You got a Percentage is " + Percentage + " " + "Grade C");
    } else if (Percentage >= 60) {
      System.out.println("You got a  Percentage is " + Percentage + " " + "Grade D");
    } else if (Percentage >= 40) {
      System.out.println("You got a  Percentage is " + Percentage + " " + "Grade E");
    }

    else if (Percentage < 40) {
      System.out.println("You got a Percentage is  " + Percentage + " " + "Grade Fails ");
    }

  }
}