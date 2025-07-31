import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble(); 
        // cho nguoi dung nhap phep tinh
        System.out.println("Nhap phep tinh (+, -, *, /): ");
        String phepTinh = sc.next();
        switch (phepTinh){
            case "+" :
            cong(a,b);
            break;
            case "-" :
            tru(a, b);
            break;
            case "*" :
            nhan(a, b);
            break;
            case "/" :
            chia(a,b);
            break;
            default:
            System.out.println("Phep tinh khong hop le");
            break;
        }
        
    }
    public static void cong(double a, double b) {
        double kq = a + b;
        System.out.println("kq = "+kq);
    }
    public static void tru(double a, double b) {
        double kq = a - b;
        System.out.println("kq = "+kq);
    }
    public static void nhan(double a, double b) {
        double kq = a * b;
        System.out.println("kq = "+kq);
    }
    public static void chia(double a, double b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0");
        } else {
            double kq = a / b;
            System.out.println("kq = " + kq);
        }
    }

}
