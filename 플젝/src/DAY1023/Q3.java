package DAY1023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] selections = {"가위", "바위", "보"};
        String[] playerRandom = new String[5];
        String[] comRandom = new String[5];

        // 사용자와 컴퓨터의 랜덤 배분
        for (int i = 0; i < playerRandom.length; i++) {
            int randomNumber = (int) (Math.random() * selections.length);
            playerRandom[i] = selections[randomNumber];
        }

        for (int i = 0; i < comRandom.length; i++) {
            int randomNumber2 = (int) (Math.random() * selections.length);
            comRandom[i] = selections[randomNumber2];
        }

        // 유저와 컴퓨터의 선택을 출력함
        System.out.println("유저:\n" + Arrays.toString(playerRandom));
        System.out.println("컴퓨터:\n" + Arrays.toString(comRandom));

        // 각 라운드 실행
        for (int i = 0; i < playerRandom.length; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("낼수 있는 선택지: " + Arrays.toString(playerRandom));

        // 휴먼 입력 받음
            String userChoice;
            while (true) {
                System.out.print("뭐낼꺼?: ");
                userChoice = sc.nextLine();
                if (Arrays.asList(playerRandom).contains(userChoice)) {
                    for (int j = 0; j < playerRandom.length; j++) {
                        if (playerRandom[j].equals(userChoice)) {
                            playerRandom[j] = "사용";
                            break; // 똑같은 요소가 "사용"으로 변경되는 걸 방지하기 위한 break
                        }
                    }
                   break; // while 문 종료를 위한 break
                } else {
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            }

            // 컴퓨터의 선택
            String computerChoice = comRandom[i];
            //comRandom[i] = "사용"; // 인공지능 랜덤요소도 소모하기 위해 적용 (없어도 되긴한데 나는 컴퓨터것도 없애고싶은걸?)

            // 결과 출력
            System.out.println("사용자의 선택: " + userChoice);
            System.out.println("컴퓨터의 선택: " + computerChoice);

            // 가위바위보 규칙에 따른 승패 확인
            String result = getResult(userChoice, computerChoice);
            System.out.println("결과: " + result);
        }
        sc.close();
    }

    // 가위바위보 승패를 계산
    public static String getResult(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "비김";
        } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                (userChoice.equals("보") && computerChoice.equals("바위"))) {
            return "유저 승";
        } else {
            return "컴퓨터 승";
        }
    }
}