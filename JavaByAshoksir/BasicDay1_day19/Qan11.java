
// odd eVERN WITH BUFFERDREADER 
import java.io.*;
import java.io.BufferedReader;

public class Qan11 {
  public static void main(String[] args) throws Exception {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter your Numb er ");
    String str = br.readLine();

    int Number = Integer.parseInt(str);

    if (Number % 2 == 0) {
      System.out.println("its even");
    } else {
      System.out.println("ja na ma  ke lawde Odd hai tu ");
    }
  }
}
