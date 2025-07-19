import java.util.Scanner;

public class bai1while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tich = 1 ;
        if(n>0){
            int i = n;
            while (i>=1) {
                tich *= i;
                i--;
            }
            System.out.println(tich);
        }
        else{
            System.out.println("khong co du lieu");
        }
    }
}
