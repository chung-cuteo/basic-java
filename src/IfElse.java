import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Moi nhap du lieu");

    double dtb = sc.nextDouble();

    if (dtb >= 5.0)
      System.out.println("ban do");
    else
      System.out.println("ban truot");
  }
}
