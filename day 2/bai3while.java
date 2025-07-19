import java.util.Scanner;

public class bai3while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        int i = n;
        while(i>=1){
            if(n==7 && i==3){
                i-=2;
                continue;
            }
            tong+=i;
            i-=2;
        }
        System.out.println(tong);
    }
}
