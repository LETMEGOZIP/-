package 예제;

public class que4 {
    public static void main(String[] args) {
        int num;
        int times;
        for (num=2; num<=9; num++){
            if (num%2==1){
                continue;
            }
        for (times = 1; times<=9; times++){
            System.out.println(""+num+"x"+times+"="+num*times+"");

        }
        }
    }
}
//구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스