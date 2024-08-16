package JAVABYTEJASSIR.NestedLoopBYTejassir;

public class QAN5 {
  public static void main(String[] args) {
    int n = 5;
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < j; i++) {
        System.out.print("  " + "  ");
      }
      for (int i = 0; i < n - j; i++) {
        System.out.print("*" + "  ");
      }
      System.out.println();
    }
  }
}
