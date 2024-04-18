package TinhDaHinh;

public class PhoTruongPhong extends NhanSu{
    public PhoTruongPhong(String nhanSu) {
        super(nhanSu);
    }

    @Override
    public double tintLuong(int ngayCong) {
        return ngayCong * 40;
    }
}
