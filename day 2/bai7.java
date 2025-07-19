import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao 1 so nguyen lon hon 0");
        int n = sc.nextInt();
        while(n<=0){
            System.out.println("nhap lai a do a < 0");
            n= sc.nextInt();
        }
        System.out.println("ban da nhap thanh cong a = "+n);
        int demuoc = 0 ;
        for(int i = 1 ;i<=n;i++){
            if(n%i==0){
                demuoc++;
            }}
        if(demuoc==2){
            System.out.println(n+" la so nguyen to");
        }
        else{
            System.out.println(n+ " khong la so nguyen to");
        }
        }
    }

