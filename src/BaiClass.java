import TruongDH.SinhVien;

public class BaiClass {
  public static void main(String[] args) {
    // khoi tao doi tuong sinh vien
    SinhVien sVien1 = new SinhVien("chung", 10);
    sVien1.hienThiThongTin();

    sVien1.getDiem();
    sVien1.getHoTen();

    sVien1.setDiem(9.5);
    sVien1.hienThiThongTin();

    // test DTB
    double DTBSV1 = sVien1.tinhDTB(7.6, 7);
    double DTBSV2 = sVien1.tinhDTB(7.6, 7, 9);
    double tongDiem = sVien1.tongDiem(1,2,3,4,5,6,7,8,9);

    System.out.println(DTBSV1);
    System.out.println(DTBSV2);
    System.out.println(tongDiem);


    sVien1.checkDiemHopLe();
  }
}
