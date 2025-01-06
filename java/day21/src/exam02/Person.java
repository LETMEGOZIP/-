package exam02;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1000L;
    private String name;
    private transient int age; // transient - 직렬화 배제

    public  Person (String name, int age){
        this.age = age;
        this.name = name;
    }

    public void showInfo(){
        System.out.printf("name = %s, age %d%n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
