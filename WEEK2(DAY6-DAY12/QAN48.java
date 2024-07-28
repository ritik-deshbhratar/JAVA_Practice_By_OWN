/*8)Wrnte a java  program that accepts 4 integers p, 9,r, s from the user wherer ands are positive and p is even.
if g is 8reater thanr and s is greater than p and if the sum ofr and s is greater than the sum of p and q print
"Correct values", otherwise print "Wrong values. Test P m fltitan to Inpur' the second integer: 35
input the third integer: 15
Input the fourth integer: 46
Expected Output:
Wrong values   */

import java.util.Scanner;

public class QAN48 {
  public static void main(String[]args){
   Scanner scanner = new Scanner(System.in);

        // Reading 4 integers
        System.out.print("Input the first integer (p): ");
        int p = scanner.nextInt();

        System.out.print("Input the second integer (q): ");
        int q = scanner.nextInt();

        System.out.print("Input the third integer (r): ");
        int r = scanner.nextInt();

        System.out.print("Input the fourth integer (s): ");
        int s = scanner.nextInt();

        // Checking conditions
        if (r > 0 && s > 0 && p % 2 == 0 && q > r && s > p && (r + s) > (p + q)) {
            System.out.println("Correct values");
        } else {
            System.out.println("Wrong values");
        }

  }
}
