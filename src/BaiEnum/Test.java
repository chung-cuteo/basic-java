package BaiEnum;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // kiem tra thu tu cac gia tri trong class enum
//        System.out.println(XepLoai.kha.ordinal());
//        System.out.println(XepLoai.gioi.ordinal());
//        System.out.println(XepLoai.TB.ordinal());
//        System.out.println(XepLoai.yeu.ordinal());
        // tao arrayList
        ArrayList<Sv> ds = new ArrayList<>();
        Sv sv1 = new Sv(1, "chung", 9.5);
        Sv sv2 = new Sv(1, "chung", 7.5);
        Sv sv3 = new Sv(1, "chung", 5.5);
        Sv sv4 = new Sv(1, "chung", 4.5);

        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);

        for (Sv sv : ds) {
            System.out.println(sv);
        }
    }
}
