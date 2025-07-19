import java.util.Scanner;

public class bai2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tong=0;
        if (a%2==0){
            int i = a;
            while(i>=1){
                if(i%2==0){
                    tong+=i;
                }
                i--;
            }
            System.out.println(tong);
        }    
        else{
            System.out.println("khong tinh so le");
        }   
    }
}
