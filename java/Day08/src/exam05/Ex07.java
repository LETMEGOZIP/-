package exam05;

public class Ex07 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        System.out.printf("s1 address : %d, hashcode(): %d%n", System.identityHashCode(s1), s1.hashCode());
        System.out.printf("s2 address : %d, hashcode(): %d%n", System.identityHashCode(s2), s2.hashCode());
        System.out.printf("s3 address : %d, hashcode(): %d%n", System.identityHashCode(s3), s3.hashCode());

    }
}
