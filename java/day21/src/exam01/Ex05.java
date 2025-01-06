package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        //1바이트씩 data.zip을 읽어와서 1바이트씩 copied_data1.zip으로 출력
        try (FileInputStream fis = new FileInputStream("data.zip");
             FileOutputStream fos = new FileOutputStream("copied_data1.zip")){
            long stime = System.currentTimeMillis();
            while(fis.available() > 0){
                fos.write(fis.read());
            }
            long etime = System.currentTimeMillis();
            System.out.printf("소요 시간 : %d%n", etime - stime);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
