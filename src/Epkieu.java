public class Epkieu {
  // 1. ep kei rong , ep kei tu du lieu be sang du lieu to
  // ex: int => long => float => double

  // 2. ep kei hep, ep tu lon sang be => that thoat du lieu
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    double kq = (double) a / b; // int => double
    System.err.println(kq);

    // ep kei hep
    int c = 128;
    byte d = (byte) c;
    System.out.println(c); // 128
    System.out.println(d); // -128 => that thoat du lieu
  }

}
