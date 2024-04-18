package BaiInterface;

public class KeThuaInterface implements  ViduInterface{
    @Override
    public void thongTin(String ten, int cccd, int nanSinh) {
        System.out.println("Thong Tin");
    }

    @Override
    public double tinhLuong(int luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }
}
