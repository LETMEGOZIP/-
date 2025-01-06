package DAY1023;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] selections = {"가위", "바위", "보"};
        ArrayList<String> playerRandomSelections = new ArrayList<>();
        ArrayList<String> comRandomSelections = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int randomNumber = (int)(Math.random() * selections.length);
            playerRandomSelections.add(selections[randomNumber]);
        }

        for (int i = 0; i < 5; i++) {
            int randomNumber2 = (int)(Math.random() * selections.length);
            comRandomSelections.add(selections[randomNumber2]);
        }

        System.out.println("유저의 랜덤 선택 결과:\n" + playerRandomSelections);
        System.out.println("컴퓨터의 랜덤 선택 결과:\n" + comRandomSelections);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("유저의 선택은?! " + playerRandomSelections);
            System.out.println("컴퓨터의 선택은?! "+ comRandomSelections);
            String userChoice = sc.nextLine();

            String computerChoice = comRandomSelections.get((int) Math.random());
            System.out.println("컴퓨터의 선택!: " + computerChoice);

            playerRandomSelections.remove(userChoice);
            comRandomSelections.remove(computerChoice);

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
}}}