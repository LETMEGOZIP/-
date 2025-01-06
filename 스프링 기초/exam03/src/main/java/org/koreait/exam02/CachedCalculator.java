package org.koreait.exam02;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculator implements Calculator{

    private Map<Long, Long> cache = new HashMap<>();

    public Calculator cal;

    public CachedCalculator(Calculator cal){
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        if(cache.containsKey(num)){ // 공통기능
            System.out.println("캐시값등장");
            return cache.get(num);
        }
        long result = cal.factorial(num); // 핵심 기능 대신 수행
        cache.put(num, result);
        System.out.println("캐시값을구했습니다");
        return result;
    }
}
