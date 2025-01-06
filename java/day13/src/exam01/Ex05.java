package exam01;

import java.util.function.BiPredicate;

public class Ex05 {
    public static void main(String[] args) {
        BiPredicate<String, String> cond1 = (s1,s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals; // s1 s2가 호출도 같은 순서일 경우에만 됨

        BiPredicate<String, String > cond3 = (s1, s2) -> s2.equals(s1); //순서가 반대라 메서드 참조 불가
    }
}
