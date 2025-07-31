import java.util.Calendar;

public class bai6 {
    // date time trong java
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH+1);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang);
        System.out.println(ngay);
        // set ngay thang nam theo y muon
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 12); // tháng 0 là tháng 1
        cal.set(Calendar.DAY_OF_MONTH, 27);
        // kiem tra ngay thang sau khi set
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH) + 1;
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(namSinh);
        System.out.println(thangSinh);
        System.out.println(ngaySinh);

    }
}
