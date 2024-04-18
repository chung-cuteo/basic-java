package TinhDaHinh;

public abstract class NhanSu
{
    private String nhanSu;

    public NhanSu(String nhanSu) {
        this.nhanSu = nhanSu;
    }

    public String getNhanSu() {
        return nhanSu;
    }

    // phuon thuc truu tuong
    public abstract double tintLuong(int ngayCong);
}
