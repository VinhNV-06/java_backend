public class bai3 {
    public static void xinChao(String gioiTinh){
        if(gioiTinh.equals("nam")){
            System.out.println("xin chao , toi la nhan vien nam");
        }
        else if (gioiTinh.equals("nu")){
            System.out.println("xin chao , toi la nhan vien nu");
        }
        else{
            System.out.println("gioi tinh khong hop le");

        }
    }
    public static void main(String[] args) {
        xinChao("nu");
    }
}
