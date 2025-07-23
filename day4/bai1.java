import java.util.Scanner;

public class bai1 {
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
        int ucln = x ;
        int bcnn = (a*b)/ucln;
        System.out.println(bcnn);
        
    }
}