package exam01;

public class Ex05 {
    public static void main(String[] args) {
        A ac = new C(); // 출처가 C 클래스 객체 C라는 객체가 만들어지고 ac에 대입, A형식이라고 바뀌는게 아니니 접근 가능 변수만 제한했다고 보면 됨
        A ad = new D(); // 출처가 D 클래스 객체
        System.out.println(ac == ad);

        //C c1 = (C)ad; // 상위 클래스 자료형 -> 하위 클래스 자료형 (명시적 형변환)
        if (ad instanceof C){
            C c1 = (C)ad;
        }

        if (ac instanceof C){
            C c2 = (C)ac;
            System.out.println("유입2");
        }

        if (ac instanceof C c /*출처 체크하고 이상 없으면 C로 형변환*/){
            System.out.println(c.numC); // 이게 최근 문법이니 오래된거면 위 사용
        }
    }
}
