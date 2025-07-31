public class bai21 {
    public static void main(String[] args) {
        /* cho chuỗi : a="toi cham hoc toi chiu kho toi dep trai"
         * dem tu toi co trong chuoi tren
         */
        String a = "toi cham hoc toi chiu kho toi dep trai";
        String[] word = a.split(" ");
        int cnt = 0;
        for(String c : word) {
            if(c.equals("toi")){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
