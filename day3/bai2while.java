import java.util.Scanner;

public class bai2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0 ;
        int i = 1;
        while(i<=n){
            tong+=i;
            i++;
        }
        System.out.println(tong);
    }
}
