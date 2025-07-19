import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        //tính tổng giai thừa các số
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tong = 0;
        int tich = 1;
        for(int i = 1;i<=n;i++){
            tich*=i;
            tong+=tich;
        }
        System.out.println(tong);
    }
}
