package exam01;
import static exam01.Transfortation.*;
public class Ex04 {
    public static void main(String[] args) {
        System.out.println(Bus.getTitle());
        System.out.println(Subway.getTitle());

        System.out.printf("버스 10명 : %d%n", Bus.getTotal(10));
        System.out.printf("지하철 10명 : %d%n", Subway.getTotal(10));
        System.out.printf("택시 10명 : %d%n", Taxi.getTotal(10));
    }
}
