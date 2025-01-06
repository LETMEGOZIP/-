package exam01;

public class Myresource2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Mr2 자원해제");
    }
}
