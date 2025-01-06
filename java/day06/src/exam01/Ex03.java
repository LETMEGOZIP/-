package exam01;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C(); // C-> B, A // 다형성
        A a = c;
        B b = c;

        System.out.println(a==c);
        System.out.println(a==b);
        System.out.println(b==c); //전부 같지만 상위, 하위에 묶여있어서 접근 가능한거만 다름

        System.out.printf("a는 C에서 유래되었는가 %s%n", a instanceof C);
        System.out.printf("b는 C에서 유래되었는가 %s%n", b instanceof C);
        System.out.printf("a는 B에서 유래되었는가 %s%n", a instanceof C);
        System.out.printf("a는 A에서 유래되었는가 %s%n", a instanceof A);
        //전부 true인 이유 = a, b, c 객체는 다 동일, 유래도 동일
    }

}
