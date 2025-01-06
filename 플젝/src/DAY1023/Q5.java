package DAY1023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] selections = {"가위", "바위", "보"};
        String[] humanChoices = new String[5];
        String[] AIChoices = new String[5];

        // Fill choices
        for (int i = 0; i < humanChoices.length; i++) {
            humanChoices[i] = selections[random.nextInt(selections.length)];
            AIChoices[i] = selections[random.nextInt(selections.length)];
        }

        System.out.println("휴먼:\n" + Arrays.toString(humanChoices));
        System.out.println("AI:\n" + Arrays.toString(AIChoices));

        // Execute each round
        for (int i = 0; i < humanChoices.length; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("사용 할수 있는 선택지: " + Arrays.toString(humanChoices));
            String userChoice;

            // Get user input
            while (true) {
                System.out.print("이 중 하나: ");
                userChoice = sc.nextLine();
                if (Arrays.asList(humanChoices).contains(userChoice)) {
                    humanChoices[Arrays.asList(humanChoices).indexOf(userChoice)] = "사용";
                    break;
                } else {
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            }

            // AI's choice
            String computerChoice = AIChoices[i];
            AIChoices[i] = "사용";

            // Print choices and result
            System.out.println("사용자의 선택: " + userChoice);
            System.out.println("컴퓨터의 선택: " + computerChoice);
            System.out.println("결과: " + getResult(userChoice, computerChoice));
        }
        sc.close();
    }

    public static String getResult(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "비김";
        if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                (userChoice.equals("보") && computerChoice.equals("바위"))) {
            return "사람 승";
        }
        return "인공지능 승";
    }
}