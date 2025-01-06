package DAY1020;

import java.util.Scanner;

public class gameProgram1 extends trance {
    public static String gameProgram1() { // 숫자입력시 실행될 게임 프로그램
        int winCount = 0;
        int countHand = 0;
        int loseCount = 0;
        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위", "바위", "보"};

        while (true) {
            System.out.println("뭐내실?");
            String user = scanner.next();
            int user_int = trance(user);

            if (user_int == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (user_int == 3) {
                System.out.print("'종료'를 입력하면 종료합니다\n설명보기 : '설명'\n");
                continue;
            } else if (user_int == 9999) {
                System.out.println("다시 입력해주세요.");
                continue;
            } else if (user_int < 3) {
                int ranCom = (int) (Math.random() * 3);
                String com = hand[ranCom];
                String player = hand[user_int];

                System.out.println("컴퓨터:" + com);
                System.out.println("유저:" + player);


                if (com == player) {
                    continue;
                }
                else if (!(com == player)) {
                    if (com.equals("가위")){
                        if (player.equals("바위")){

                        }
                    }
                }
            }
        }
        return "";
    }
}