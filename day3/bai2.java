import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        for(int i=0;i<=n;i++){
            tong+=i;
        }
        System.out.println(tong);
    }
}
