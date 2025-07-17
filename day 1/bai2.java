import java.util.*;
public class bai2 {
    public static void main(String[] args) {
/*         //kiểm tra chẵn lẻ
        System.out.print("nhap 1 so nguyen : ");
        int a = new Scanner(System.in).nextInt();
        int kt = a % 2 ;
        System.out.println(kt);
        // cách 1 : nếu là số chẵn thì in ra 0 , nếu là số lẻ thì in ra 1  */
/*         System.out.print("mời nhập 1 số nguyên : ");
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0 ) {
            System.out.println(a+" : chan");
        }
        else {
            System.out.println(a+" : le");
        }
        // cách dùng else if */
        System.out.print("moi nhap 1 so nguyen : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println(a+ " la so : " +(a % 2 == 0 ? "chan" : "le"));
    }
}

