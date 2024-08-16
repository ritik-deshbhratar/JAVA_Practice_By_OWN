public class QAN5_ {
  public static void main(String[] args) {
    int a = 5;
    int b = ++a + a++;
    // int b = ++5 =(6) + 6++ a holding 7
    // but operation on pree == 6 + 6 - 12
    System.out.println(b);

  }
}
