package org.koreait.exam02;

import org.junit.jupiter.api.Test;

public class Ex01 {
    @Test
    void test1(){
        ImplCalculator cal1 = new ImplCalculator(); // 성능 좋음
        long stime = System.nanoTime(); // 공통 기능
        long result1 = cal1.factorial(10L); // 핵심 기능
        long etime = System.nanoTime();

        RecCalculator cal2 = new RecCalculator(); // 성능 안 좋음
        long stime2 = System.nanoTime();
        long result2 = cal2.factorial(10L);
        long etime2 = System.nanoTime();

        System.out.printf("cal1 : %d%ncal2 : %d%n", result1, result2);
        System.out.printf("cal1 걸린 시간 %d%ncal2 걸린 시간 %d%n", etime - stime, etime2-stime2);
    }

    @Test
    void test2(){
        ProxyCalculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1=%d%n", result1);

        ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2=%d%n", result2);
    }

    @Test
    void test3(){
        CachedCalculator cal = new CachedCalculator(new ProxyCalculator(new RecCalculator()));
        long result1 = cal.factorial(10L);
        System.out.printf("cal=%d%n", result1);

        long result2 = cal.factorial(20L);
        System.out.printf("cal=%d%n", result1);

        long result3 = cal.factorial(20L);
        System.out.printf("cal=%d%n", result1);

        long result4 = cal.factorial(30L);
        System.out.printf("cal=%d%n", result1);

        long result5 = cal.factorial(40L);
        System.out.printf("cal1=%d%n", result1);
    }
}
