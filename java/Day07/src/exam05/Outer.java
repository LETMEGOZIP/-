package exam05;

public class Outer {
    int num1 = 10;
    class Inner{ // 인스턴스 내부 클래스
        static int num; // jdk 16 이상만 가능

        int num1 = 20;

        void method(){
            System.out.println(num1);
            System.out.println(Outer.this.num1);
        }
    }
}
