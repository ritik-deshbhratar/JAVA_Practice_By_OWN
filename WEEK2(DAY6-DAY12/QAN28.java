/* 28. Write a java program to check whether a character is uppercase or lowercase alphabet.  */

import java.util.*;

public class QAN28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Enter Character is Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("ENeter Charectr is Uppercase ");
        } else {
            System.out.println("Enter Charecter is Speciale char/Number  ");

        }
    }
}
