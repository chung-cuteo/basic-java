package TruongDH;

public class SinhVien {
  protected String hoTen;
  private double diem;

  // ham khoi tao
 public  SinhVien(String hoTen, double diem) {
   this.hoTen = hoTen;
   this.diem = diem;
 }

  // get, set
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    // method
    public void hienThiThongTin() {
        System.out.println(this.hoTen + " " + this.diem);
    }

    // => overloading method
    // phuong thuc 1
    public double tinhDTB( double diemToan, double diemVan) {
     return (diemToan+diemVan) / 2;
    }

    // phuong thuc 2
    public double tinhDTB( double diemToan, double diemVan, double diemAnh) {
        return (diemToan+diemVan + diemAnh) / 3;
    }

    // phuong thuc 3
    public double tinhDTB( float diemToan, double diemVan, double diemAnh) {
        return (diemToan+diemVan + diemAnh) / 3;
    }

    // parameters list
    public double tongDiem ( double ...agr) {
     double tong = 0;

        for(double diem : agr) {
            tong += diem;
        }
        return tong;
    }

    // toString
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    // Suport method => chi su dung trong class
    private boolean checkDiem() {
        return this.diem >=24;
    }

    // service method => ngoai class goi dk
    public void checkDiemHopLe() {
     if(this.checkDiem()) {
         System.out.println("Diem Sinh Vien Hop le");
     } else  {
         System.out.println("Diem Sinh Vien ko Hop le");
     }
    }



}
