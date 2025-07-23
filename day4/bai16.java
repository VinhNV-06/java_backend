import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("khong la so chinh phuong");
        }
        else {
            for(int i = 0;i<=n;i++){
                if(i*i==n){
                    System.out.println("la so chinh phuong");
                    return;
                }
            }
            System.out.println("khong la so chinh phuong");
        }
    }
}
