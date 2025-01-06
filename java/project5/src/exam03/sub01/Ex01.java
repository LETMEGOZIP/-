package exam03.sub01; //하위경로라도 완전히 다른 패키지임

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        //a.num1 = 10; // 클래스 외부
        a.num2 = 20; // 클래스 내부
    }
}
