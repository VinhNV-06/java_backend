import java.util.Scanner;

public class bai3while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int tich = 1;
        while(i<=n){
            tich*=i;
            i++;
        }
        System.out.println(tich);
    }
    
}
