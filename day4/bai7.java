import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // liệt kê các số chia hết cho 3 nhưng không chia hết cho 5 trong đoạn từ 1 đến n 
        for(int i = 1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
