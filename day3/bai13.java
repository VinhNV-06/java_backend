import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0 ;
        while (n>0){
            int digit = n % 10;
            tong+=digit;
            n/=10;

        }
        System.out.println(tong);
    }
}
