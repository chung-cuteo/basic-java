package TinhDaHinh;

public class TruongPhong extends NhanSu{
    public TruongPhong(String nhanSu) {
        super(nhanSu);
    }

    @Override
    public double tintLuong(int ngayCong) {
        return ngayCong * 50;
    }
}
