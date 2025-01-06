package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("b.text");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(fis!=null){
                try{
                    fis.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("자원해체레후.");
        }
    }
}
