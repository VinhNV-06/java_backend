// bài 1 : tính tổng 2 số nguyên
import java.util.Scanner;
public class bai1  {

    public static void main(String[] args) {
        System.out.println("nhap a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhap b : ");
        int b = new Scanner(System.in).nextInt();
        int tong = a + b ;
        System.out.println("Tong = "+tong);
        
    }
}
