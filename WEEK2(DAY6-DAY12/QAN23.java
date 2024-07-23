
/* 23. Write a Cprogram to check whether a number is even or odd. */
import java.util.Scanner;

public class QAN23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
      System.out.println("number is even " + number);
    } else {
      System.out.println("number is odd " + number);
    }
  }
}
