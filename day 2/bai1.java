import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tich = 1;
        //viết phương trình nhập vào số nguyên n , in ra kết quả n!
        if (n>0) {
            for(int i = 1 ; i<=n;i++){
                tich*=i;             
            }
            System.out.println(tich);
        }
        else {
            System.out.println("khong co du lieu");
        }
    }
}