import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int origin = n ;
        int resever = 0;
        while(n>0){
            int digit = n % 10 ;
            resever = resever * 10 + digit;
            n/=10;
        }
        if(resever == origin) {
            System.out.println("la so hoan hao");
        }
        else{
            System.out.println("khong la so hoan hao");
        }
    }
}
