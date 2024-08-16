// increment / decrenment 
public class QAN4 {
  public static void main(String[] args) {
    int a = 5;
    System.out.println("Before increment values  : " + a);
    a++;
    System.out.println("after increment values  : " + a);

    int b = 10;
    System.out.println("before " + b++); // it print 10only becouse the value of b is 10 after printing it will
                                         // increment the value then b holds the vlaues is 11 then again we are done
                                         // increment thats why its becomes 12 then it print 12 ;
    b++;
    System.out.println("After" + b);
  }
}
