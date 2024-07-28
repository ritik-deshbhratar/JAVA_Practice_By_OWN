import java.util.*;

public class QAN2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    // programe to perform all arithmatic operation on two input

    // sum / additon +
    int Sum = num1 + num2;
    System.out.println("Sum of two inputs" + " " + Sum);

    // substraction of Two number -
    int SUbstraction = num1 - num2;
    System.out.println("SUbstraction of two num " + " " + SUbstraction);

    // Multiplication of two number *
    int multiplication = num1 * num2;
    System.out.println("Multiplication of two number" + " " + multiplication);

    // DIVID OF TWO NUMBER /
    int divid = num1 / num2;
    System.out.println("Divident of two inputs" + " " + divid);

    // REMINDER OF TWO NUYMBER %
    int reminder = num1 % num2;
    System.out.println("Reminder of two inputs is " + " " + reminder);

  }
}
