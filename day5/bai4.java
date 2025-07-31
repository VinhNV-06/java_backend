public class bai4 {
    public static String giaiPhuongTrinhBacHai(double a, double b, double c){
        if(a==0){
            // nếu a=0 thì trở thành pt bậc nhất bx + c =0
            if(b==0 && c ==0 ) {
                return "phuong trinh vo so nghiem";
            }
            else if(b==0 && c!=0){
                return "phuong trinh vo nghiem";
            }
            else {
                return "phuong trinh bac nhat co ngiem x = " + (-c/b);
            }
        }
        else {
            // giải pt bậc 2
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta < 0){
                return "Phuong trinh vo nghiem";
            }
            else if (delta ==0){
                return "phuong trinh co nghiem kep x = " + (-b/(2*a));
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                return "phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2;
            }
        }
    }
    public static void main(String[] args) {
        // tạo hàm giải phương trinh bậc 2
        String result = giaiPhuongTrinhBacHai(1,2 , -3);
        System.out.println(result);

    }
}
