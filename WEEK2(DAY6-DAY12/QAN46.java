
/*46. Write a Cprogram to convert a given inteyer (in seconds) to hours, minutes and seconds.
Test Data:
Input seconds: 25300
Expected Output:
There are:
H:M:5-7:1:40  */
import java.util.*;

public class QAN46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Second ");
    int totalSeconds = sc.nextInt();
    int hour, minutes;
    // Convert seconds to hours, minutes, and seconds
    int hours = totalSeconds / 3600;
    minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;

    // Print the result
    System.out.println("There are:");
    System.out.printf("H:M:S - %d:%d:%d%n", hours, minutes, seconds);
  }
}
