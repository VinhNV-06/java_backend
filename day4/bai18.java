import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //đếm số lượng chữ số chẵn , lẻ có trong n 
        int demChan = 0;
        int demLe = 0;
        while(n>0){
            int digit = n % 10 ;
            if(digit%2==0){
                demChan++;
            }
            else {
                demLe++;
            }
            n/=10;
        }
        System.out.println(demChan);
        System.out.println(demLe);
    }
}
