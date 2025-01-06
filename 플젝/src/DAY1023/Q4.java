package DAY1023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] selections = {"가위", "바위", "보"};
        String[] humanRandom = new String[5];
        String[] AIRandom = new String[5];

        // Randomly fill human and AI choices
        Random random = new Random();
        for (int i = 0; i < humanRandom.length; i++) {
            humanRandom[i] = selections[random.nextInt(selections.length)];
            AIRandom[i] = selections[random.nextInt(selections.length)];
        }

        // Display choices
        System.out.println("휴먼:\n" + Arrays.toString(humanRandom));
        System.out.println("AI:\n" + Arrays.toString(AIRandom));

        // Execute each round
        for (int i = 0; i < humanRandom.length; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("사용 할수 있는 선택지: " + Arrays.toString(humanRandom));
            String userChoice = "";

            // Get user input
            while (true) {
                System.out.print("이 중 하나: ");
                userChoice = sc.nextLine();
                // Check if the choice is valid
                if (Arrays.asList(humanRandom).contains(userChoice)) {
                    // Mark the choice as used
                    for (int j = 0; j < humanRandom.length; j++) {
                        if (humanRandom[j].equals(userChoice)) {
                            humanRandom[j] = "사용"; // Replace with "사용"
                            break;
                        }
                    }
                    break; // Exit the loop if valid choice is made
                } else {
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            }

            // AI's choice
            String computerChoice = AIRandom[i];
            AIRandom[i] = "사용"; // Mark AI's choice as used

            // Print choices and result
            System.out.println("사용자의 선택: " + userChoice);
            System.out.println("컴퓨터의 선택: " + computerChoice);
            String result = getResult(userChoice, computerChoice);
            System.out.println("결과: " + result);
        }
        sc.close();
    }

    // Determine the result of the game
    public static String getResult(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "비김";
        } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                (userChoice.equals("보") && computerChoice.equals("바위"))) {
            return "사람 승";
        } else {
            return "인공지능 승";
        }
    }
}