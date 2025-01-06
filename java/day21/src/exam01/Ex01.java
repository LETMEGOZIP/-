package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
            int ch = fis.read(); // 1바이트 읽기
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println(ch); // 다 읽고 한 번 더 읽기
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
