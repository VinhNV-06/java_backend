import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0 ;
        while(n>0){
            int digit = n % 10 ;
            dem++;
            n/=10;
        }
        System.out.println(dem);
    }
}
