import java.util.Scanner;
public class bai22 {
    public static void main(String[] args) {
        /* Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi :
         * ví dụ nhập vào chuỗi "abc123" sẽ tách ra thành "abc" và "123"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can tach: ");
        String input = sc.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                letters.append(c);
            }
            else if(Character.isDigit(c)){
                digits.append(c);
            }
        }
        System.out.println("Chuoi chu cai: " + letters.toString());
        System.out.println("Chuoi chu so: " + digits.toString());


    }
}
