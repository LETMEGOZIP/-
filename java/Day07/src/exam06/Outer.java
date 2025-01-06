package exam06;

public class Outer {
    int num1 = 10;
    static int num2 = 20;

    void method(){}
    static void staticMethod(){}

    static class Inner { // 정적 내부 클래스
        void innerMethod(){
//            num1 = 20; 외부 클래스의 인스턴스 변수, 인스턴스 메서드 접근 불가
//            method();
            num2 = 30; // 정적 변수는 접근 가능
            staticMethod(); // 정적 메서드 접근 가능
        }
    }
}
