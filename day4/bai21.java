import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // các số hoàn hảo là các số có ước mà cộng lại thì bằng đúng số đó
        for(int i = 1 ; i<n ;i++){
            int tongUoc =0;
            for(int j = 1;j<i;j++){
                if(i%j==0){
                    tongUoc += j;
                }
            }
            if(tongUoc==i){
                System.out.println(i);
            }
    }
}
}
