public class bai11 {
    public static void main(String[] args) {
        // indexOf, tim vi tri cua ky tu xuat hien lan dau tien trong chuoi
        String s = " toi la toi";
        System.out.println(s.indexOf("toi"));
        //lastIndexOf, tim vi tri cua ky tu xuat hien lan cuoi cung trong chuoi
        System.out.println(s.lastIndexOf("toi"));
        // kiem tra chuoi con
        String s2 = ".mp3";
        String s3 = "bai1.mp3";
        boolean check = s3.contains(s2);
        if (check) {
            System.out.println("co .mp3 trong chuoi");

        }
        else {
            System.out.println("khong co .mp3 trong chuoi");
        }
        // trich loc chuoi con tu chuoi ban dau
        String s4 = "abcdefg";
        String s5 = s4.substring(3);
        String s6 = s4.substring(4,6);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        // thay the old bang now trong chuoi, replace
        String s7 = "toi di tim toi";
        String s8 = s7.replace("toi","ban");
        System.out.println(s7);
        System.out.println(s8);
        String s9 = s7.replaceFirst("toi", "ban");
        System.out.println(s9);
        // trim() : xoa toan bo khoang trang o dau va cuoi chuoi
        String s10 = "     toi di tim toi     ";
        String s11 = s10.trim();
        System.out.println(s10);
        System.out.println(s11);
        // xoa toan bo khoang trang o cuoi chuoi bang bieu thức chính quy
        String s12 = s10.replaceAll("\\s+$", "");
        System.out.println(s12); 
        // xoa toan bo khoang trang o dau chuoi
        String s13 = s10.replaceFirst("^\\s+", "");
        System.out.println(s13);

    }
}
