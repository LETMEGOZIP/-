package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {22, 11, 5, 3, 66, 33, 24, 98};

        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(sortedNums));
        int[] sortedNums2 = Arrays.stream(nums)
                //.mapToObj(Integer::valueOf)
                .boxed() //mapto~~~가 한거랑 같은 역할
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
                //boxed() -> Stream<integer>
        System.out.println(Arrays.toString(sortedNums2));

    }
}
