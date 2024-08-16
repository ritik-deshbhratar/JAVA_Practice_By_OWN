
//role Finder 
import java.util.*;

public class Qan12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter exp");
    int exp = sc.nextInt();
    if (exp >= 3 && exp <= 2) {
      System.out.println("Associate Trainee engineer ");
    } else if (exp >= 3 && exp <= 5) {
      System.out.println("Associate  engineer ");
    } else if (exp >= 10 && exp <= 13) {
      System.out.println("manager ");
    } else {
      System.out.println("Role not found ");
    }

  }
}
