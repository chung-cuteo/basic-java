package QuanLyDiem;

public class KhoaToan extends  NamHoc2023{
    public KhoaToan(String ten, int cccd) {
        super(ten, cccd);
    }

    // override

    @Override
    public void tinhDTB() {
//       super.tinhDTB();
        System.out.println("day la phuong thuc cua Khoa Toan");
    }
}
