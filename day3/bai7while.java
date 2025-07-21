import java.util.Scanner;

public class bai7while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int demuoc = 0;
        int i = 1;
        while(i<=n){
            if(n%i==0){
                demuoc++;
            }
            i++;
        }
        if(demuoc==2){
            System.out.println("la so nguyen to");
        }
        else{
            System.out.println("khong la so nguyen to");
        }
    }
}
