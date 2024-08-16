package JAVABYTEJASSIR.NestedLoopBYTejassir;

public class QAN24 {
  public static void main(String[] args) {
    int n = 21;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 && j > n / 2 || i == n / 2 || i == n / 2 || j == 0 && i < n / 2 || j == n - 1 && 1 > n / 2) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }
}
// dikkat hai isme thodi .....