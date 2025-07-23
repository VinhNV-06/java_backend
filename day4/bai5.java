import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        //đếm số nguyên tố nhỏ hơn n 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int demuoc = 0 ;
        for(int i = 2;i<=n;i++){
            int uoc = 0 ;
            for(int j =1;j<=i;j++){
                if(i%j==0){
                    uoc++;
                }
            }
            if(uoc==2) {
                demuoc++;
            }
        }
        System.out.println(demuoc);
    }
}
