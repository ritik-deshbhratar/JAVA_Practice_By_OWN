import java.util.Scanner;

// anouther approach to solve the (QAN19. Write a C program to find maximum between two numbers )
public class QAN19A {
  public static void main(String[] args) {
    int Num1, Num2;
    Scanner sc = new Scanner(System.in);
    Num1 = sc.nextInt();
    Num2 = sc.nextInt();

    if (Num1 == Num2 || Num1 <= 0 || Num2 <= 0) {
      System.out.println("invalide data  please enter the valid data");

    } else if (Num1 > Num2) {
      System.out.println("Num 1 is greater than Num2  ==>" + Num1);
    } else {
      System.out.println("Num2 is greater than Num1 ==>" + Num2);
    }
  }
}
