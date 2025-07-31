import java.util.*;
public class bai25 {
    public static void main(String[] args) {
        // nhap vao mot chuoi => chuan hoa chuoi theo quy tac 
        /* 1. khong co khoang trang du thua
         * 2. cac ky tu cach nhau boi 1 khoang trang 
         * 3.ky tu dau tien cua moi tu phai duoc viet hoa
         */
        String input = "     ga Lai Lap       TrinH";
        System.out.println(chuanHoa(input));
   
    }
    public static String chuanHoa(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i =0 ; i<words.length;i++){
            words[i]=words[i].toLowerCase();
            String firtChar = words[i].substring(0,1);
            firtChar = firtChar.toUpperCase();
            words[i] = firtChar + words[i].substring(1);
        }
        return String.join(" ",words);
    }
}
