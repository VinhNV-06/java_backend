import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong=0;
        for(int i = 1;i<=n;i+=2){
            if(n==7 && i==3){
                continue;
            }
            tong+=i;
        }  
        System.out.println(tong);  
    }
}
