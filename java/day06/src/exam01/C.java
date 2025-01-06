package exam01;

public class C extends B{
    int numC = 30;

    public C(){
        super();//컴파일러가 자동으로 추가해줌
        System.out.println("C 생성자!");
    }
}

//A 클래스 객체 - int numA
//B 클래스 객체 - int numA, int numB
//C 클래스 객체 - int numA, int numB, int numC
