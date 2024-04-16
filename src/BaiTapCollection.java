import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTapCollection {
  public static void main(String[] args) {
    /*
     * bai1
     * viet truong trinh tao ra 1 list co n phan tu nhap tu ban phim cac pahn tu
     * ngau nhien den 100
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("nhap vao so luong phan tu collection");
    // int n = sc.nextInt();
    // Random random = new Random();

    // ArrayList<Integer> lst = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    // int ngauNhien = random.nextInt(101);
    // lst.add(ngauNhien);
    // }

    // System.out.println(lst);

    /*
     * bai2 viet mot chuong tring
     * nhap n tu ban phim tao mang
     * binh phuong cac phan tu
     * xac dinh co bao nhieu pahn tu nho hon 50
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao so luong phan tu collection");
    int n = sc.nextInt();
    ArrayList<Integer> lst = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.println("Moi nhap vapo phan tu thu : " + (i + 1));
      int soNhap = sc.nextInt();
      lst.add(soNhap);
    }

    System.out.println(lst);

    ArrayList<Integer> listBinhphuong = new ArrayList<>();
    for (int x : lst) {
      listBinhphuong.add(x * x);
    }

    System.out.println(listBinhphuong);

    int count = 0;
    for (int x : listBinhphuong) {
      if (x > 50) {
        count++;
      }
    }
    System.out.println(count);
  }
}
