public class Programe9 {
  public static void main(String[] args) {
    int a = 22;
    int b = 35;
    int c = 10;
    int ans = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    System.out.println(ans);
  }
}
