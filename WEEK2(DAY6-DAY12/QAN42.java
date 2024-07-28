/*42) Write a java 
program that accepts three integers and find the naximum of three.
Test Data:
hput the first integer: 25 
nput the second integer: 35
nput the third integer: 15
xpected Output:
Maximum value of three integers: 35 */

import java.util.Scanner;

public class QAN42 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input the first integer:");
    int first_Integer = sc.nextInt();
    System.out.println("input the second integer:");
    int second_Integer = sc.nextInt();
    System.out.println("input the Third integer:");
    int Third_Integer = sc.nextInt();

    if (first_Integer <= 0 || second_Integer <= 0 || Third_Integer <= 0) {
      System.out.println("its a Wronmg input plaese Change the data ");

    } else if (first_Integer > second_Integer && first_Integer > Third_Integer) {
      System.out.println("First integer is gretest value " + first_Integer);
    } else if (second_Integer > Third_Integer && second_Integer > first_Integer) {
      System.out.println("second_Integer is gretest value " + second_Integer);
    } else {
      System.out.println("Third integer is greter than all valuses enter ");
    }
  }
}
