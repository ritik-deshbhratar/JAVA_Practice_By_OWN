
// 21. Write a java program to check whether a number is negative, positive or zer. 
import java.util.Scanner;

public class QAN21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num > 0) {
      System.out.println("number is integer and Positive ");
    } else if (num == 0) {
      System.out.print("number is zero ");
      ;
    }

    else {
      System.out.print("Number is Negative Number ");
    }
  }
}
