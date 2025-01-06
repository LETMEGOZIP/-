package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex02 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("obj1.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            Person p1 = new Person("이이름", 40);
            oos.writeObject(p1);
            Person p2 = new Person("김이름", 50);
            oos.writeObject(p2);
            Person p3 = new Person("강이름", 60);
            oos.writeObject(p3);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}