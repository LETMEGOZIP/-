package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)){

            int num = dis.readInt();
            boolean result = dis.readBoolean();         // 이렇게 쓰까쓰끼 하면 안된다
            String str = dis.readUTF();

            System.out.printf("num=%d, result=%s, str=%s", num, result, str);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
