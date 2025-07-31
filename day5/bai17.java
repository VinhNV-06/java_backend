import java.util.Scanner;
public class bai17 {
    public static void main(String[] args) {
        // cho phep nguoi dung thiet lap mat khau va kiem tra tinh hop le
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true) {
            System.out.println("Moi thiet lap mat khau : ");
            System.out.println("Mat khau phai co it nhat 6 ky tu, chua it nhat 1 chu cai va 1 chu so");
            String newPassword = sc.nextLine();
            if(checkMk(newPassword)){
                password = newPassword ;
                System.out.println("mat khau da duoc thiet lap thanh cong");
                break;
            }
            else {
                System.out.println("Mat khau khong hop le, vui long nhap lai");
            }
        }
        int cnt = 0 ;
        String login ="";
        while(true){
            System.out.println("nhap mat khau de dang nhap: ");
            login = sc.nextLine();
            if(login.equals(password)){
                System.out.println("Dang nhap thanh cong");
                break;
            }
            else{
                System.out.println("Sai mat khau, vui long nhap lai");
                cnt++;
                if(cnt >= 5) {
                    System.out.println("Ban da nhap sai qua 5 lan, dang nhap bi khoa");
                    break;
                }
            }
 


        }
        
    }
    public static boolean checkMk(String mk){
        if (mk.length() < 6) {
            System.out.println("Mật khẩu quá ngắn, phải đủ 6 ký tự");
            return false;
        }
        boolean hasLetter = false;
        for (char c : mk.toCharArray()) {
            if(Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if(!hasLetter) {
            System.out.println("Mật khẩu phải có ít nhất 1 chữ cái");
            return false;
        }
        boolean hasDigit = false;
        for(char c : mk.toCharArray()){
            if(Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            System.out.println("Mật khẩu phải có ít nhất 1 chữ số");
            return false;
        }
        return true;

    }

}
