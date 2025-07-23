import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tich = 1;
        while(n>=1){
            int digit = n%10;
            tich *= digit;
            n/=10;
        }
        System.out.println(tich);
    }
}
