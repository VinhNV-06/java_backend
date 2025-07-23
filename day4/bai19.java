import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tongLe = 0 ;
        while(n>0){
            int digit = n%10;
            if(digit % 2 != 0){
                tongLe+=digit;
            }
            n/=10;
            
        }
        System.out.println(tongLe);
    }
}
