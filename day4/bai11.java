import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        for(int i =1;i<=n;i++){
            System.out.println(b);
            int c = a+b;
            a = b;
            b=c;
        }
    }
}
