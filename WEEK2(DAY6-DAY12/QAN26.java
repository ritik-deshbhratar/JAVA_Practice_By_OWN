
/* . Write a JAVA program to input any alphabet and check whether it is vowel or consenant */
import java.util.*;

public class QAN26 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Eneter your Alfabet ");
    char ch = sc.next().charAt(0);
    // char ch = 'i';

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + " is vowel");
    }

    else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println(ch + " is upper ALFABET VOWEL");
    }

    else {
      System.out.println(ch + " " + "is constraint ");
    }
  }
}

/*
 * public class VowelConsonant {
 * 
 * public static void main(String[] args) {
 * 
 * char ch = 'z';
 * 
 * switch (ch) {
 * case 'a':
 * case 'e':
 * case 'i':
 * case 'o':
 * case 'u':
 * System.out.println(ch + " is vowel");
 * break;
 * default:
 * System.out.println(ch + " is consonant");
 * }
 * }
 * }
 */