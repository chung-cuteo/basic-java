package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        TruongPhong truongPhong = new TruongPhong("chung");
        double luongTruongPhong = truongPhong.tintLuong(10);
        System.out.println(truongPhong.getNhanSu());
        System.out.println(luongTruongPhong);

        PhoTruongPhong phoTruongPhong = new PhoTruongPhong("Hong");
        double luongPhoTruongPhong = phoTruongPhong.tintLuong(10);
        System.out.println(phoTruongPhong.getNhanSu());
        System.out.println(luongPhoTruongPhong);
    }
}
