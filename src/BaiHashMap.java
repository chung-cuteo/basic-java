import java.util.HashMap;
import java.util.Scanner;

public class BaiHashMap {
  public static void main(String[] args) {
    // // 1. kai bao
    // HashMap<Integer, String> map = new HashMap<>();
    // HashMap<Float, String> map1 = new HashMap<>();
    // // 2. cac phuong thuc
    // map.put(1, "chung");
    // map.put(2, "chung1");
    // map.put(2, "chung2");
    // map.put(3, "chung3");

    // System.out.println(map);
    // System.out.println(map.get(1));
    // System.out.println(map.containsKey(1));
    // System.out.println(map.containsValue("chung"));
    // map.remove(2);
    // System.out.println(map);

    // // size
    // System.out.println(map.size());
    // // duyet
    // for (Integer key : map.keySet()) {
    // String value = map.get(key);
    // System.out.println(value);

    // }

    // bai tap

    HashMap<String, String> user = new HashMap<>();
    user.put("user1", "1");
    user.put("user2", "2");
    user.put("user3", "3");
    user.put("user4", "4");
    user.put("user5", "5");

    Scanner sc = new Scanner(System.in);
    System.out.println("nhap user name");
    String name = sc.nextLine();

    if (!user.containsKey(name)) {
      System.out.println("user ko ton tai");
    } else {
      System.out.println("nhap password");
      String password = sc.nextLine();
      if (!user.get(name).equals(password)) {
        System.out.println("sai mat khau");
      } else {
        System.out.println("ban nhap thanh cong");
      }
    }
  }

}
