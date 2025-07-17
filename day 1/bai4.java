import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap so nam : ");
        int nam = sc.nextInt();
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
            System.out.println("nam nhuan");
        }
        else{
            System.out.println("nam khong nhuan");
        }
    }
}
