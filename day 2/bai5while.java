import java.util.Scanner;

public class bai5while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        int tich = 1;
        int i = 1;
        while (i<=n){
            tich *=i ;
            tong += tich;
            i++;
        }
        System.out.println(tong);
    }
}
