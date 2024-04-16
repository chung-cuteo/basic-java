package CongTy;

public class NhanVienDiCa  extends  NhanVien{
    // khai bao them thuoc tinh rieng
    protected int ca = 1; // ca1 => ngay, ca2 => dem

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuongCoban() {
        return this.luongCoban* 1.05;
    }
}
