public class QAN6 {
  public static void main(String[] args) {
    int a = 5;
    int b = ++a + a++ + a++;
    // int b = 6 + (6++) here a is holding 6 + 7 = > now a is holding 8 => 19
    System.out.println(b);
  }
}
