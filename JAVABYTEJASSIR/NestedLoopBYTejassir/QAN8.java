package JAVABYTEJASSIR.NestedLoopBYTejassir;

public class QAN8 {
  public static void main(String[] args) {

    int n = 20;
    for (int j = 0; j < n - j; j++) {
      for (int i = 0; i < n - j; i++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
/*
output 
 * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * *
 * * * * * * * * * * * * *
 * * * * * * * * * * * *
 * * * * * * * * * * *
 */