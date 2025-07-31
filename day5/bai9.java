import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        // khai bao
        char ch = 'A';
        char ch2 = 66;
        System.out.println(ch);
        System.out.println(ch2);
/*         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ky tu: ");
        String s = sc.nextLine();
        char ch3 = s.charAt(0); */
        // System.out.println("ky tu ta vua nhap la: " + ch3);
        // so sanh ky tu
        char a = 'a';
        char b = 'b';
        System.out.println(Character.compare(a,b));
        // kiem tra cac ky tu la so , chu hoa , chu thuong, ki tu , whitespace
        char c = '1';
        char d = 'A';
        char e = 'a';
        char f = ' ';
        System.out.println(Character.isDigit(c)); // true
        System.out.println(Character.isLetter(d)); // true
        System.out.println(Character.isLowerCase(e)); // true
        System.out.println(Character.isUpperCase(d)); // true
        System.out.println(Character.isWhitespace(f)); // true
    }
}
