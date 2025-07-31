import java.util.Scanner;
public class bai16 {
    public static boolean containsLetter(String str) {
        for(int i = 0 ; i < str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                return true;
            }
        }
        return false ;
    }
    public static boolean containsDigit(String str){
        for(int i =0 ; i< str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false ;

    }
    public static void main(String[] args) {
        // viết chương trình kiểm tra tính hợp lệ của mật khẩu aaaaaAAAAAA1
        // mk hợp lệ khi có ít nhất 6 ký tự
        //chứa ít nhất 1 chữ cái (chữ thường hoặc chữ hoa đều được)
        // chứa ít nhất 1 chữ số
        /* cho người dùng nhập mk để login so sánh , nếu đúng thì mở cửa, sai quá 5 lần sẽ khóa đăng nhập , thoát chương trình */
        Scanner sc = new Scanner(System.in);
        String password = "aaaaaAAAAAA1";
        int attempts = 0;
        while (attempts < 5) {
            System.out.println("Nhập vào mật khẩu : ");
            String input = sc.nextLine();
            if(input.length() < 6) {
                System.out.println("mat khau qua ngan , phai du 6 ky tu");
            }
            else if (!containsLetter(input)){
                System.out.println("mat khau phai co it nhat 1 chu cai");
            }
            else if (!containsDigit(input)){
                System.out.println("mat khau phai co it nhat 1 chu so");
            }
            else if (input.equals(password)){
                System.out.println("Mật khẩu đúng, mở cửa!");
                break; //kết thúc vòng lặp nếu nhập đúng
            }
            else {
                System.out.println("sai mat khau");
                attempts++;
            }
        }
    }
}
