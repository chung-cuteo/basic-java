import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NgayThang {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    int nam = calendar.get(Calendar.YEAR);
    int thang = calendar.get(Calendar.MONTH);
    int ngay = calendar.get(Calendar.DAY_OF_MONTH);

    System.out.println(nam);
    System.out.println(thang);
    System.out.println(ngay);

    // xuat theo dinh dang
    SimpleDateFormat dinhDangDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    Date d = calendar.getTime();
    String s = dinhDangDate.format(d);

    System.out.println(s);
  }
}
