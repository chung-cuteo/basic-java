public class ToanLogic {
  public static void main(String[] args) {
    int i = 15;

    System.out.println(i > 10 && i < 10); // false
    System.out.println(i > 10 || i < 10); // => true
    System.out.println(!(i > 10 || i < 10)); // => false

    // toan tu tien to hau to
    int x = 100;
    int y = 90;
    int z = 80;
    int t = 70;

    System.out.println(x++);
    System.out.println(++y);
    System.out.println(z--);
    System.out.println(--t);

    /*
     * x++ => postfix
     * ++x => prefix
     * b1. tinh prefix
     * b2. tinhs phep tinh con lai (chua tinh post fix)
     * b3 gan kq cho ve trai
     * b4 tinh gia tri postfix
     */
  }
}
