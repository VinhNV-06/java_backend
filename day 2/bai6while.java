import java.util.Scanner;

public class bai6while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0 ;
        int i = 1;
        while(i<n){
            if(n%i==0){
                tong+=i;
            }
            i++;
        }
        if (tong==n){
            System.out.println("so hoan hao");
        }
        else{
            System.out.println("so khong hoan hao");
        }
    }
}
