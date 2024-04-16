package CongTy;

public class NhanVienHanhChinh extends  NhanVien{

    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    @Override
    public double tinhLuongCoban() {
        return this.luongCoban;
    }
}
