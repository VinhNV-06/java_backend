import java.util.Scanner;

public class bai4while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0 ;
        int i = 0;
        while(i<=n){
            tong +=i;
            i+=2;
        }
        System.out.println(tong);
    }
}
