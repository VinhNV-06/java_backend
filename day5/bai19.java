import java.util.Scanner;
public class bai19 {
    /* // Tạo bảng mã hóa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop"; */
        // tao bang ma hoa
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can giai ma: ");
        String input = sc.nextLine();
        char[] inputchart = input.toCharArray();
        for(int i = 0; i <inputchart.length;i++){
            char c = inputchart[i];
            if(Character.isLowerCase(c)){
                int index = a.indexOf(c);
                if(index != -1) {
                    inputchart[i] = b.charAt(index);
                }
            }
        }
        String decodedString = new String(inputchart);
        System.out.println("Chuoi da giai ma: " + decodedString);

    }


}
