package BaiInterface;

public class Test {
    public static void main(String[] args) {
        KeThuaInterface keThuaInterface1 = new KeThuaInterface();
        keThuaInterface1.thongTin("chung", 1424242, 1993);
        double luong1 = keThuaInterface1.tinhLuong(100, 10);
        System.out.println(luong1);
    }
}
