package handgame.Utils;

import java.util.Random;
import java.util.Scanner;

public class GameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int win = 0;// 전적 카운팅
        int draw = 0;
        int lose = 0;

        String[] choices = {"가위", "바위", "보"};
        String line = "-".repeat(42);
        // 게임을 반복하기 위한 무한 루프
        while (true) {
            try {
                int com = random.nextInt(choices.length); // 예외가 발생할 수 있는 코드
                String comChoice = choices[com];

                // 사용자 입력
                System.out.println("가위, 바위, 보 중 하나 선택하세요(영어로 입력)\n" + "입력란(종료시 q 입력) :");
                String user = scanner.nextLine().trim().toLowerCase();
                System.out.println(line);

                // 사용자가 'q'를 입력하면 게임 종료
                if (user.equals("q")) {
                    System.out.println("게임 종료!");
                    System.out.println(line);
                    break;
                }

                // 유효한 입력인지 확인
                if (!user.equals("바위") && !user.equals("가위") && !user.equals("보")) {
                    System.out.println("잘못된 입력입니다. 가위, 바위, 보 중 하나를 입력하세요.");
                    System.out.println(line);
                    continue; // 잘못된 입력이면 다시 입력받음
                }

                // 컴퓨터, 플레이어 선택 출력
                System.out.printf("|컴퓨터 : %s        |     플레이어 : %s%n", comChoice,user);


                // 승패 결정
                if (user.equals(comChoice.equals("가위") ? "가위" : comChoice.equals("바위") ? "바위" : "보")) {
                    //컴퓨터가 '가위'일때 s가 유저와 같은지 비교
                    // 낸게 가위가 아니라면 '바위'라고 가정하고 r 비교
                    // 낸게 둘다 아니라면 '보'라 가정하고 p 비교 - 다중삼항 연산자 사용
                    System.out.println("|--------------무승부입니다!--------------|");
                    draw++;
                    System.out.printf("| 전적    |  승:%d   |  무:%d   |  패:%d     |\n",win,draw,lose);
                    System.out.println(line);

                } else if (
                        (user.equals("바위") && comChoice.equals("가위")) ||
                                (user.equals("가위") && comChoice.equals("보")) ||
                                (user.equals("보") && comChoice.equals("바위"))
                ) {
                    System.out.println("|--------------이겼습니다!---------------|");
                    win++;
                    System.out.printf("| 전적     |  승:%d   |  무:%d   |  패:%d   |\n",win,draw,lose);
                    System.out.println(line);

                } else {
                    System.out.println("|----------------졌습니다!----------------|");
                    lose++;
                    System.out.printf("| 전적     |  승:%d    |  무:%d   |  패:%d   |\n",win,draw,lose);
                    System.out.println(line);

                }
            } catch (Exception e) {
                // 예외 발생 시 메시지 출력
                System.out.println("오류가 발생했습니다. 다시 시도하세요.");
                System.out.println(line);
            }
        }
        scanner.close(); // 스캐너 닫기
    }
}
