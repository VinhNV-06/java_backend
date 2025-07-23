import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while(y!=0){
            int temp = y ;
            y = x%y;
            x = temp;
        }
        System.out.println(x);
    }
    
}
