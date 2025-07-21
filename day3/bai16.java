import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int origin = n;
        int tong = 0 ;
        while(n>0){
            int digit = n%10;
            tong+= Math.pow(digit, 3); 
            n/=10;         
        }
        if(tong==origin){
            System.out.println("la so Armstrong");
        }
        else {
            System.out.println("khong la so Armstrong");
        }
    }
}
