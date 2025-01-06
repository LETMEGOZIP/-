package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열 -> enum 상수 객체
        //Transfortation trans = Enum.valueOf(Transfortation.class, "Subway"); // 수동, 잘 안 씀
        //System.out.println(trans);

        Transfortation trans = Transfortation.valueOf("Subway"); // 컴파일러에서 자동 추가해주는 이걸 더 많이 씀
        System.out.println(trans);

        //Transportation에 정의된 상수 목록
        Transfortation[] items = Transfortation.values();
        System.out.println(Arrays.toString(items));
    }
}
