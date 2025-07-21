import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int demuoc=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                demuoc++;
            }
        }
        if(demuoc==2){
            System.out.println("la so nguyen to");
        }
        else{
            System.out.println("khong phai so nguyen to");
        }

    }
}
