import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //tìm số nguyên tố lớn nhất nhỏ hơn n 
        for(int i = n-1;i>=2;i--){
            int uoc = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    uoc++;

                }
            }
            if(uoc==2){
                System.out.println(i);
                return;
            }
        }
        System.out.println("khong co so nao");

    }
}
