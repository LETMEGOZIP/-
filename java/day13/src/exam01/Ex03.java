package exam01;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        Function<String, String> func1 = s-> s; // 항등함수

        Function<String, String> func2 = Function.identity(); // s->s
    }
}
