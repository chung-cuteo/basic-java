package OOPSapXepClass;

public class SanPham implements Comparable<SanPham>{

    private int ma;
    private String ten;
    private double gia;

    // constructor
    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    // get
    public double getGia() {
        return gia;
    }

    public String getTen() {
        return ten;
    }

    public int getMa() {
        return ma;
    }

    // set

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // toString

    @Override
    public String toString() {
        return ma + "----" + ten + "----" + gia;
    }


    @Override
    public int compareTo(SanPham o) {
        if(this.gia < o.gia)  return -1;
        if(this.gia > o.gia) return 1;
        return 0;
    }
}
