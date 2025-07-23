import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        //tìm số fabonacy thứ n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n==0){
            System.out.println(a);
            return;
        }
        for(int i=2;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}
