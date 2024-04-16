package CongTy;

public class Test  {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("nhan vien 1", "bac ninh", 112131331);
//        double luongNv1 = nv1.tinhLuongCoban();
//        System.out.println("luong co ban nv: " + luongNv1);

        // Tao doi tuong nhan vien hanh chinh
        NhanVienHanhChinh nvHanhChinh1 = new NhanVienHanhChinh("nhan vien hanh chinh 1", "ha noi", 1121331);
        double luongNvHanhChinh1 = nvHanhChinh1.tinhLuongCoban();
        System.out.println("luong co ban nv hanh chinh 1: " + luongNvHanhChinh1);

        // Tao doi tuong nhan vien dica
        NhanVienDiCa nvDiCa1 = new NhanVienDiCa("nhan vien dica 1", "ha noi", 111121331, 1);
        double luongNvDiCa1 = nvDiCa1.tinhLuongCoban();
        System.out.println("luong co ban nv hanh dica 1: " + luongNvDiCa1);
    }
}
