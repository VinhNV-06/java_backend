import java.util.Arrays;

public class bai15 {
    public static void main(String[] args) {
        String s1 = "English = 78 Science = 83 Math = 68 History = 65";
        String[] sb = s1.split(" ");
        int sum = 0;
        int cnt =0 ;
        for (String pt : sb) {
            try {
                int num = Integer.parseInt(pt);
                sum += num;
                cnt++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        double tbc = (double) sum / cnt;
        System.out.println(sum);
        System.out.println(tbc);

    }
}
