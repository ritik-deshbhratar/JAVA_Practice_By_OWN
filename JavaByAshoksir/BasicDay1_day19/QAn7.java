public class QAn7 {
  public static void main(String[] args) {
    int a = 5;
    int b = a-- + --a + a--;
    // b = 5 (a holding 4 ) + 3 (a holding 3) + 3 (now a is holding 2 ); => 5+3+3=11
    // if we use (--a) in last then it gives ooutput as 10;
    System.out.println(b);

  }
}
