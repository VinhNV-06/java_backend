import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1 && n<=n){
            for(int i = 1;i<=n;i++){
                if(i%3==0 && i%5!=0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("No");
        }
    }
}
