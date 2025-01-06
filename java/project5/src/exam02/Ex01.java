package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
//        s1.year = 2024;
//        s1.month = 10;
//        s1.day = 14; // 잘못된 값을 넣어도 검증하고 대입을 통제할 방법 없음

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();
    }
}
