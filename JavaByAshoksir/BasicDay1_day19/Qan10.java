
// it contain both if else and reading data by keyubourd with buffered reader 
import java.io.*;
import java.io.BufferedReader;

public class Qan10 {
  public static void main(String[] args) throws Exception {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String str = br.readLine();
    int age = Integer.parseInt(str);

    if (age >= 18) {
      System.out.println("Chala le bosdike ho gay javan tu ");
    } else {
      System.out.println("Gand dhona sikh le lawde " + age + " " + "ka hai bhai umar kam hai teri ");
    }

  }
}
