import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        // nhập vao 1 chuỗi từ bàn phím,
        // đếm xem có bao nhiêu kí tự thường , bao nhiêu kí tự hoa  ,bao nhiêu số , bao nhiêu space
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi : ");
        String s = sc.nextLine();
        int cntup = 0 ;
        int cntlow = 0;
        int cntnum = 0;
        int cntspace = 0;
        for(int i = 0 ; i< s.length();i++){
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                cntlow++;
            }
            else if(Character.isUpperCase(c)){
                cntup++;

            }
            else if(Character.isDigit(c)){
                cntnum++;
            }
            else if(Character.isWhitespace(c)){
                cntspace++;
            }
            
        }
        System.out.println(cntup);
        System.out.println(cntlow);
        System.out.println(cntnum);
        System.out.println(cntspace);
    }
}
