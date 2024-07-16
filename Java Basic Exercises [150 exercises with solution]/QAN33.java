/*33. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output */

import java.util.Scanner;

public class QAN33 {
  public static void main(String args[]) {
    int number, digit, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    number = sc.nextInt();
    while (number > 0) {
      // finds the last digit of the given number
      digit = number % 10; /* digit = 25 % 10 = > 5 reminder hi last word hota hai */
      // digit = 5;
      // adds last digit to the variable sum
      sum = sum + digit;
      // sum = 0 + 5 ;
      // sum = 5 
      // removes the last digit from the number
      number = number / 10;
      // number = 2 ; 
      // then it will check the condition 

      // condtion true then it will be like this 

      // digit = number % 10 
      // digit  = 2 % 10 => ans is 2 = ;
       // sum = sum + digit ;
       //  sum = 5 + 2= ans is = 7  
          }
    // prints the result
    System.out.println("Sum of Digits: " + sum);

  }
}
