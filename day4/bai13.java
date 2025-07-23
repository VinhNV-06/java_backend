import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double tong = 0;
        for(double i = 1.00; i<=n ;i++){
            tong+= 1.00/i;
        }
        System.out.println(tong);
        
    }
}
