import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // in ra tam giác pascal
        // tức là lúc đầu duyệt qua các cặp i j xong rồi cộng dồn 2 số liền kề nhau lại => vòng for lồng nhau
        for(int i = 0 ; i<n;i++){
            int number = 1;
            for(int j = 0;j<=i;j++){
                System.out.printf("%4d",number);
                number = number * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
}
