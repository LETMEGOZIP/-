package exam03;

public abstract class Calculator {
    int num=10;
    public Calculator(){
        System.out.println("그대들을계산하리라기간제로");
    }
    public abstract int add(int num1, int num2);//추상 메소드

}
