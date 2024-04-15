import java.util.Scanner;

public class ToanTuBaNgoi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("moi nhap so");
    int a = sc.nextInt();

    String kq = (a % 2 == 0) ? "chan" : "le";
    System.out.println(kq);

  }
}
