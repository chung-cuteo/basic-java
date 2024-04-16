import java.util.Arrays;

public class BaiArray {
  public static void main(String[] args) {
    // // c1 khai bao mang
    // String[] mangString;
    // int[] mangInt;

    // // c2 khoi tao mang kem kich thuoc
    // String[] mangStr2 = new String[12];
    // int[] mangInt2 = new int[12];

    // // c3 khoi tao mang kem gia tri ban dau
    // String[] mangStr3 = new String[] { "a", "b", "c" };
    // String[] mangStr3 = { "a", "b", "c" };

    // // kiem tra do dai
    // System.out.println(mangStr3.length);

    // // duyet mang
    // // c1
    // for (int i = 0; i < mangStr3.length; i++) {
    // System.out.println(mangStr3[i]);
    // }
    // // c2
    // for (String str : mangStr3) {
    // System.out.println(str);
    // }

    // sap xep mang
    int[] arr1 = { 8, 7, 6, 4, 3 };
    // int[] arr2 = arr.clone();

    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr1));
    // System.out.println(Arrays.toString(arr2));

    // dao nguoc mang

    for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
      int temp = arr1[i];
      arr1[i] = arr1[j];
      arr1[j] = temp;
    }
    System.out.println(Arrays.toString(arr1));
  }
}
