import java.time.Year;
import java.util.Scanner;

/*24. Write  a java programe  to check whether a year is leap year or :ot. 
 *
 * To check if a year is a leap year, divide the year by 4. If it is fully divisible by 4, it is a leap year. For example, the year 2016 is divisible 4, so it is a leap year, whereas, 2015 is not. However, Century years like 300, 700, 1900, 2000 need to be divided by 400 to check whether they are leap years or not.  */
public class QAN24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter yaear ");
    int Year = sc.nextInt();
    if (Year % 4 == 0) {
      System.out.println("Year is leap Year " + Year);
    } else {
      System.out.println("Year is not leap year");
    }
  }
}
