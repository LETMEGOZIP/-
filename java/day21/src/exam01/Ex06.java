package exam01;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("copied_data2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)){
            long stime = System.currentTimeMillis();
            while (bis.available()> 0){
                bos.write(bis.read());
            }
            long etime = System.currentTimeMillis();
            System.out.printf("소요 시간 : %d%n", etime - stime);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
