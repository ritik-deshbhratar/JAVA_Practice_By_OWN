/* 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
Expected Output :
Hello
Alexandra Abramov */

import java.util.Scanner;

public class QAN1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.println("Hello");

    System.out.println(name);

  }
}