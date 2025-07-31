import java.util.Scanner;
public class bai24 {
    /* viết chường trình kiểm tra 1 chuỗi nhập vào có phải Panlyndrome hay không */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String input = sc.nextLine();
        StringBuilder reseved = new StringBuilder(input).reverse();
        if(input.equals(reseved.toString())){
            System.out.println("Chuoi la Palindrome");
        } else {
            System.out.println("Chuoi khong phai la Palindrome");
        }
    }
}
