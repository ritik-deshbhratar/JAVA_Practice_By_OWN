import java.util.Scanner;

public class QAN3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double length = sc.nextDouble();
    double Width = sc.nextDouble();
    double Perimeter;
    Perimeter = (2 * (length + Width));

    System.out.println(Perimeter);

  }
}
