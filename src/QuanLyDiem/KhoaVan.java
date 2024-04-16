package QuanLyDiem;

public class KhoaVan extends  NamHoc2023{

    public KhoaVan(String ten, int cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("day la phuong thuc tinh diem tb khoa van");
    }
}
