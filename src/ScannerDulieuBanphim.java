import java.util.Scanner;

public class ScannerDulieuBanphim {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // nhap text
    System.out.println("nhap mat khau");
    String mk = sc.nextLine();
    System.out.println("mat khau da nhap la: " + mk);

    // nhap so nguyen
    System.out.println("moi nhap so nguyen");
    int number = sc.nextInt();
    System.out.println(number);

    // ...
  }
}
