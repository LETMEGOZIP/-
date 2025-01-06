package exam05;

public class Box<T, U, V> {
    private T item1;
    private U item2;

    private T method1(){
        return null;
    }

    // T, U는 Box 클래스로부터 객체가 생성될 때 결정
    public void method2(T t, U u) { // T, U 지네릭 클래스의 타입 변수 T, U

    }

    // 메서드가 호출 될 때 T, U가 결정된다(매개변수의 값의 타입에 따라)
    public <T, U> void method3(T t, U u){ // 지네릭 메서드 타입 변수 public <T, U>

    }
}
