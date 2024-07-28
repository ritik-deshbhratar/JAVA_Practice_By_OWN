import java.util.Scanner;

public class QAN6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your lenth in centimeter");
    double lenthinCentimeter = sc.nextInt();

    double meter, kilometers;

    /*
     * To convert cm to m, multiply the given centimeter value by 0.01 m. For
     * example, 5 cm to m is calculated as follows:
     * 
     * 5 cm = 5 x 0.01 m
     * 
     * 5 cm = 0.05 m
     * 
     * Hence, 5 cm is approximately equal to 0.05 m.
     */

    meter = lenthinCentimeter * 0.01;

    System.out.println("centemeter converted to meter " + " " + meter);

    kilometers = meter * 0.005;

    System.out.println("converting metery to kilometer " + " " + kilometers);
  }
}
