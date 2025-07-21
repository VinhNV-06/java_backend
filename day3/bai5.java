import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong=0;
        for(int i = 1;i<=n;i+=2){
            tong+=i;
        }
        System.out.println(tong);
    }
    
}
