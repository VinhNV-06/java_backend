public class bai20 {

    public static void main(String[] args) {
        for(int i = 100; i<=999;i++){
            int hangTram = i/100;
            int hangChuc = (i / 10) %10 ;
            int hangDv = i %10 ;
            int tong = hangTram + hangChuc + hangDv;
            if(tong % 5 ==0){
                System.out.println(i);
            }

        }
    }
}