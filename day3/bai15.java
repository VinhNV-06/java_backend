import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        if(a<n){
            System.out.println(a);
        }
        while (b<n) {
            System.out.println(b);
            int c = a +b ;
            a = b ;
            b=c;    
        }
    }

}