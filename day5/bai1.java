public class bai1 {
    public static void main(String[] args) {
        // try-catch-finally
        int a =10;
        int b=0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException ex){
            System.out.println("co loi toan hoc");
            ex.printStackTrace();
        }
        catch(Exception ex) {
            System.out.println("co loi");
            ex.printStackTrace();
        }
        finally{
            System.out.println("co loi hay khong cung lam cai nay");
            
        }
        System.out.println("doan code phia sau");
    }
}