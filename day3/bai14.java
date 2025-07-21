import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = n;
        int reserved = 0;
        while(n>0){
            int digit = n % 10;
            reserved= reserved * 10 + digit;
            n/=10;
        }
        System.out.println(reserved);
    }
    
}
