import java.util.Scanner;
public class bai20 {
    public static void main(String[] args) {
        // cho phep nguoi dung thiet lap mat khau
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true) {

            System.out.println("moi thiet lap mat khau: ");
            System.out.println("mat khau phai co it nhat 6 ky tu, chua it nhat 1 chu cai va 1 chu so");
            String newPassword = sc.nextLine();
            password = newPassword;
            if(checkMK(password)){
                System.out.println("thiet lap mat khau thanh cong");
                break;
            }
            else {
                System.out.println("mat khau khong hop le, vui long nhap lai");
            }
        }
        int cnt = 0;
        String login = "";
        while (true) {
            System.out.println("moi nhap mat khau de dang nhap: ");
            login = sc.nextLine();
            if(login.equals(password)){
                System.out.println("dang nhap thanh cong");
                break;
            }
            else {
                System.out.println("dang nhap khong thanh cong, vui long nhap lai");
                cnt++;
                if (cnt >= 5) {
                    System.out.println("ban da nhap sai qua 5 lan, dang nhap bi khoa");
                    break;
                } 
            }

        }

    }
    public static boolean checkMK(String mk) {
        // check do dai cua mat khau
        if(mk.length() < 6) {
            System.out.println("Mật khẩu phải có ít nhất 6 ký tự.");
            return false;
        }
        // check xem co it nhat 1 ki letter har khong
        boolean hasLetter = false;
        for(char c : mk.toCharArray()) {
            if(Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if(!hasLetter) {
            System.out.println("Mật khẩu phải chứa ít nhất một ký tự chữ cái.");
            return false;
        }
        // check xem co it nhat 1 ki tu so hay khong
        boolean hasDigit = false;
        for(char c : mk.toCharArray()) {
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        }
        if(!hasDigit){
            System.out.println("Mật khẩu phải chứa ít nhất một ký tự số.");
            return false;
        }
        return true;
    }
}
