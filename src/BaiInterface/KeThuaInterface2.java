package BaiInterface;

public class KeThuaInterface2 implements  ViduInterface, ViduInterface2{
    @Override
    public void thongTin(String ten, int cccd, int nanSinh) {
        System.out.println("Thong Tin");
    }

    @Override
    public double tinhLuong(int luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }

    @Override
    public void setThuong(String thuong) {
        System.out.println("thuong");
    }
}
