package exam04;

public class D implements C {
    @Override
    public void common() {
        System.out.println("common호출"); //high 클래스가 먼저 매칭돼서 bcd common 나올 일 없음
    }

    @Override
    public void methodC() {

    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
