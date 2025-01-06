package exam04;

import exam02.Schedule;
import exam03.A;
import exam03.B;
//import exam03.*; //exam03에 포함된 모든 클래스

public class EX01 {

    public static void main(String[] args) {
        A a= new A();
        B b = new B();
        Schedule s1 = new Schedule();
        //a.num1; default라 접근 불가
        a.num2 = 20;
    }
}
