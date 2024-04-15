import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("moi nhap so");
    int x = sc.nextInt();
    int sodu = x % 2;

    switch (sodu) {
      case 0:
        System.out.println("so chan");
        break;

      default:
        System.out.println("so le");
        break;
    }
  }
}
