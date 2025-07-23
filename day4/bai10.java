import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        //đếm số nguyên tố nhỏ hơn n 
        for(int i = 1;i<=n;i++){
            int uoc = 0;
            for(int j = 1 ;j<=i;j++){
                if(i%j==0){
                    uoc++;
                }
            }
            if(uoc==2){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
