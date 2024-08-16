
// pattern inner loop / nested loop

public class Programe10 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        System.out.print(j - 1);

        // System.out.print(i);
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */

      }
      System.out.println();
    }
  }
}
