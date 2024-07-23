
/* 25. Write aCprogram to check whether a character is alphabet or not.  */
import java.util.*;

public class QAN25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char c = sc.next().charAt(0);
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
      System.out.println(c + " is an alphabet.");
    else
      System.out.println(c + " is not an alphabet.");
  }
}
// anouther way to solve
/*
 * public class Alphabet {
 * 
 * public static void main(String[] args) {
 * 
 * char c = 'A';
 * 
 * String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
 * ? c + " is an alphabet."
 * : c + " is not an alphabet.";
 * 
 * System.out.println(output);
 * }
 * }
 */

// third way to solve problem using isAlphabetic() Method
/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * // declare a variable
 * char c = 'a';
 * 
 * // checks if c is an alphabet
 * if (Character.isAlphabetic(c)) {
 * System.out.println(c + " is an alphabet.");
 * }
 * else {
 * System.out.println(c + " is not an alphabet.");
 * }
 * }
 * }
 */