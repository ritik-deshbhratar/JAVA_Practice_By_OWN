/* 15. Write a Java program to swap two variables.  */

import java.util.Scanner;

public class QAN15 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp;

    temp = a; // temp = 10;
    a = b; // a = 20 ;
    b = temp; // b = 10;
    System.out.println(a);
    System.out.println(b);
    System.out.println("Swaping the num");
  }
}
