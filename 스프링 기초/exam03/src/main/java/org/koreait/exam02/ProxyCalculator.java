package org.koreait.exam02;

public class ProxyCalculator implements Calculator {

    private Calculator cal;

    public ProxyCalculator(Calculator cal){
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); // 공통 기능 -> 데코(니나아님)레이터
        try {
            long result = cal.factorial(num); // 핵심 기능 대신해서 수행(Proxy), 통제 up
            return result;
        }finally { // 공통 기능
            long etime = System.nanoTime();
            System.out.printf("cal1 걸린 시간 %d%n", etime - stime);
        }

    }
}
