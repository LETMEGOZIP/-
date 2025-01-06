package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
            //int ch;
            // while((ch = fis.read()) != -1){ // 다 읽었을 때 -1 skdhaus dnes
            while(fis.available() > 0){
                System.out.print((char)fis.read());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
