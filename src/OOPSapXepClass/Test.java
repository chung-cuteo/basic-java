package OOPSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();

        // khoi tao doi tuong sp
        SanPham sp1 = new SanPham(1, "Sam Sung", 1000);
        SanPham sp2 = new SanPham(2, "Iphone", 500);
        SanPham sp3 = new SanPham(3, "DaoCamHo", 800);

        // add sp vao list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
     // xem ds

        for (SanPham d : ds) {
            System.out.println(d);
        }

        // goi phuong thuc sap xep
        Collections.sort(ds);
        System.out.println("sau sap xep::");

        for (SanPham d : ds) {
            System.out.println(d);
        }
     }
}
