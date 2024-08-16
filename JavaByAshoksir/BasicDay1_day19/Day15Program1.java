// Switch case 

// write a  java programe to read a numb er from keyboard // based on the number print the week of the day 

import java.util.*;

public class Day15Program1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Week day ");
    int day = sc.nextInt();

    switch (day) {
      case 1:
        System.out.println("Monday ");
        break;
      case 2:
        System.out.println("Tuesday ");
        break;
      case 3:
        System.out.println("Wednesday ");
        break;
      case 4:
        System.out.println("Thursday ");
        break;
      case 5:
        System.out.println("Friday ");
        break;
      case 6:
        System.out.println("shaturday ");
        break;
      case 7:
        System.out.println("Sunday");
        break;

      default:
        System.out.println("Enter valide day number");
        break;
    }

  }
}
