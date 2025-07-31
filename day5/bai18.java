import java.util.Scanner;
public class bai18 {
    public static void main(String[] args) {
         /* // Tạo bảng mã hóa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop"; */
        // tao bang ma hoa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b ="zxcvbnmasdfghjklqwertyuiop";
        // nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can ma hoa: ");
        String input = sc.nextLine();
        char[] inputChart = input.toCharArray();
        for(int i = 0; i < inputChart.length;i++){
            char c = inputChart[i];
            if(Character.isLowerCase(c)){
                int index = a.indexOf(inputChart[i]);
                if(index != -1) {
                    inputChart[i] = b.charAt(index);
                }
            }
        }
        String encodedString = new String(inputChart);
        System.out.println("Chuoi da ma hoa: " + encodedString);
        // giai ma
        

    }
}
