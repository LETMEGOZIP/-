package exam01;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 1)
                .map(s->s*s)
                .sum(); //range는 마지막 숫자 제외, closed는 포함 filter는 홀수만 통과
        System.out.println(sum);
    }
}
