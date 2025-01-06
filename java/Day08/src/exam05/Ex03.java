package exam05;

public class Ex03 {
    public static void main(String[] args) {
        Customer2 customer2 = new Customer2(10000, "최이름", "user0-2@test.org");
        System.out.printf("id=%d, name=%s, email=%s%n", customer2.id(), customer2.name(), customer2.email());
        System.out.println(customer2);
    }
}
