public class Ham {
  public static void main(String[] args) {
    int kq = Cong(2, 3);
    System.out.println(kq);
    Message("hello chung");
  }

  // ham co return
  public static int Cong(int x, int y) {
    int tong = x + y;
    return tong;
  }

  // ham ko co return
  public static void Message(String message) {
    System.out.println(message);
  }
}
