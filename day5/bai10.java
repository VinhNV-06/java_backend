public class bai10 {
    public static void main(String[] args) {
        // khai bao chuoi
        String s= "hoi do em che mom toi rong" +
                 "\nkhong tin hai dua chap mom do";
        System.out.println(s);
        // lop StringBuilder
        StringBuilder chuoi = new StringBuilder();
        chuoi.append("xin chao, ");
        chuoi.append("minh moi hoc java, ");
        chuoi.append("rat vui duoc gap ban");
        System.out.println(chuoi);
        // insert
        chuoi.insert(11, "Vinh");
        System.out.println(chuoi);
        // delete
        chuoi.delete(11, 15);
        System.out.println(chuoi);
        // .length , tra ve do dai chuoi , tinh ca dau cach
        System.out.println(chuoi.length());


    }
}
