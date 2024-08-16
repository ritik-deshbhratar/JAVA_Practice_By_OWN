package JAVABYTEJASSIR.NestedLoopBYTejassir;

public class QAN10 {
  public static void main(String[] args) {
    int n = 5;
    for (int j = 0; j < n; j++) {
      for (int space = 0; space < n - j; space++) {
        System.out.print(" " + "  ");
      }
      for (int start = 0; start <= j; start++) {
        System.out.print("*" + "  ");
      }
      System.out.println();
    }

  }
}

/* 
                *  
            *  *  
         *  *  *  
      *  *  *  *  
   *  *  *  *  * 
 */