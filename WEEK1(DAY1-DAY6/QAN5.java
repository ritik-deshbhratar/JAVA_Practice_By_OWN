import java.util.Scanner;

import java.util.*;

public class QAN5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float Rdaius = sc.nextFloat();
    float Diameter = 2 * Rdaius;

    double ARea = Math.PI * 2 * Rdaius;

    double Circumference = Math.PI * 2 * Rdaius;
    /*
     * {
     * 
     * formulas
     * // Diameter of a Circle D = 2 × r
     * 
     * //Circumference of a Circle C = 2 × π × r
     * 
     * // Area of a Circle A = π × r2
     * 
     * }
     */

    System.out.println("ARea of the circle " +  " "+  ARea);
    System.out.println("Circumference of Circle" + " "  + Circumference);

  }
}
