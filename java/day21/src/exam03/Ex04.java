package exam03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 원데이터는 불변성 유지
        LocalDate after100 = today.plus(100L, ChronoUnit.DAYS); // 100일 후, 새로운 객체 반환
        LocalDate before100 = today.minus(100L, ChronoUnit.DAYS);
        before100 = today.plusDays(100L);
        after100 = today.minusDays(100L);
        System.out.println(today);
        System.out.println(after100);
        System.out.println(before100);
    }
}
