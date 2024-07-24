import java.util.*;

/* 27. Write a java program to input any character and check whether it is alphabet, digit or special chardcter.  */
public class QAN27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENETER ANY CHARECTER ");
    char ch = sc.next().charAt(0);
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println("enter CHarecter is a Alfabet " + ch);
    } else if (ch >= '1' && ch <= '9') {
      System.out.println("Enter character is Number " + ch);
    } else {
      System.out.println("Enter Charecter is Special cvharecter " + ch);
    }

  }
}
// logic f ((ch> = 'a' and ch< = 'z' ) or (ch> = 'A' and ch< = 'Z' )): print (
// "This is an alphabet." ) elif (ch> = '0' and ch< = '9' ): print ( "This is a
// digit."

// ore

/*
 * char ch = input.next().charAt(0);
 * if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
 * {
 * System.out.println("This is a Alphabet");
 * }
 * else if(ch>='0' && ch<='9')
 * {
 * System.out.println("This is a Number");
 * }
 * else
 * {
 * System.out.println("This is a Special Character");
 * }
 */
