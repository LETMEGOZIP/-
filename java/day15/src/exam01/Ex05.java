package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add("항목1");
        items.add("항목1");
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        System.out.println(items);
    }

}
