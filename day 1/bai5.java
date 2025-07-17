import java.util.*;
public class bai5 {
    // tính chỉ số BMI cân nặng (kg) / chiều cao (m^2) x chiều cao
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap can nang");
        float canNang = sc.nextFloat();
        System.out.println("nhap chieu cao : ");
        float chieuCao = sc.nextFloat();
        float bmi = canNang / (chieuCao * chieuCao ) ;
        if (bmi > 0 && bmi < 18.5) {
            System.out.println("Gay");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Binh thuong");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Thua can");
        }
        else if (bmi >= 30 ) {
            System.out.println("Beo phi");
        }
        else {
            System.out.println("khong co du lieu");
        }

    }

}
