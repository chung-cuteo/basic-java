package BaiEnum;

public class Sv {
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;

    public Sv(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = this.getLoai();
    }

    // phuong thuc get loai
    public XepLoai getLoai() {
        if(this.dtb >=8 )
            this.loai = XepLoai.gioi;
         else if (this.dtb >=6.5)
            this.loai = XepLoai.kha;
         else if (this.dtb >=5)
            this.loai = XepLoai.TB;
         else
            this.loai = XepLoai.yeu;

        return this.loai;
    }

    @Override
    public String toString() {
        return this.ma+"\t"+this.ten+"\t"+ this.loai;
    }
}
