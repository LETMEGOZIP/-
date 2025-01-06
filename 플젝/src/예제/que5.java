package 예제;

public class que5 {
    public static void main(String[] args) {
        int num;
        int times;
        for (num=2; num<=9; num++){
            for (times = 1; times<=9; times++){
                if (num>=times){
                    continue;
                }
                System.out.println(""+num+"x"+times+"="+num*times+"");

            }
        }
    }
}
//구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요