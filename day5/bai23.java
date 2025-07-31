public class bai23 {
    public static void main(String[] args) {
        /* viet chuong trinh java trich loc String tu duong dan D:/galailaptrinh/music/remix.mp3
         * 1/tac ten bao gom ca duoi: remix.mp3
         * 2/ten file : remix
         */
        String path = "D:/galailaptrinh/music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        String tenfilecoduoi = path.substring(lastSlashIndex + 1);
        // ten file khong co duoi
        int dotIndex = tenfilecoduoi.lastIndexOf('.');
        String tenfile = tenfilecoduoi.substring(0, dotIndex);
        System.out.println("Ten file co duoi: " + tenfilecoduoi);
        System.out.println("Ten file khong co duoi: " + tenfile);
    }
}
