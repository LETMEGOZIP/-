package exam05;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        sum(19, 29, 39, 49);
        sum(39,49,19);
        sum2(19, 29, 39, 49);
        sum2(39,49,19);
    }

    public static void sum(int... nums){
        // nums -> int[] 배열
        System.out.println(Arrays.toString(nums));
    }

    public static void sum2(int... nums){
        int total = 0;
        for(int num:nums){
            total += num;
        }
        System.out.println(total);
    }
}
