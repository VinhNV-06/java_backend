public class bai13 {
    public static void main(String[] args) {
        // nối chuỗi bằng cách sử dụng StringBuilder
        StringBuilder sb = new StringBuilder("013456789");
        // nối chuỗi
        sb.insert(2, "2");
        System.out.println(sb);
        // thêm chuỗi vào cuối
        sb.append(" Nguyen Viet Vinh");
        System.out.println(sb);
        // xóa chuỗi
        sb.delete(0,11 );
        System.out.println(sb);
        // đảo ngược chuỗi
        sb.reverse();
        System.out.println(sb);
        // tách chuỗi và trả kết quả về mảng
        String s = "hello, world";
        // tách chuỗi có tên là s thành các kí tự riêng biệt và trả về kết quả là một mảng
        // tách chuỗi làm 2 phần dựa trên dấu phẩy
        String[] mang = s.split(", ");
        for(int i = 0; i < mang.length;i++){
            System.out.println(mang[i]);
        }
        // lowercase() trả về chuỗi viết thường
        String s1 = "toi Hoc Java rat VUI";
        System.out.println(s1.toLowerCase());
        // uppercase() trả về chuỗi viết hoa
        System.out.println(s1.toUpperCase());
        // tách chuỗi thành từng kí tự và cho vào mảng
        String s2 = "hello, tôi tên là Vinh";
        char [] mangKyTu = s2.toCharArray();
        for(int j =0;j< mangKyTu.length;j++){
            System.out.println(mangKyTu[j]);
        }
    }
}
