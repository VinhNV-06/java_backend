import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0 ;
        for(int i=1;i<n;i++){
            if(n%i==0){
                tong+=i;
            }
        }
        if(tong==n){
            System.out.println("so hoan hao"); 
        }
        else {
            System.out.println("khong phai so hoan hao");
        }

    }
}
