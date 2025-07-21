import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tich=1;
        for(int i=1;i<=n;i++){
            tich*=i;
        }
        System.out.println(tich);

    }
}
