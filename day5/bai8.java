import java.util.Random;

public class bai8 {
    public static void main(String[] args) {
        //khoi tao mot doi tuong ngau nhien
        Random rd = new Random();
        //a. lay ngau nhien 1 so nguyen chay tu 0 den 100
        int soNguyen = rd.nextInt(0,100);
        System.out.println(soNguyen);
        // chay ngau nhien 1 so thuc
        double x = rd.nextDouble(0,100);
        System.out.println(x);
    }
}
