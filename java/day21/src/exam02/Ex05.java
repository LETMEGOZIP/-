package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis = new FileInputStream("obj2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Map<String, Object> data = (Map<String, Object>) ois.readObject();

            String message = (String) data.get("message");

            Person p1 = (Person) data.get("p1");
            Person p2 = (Person) data.get("p2");
            Person p3 = (Person) data.get("p3");
            System.out.println(message);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
