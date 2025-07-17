import java.util.Scanner;
public class bai3 {

    public static void main(String[] args) {
        // tìm số lớn nhất trong 3 số
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap a : ");
        int a = sc.nextInt();
        System.out.print("nhap b : ");
        int b = sc.nextInt();
        System.out.print("nhap c : ");
        int c = sc.nextInt();
        int max;
        if (a>=b && a >= c ) {
            max = a;
        }
        else if (b >= a && b >= c) {
            max=b;
        }
        else {
            max = c ;
        }
        System.out.println(max);
    }
}