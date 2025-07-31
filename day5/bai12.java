public class bai12 {
    public static void main(String[] args) {
        // so sánh 2 chuỗi
        // 2 chuỗi giống nhau thì trả về 0
        String s1 = "xin chao 123";
        String s2 = "xin chao 123";
        int kq = s1.compareTo(s2);
        System.out.println(kq);  //0
        // nếu s3 > s4 thì trả về số dương
        // dựa trên bảng ASII
        String s3 = "xin chao 1234";
        String s4 = "xin chao 123";
        int kq2 = s3.compareTo(s4);
        System.out.println(kq2); // 4 - 3 = 1 ;
        // tuy nhiên khi so sánh 2 chuỗi thì compareTo sẽ phân biệt hoa thường
        // comparetoingnore sẽ bỏ qua phân biệt hoa thường
        String s5 ="Xin chao 123";
        String s6 = "xin chao 123";
        int kq3 = s5.compareToIgnoreCase(s6);
        System.out.println(kq3); //0 nếu mà sử dụng compareTo thì sẽ trả về 0 
        
    }
}
