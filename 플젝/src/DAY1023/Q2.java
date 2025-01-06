package DAY1023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] selections = {"가위", "바위", "보"};
        String[] playerRandomSelections = new String[5];
        String[] comRandomSelections = new String[5];

        for (int i = 0; i < playerRandomSelections.length; i++) {
            int randomNumber = (int)(Math.random() * selections.length);
            playerRandomSelections[i] = selections[randomNumber];
        }

        for (int i = 0; i < comRandomSelections.length; i++) {
            int randomNumber2 = (int)(Math.random() * selections.length);
            comRandomSelections[i] = selections[randomNumber2];
        }

        System.out.println("랜덤 선택 결과:\n"+Arrays.toString(playerRandomSelections));

        for (int i = 0; i < playerRandomSelections.length; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("이 중 하나를 골라주세요! " + Arrays.toString(playerRandomSelections));
            System.out.println("컴퓨터 꺼임! "+ Arrays.toString(comRandomSelections));
            String userChoice = sc.nextLine();

            String computerChoice = comRandomSelections[i];
            System.out.println("컴퓨터의 선택: " + computerChoice);
        }
        sc.close();
    }
}

/*
   1. 승무패
   2. 리스트 변경 기능
   3. 예외처리는 챗지피티한테 맡기라구!
   4. 남아서 100% 완료 취합하는게 문제임. 취합했을때 버그나는거 금요일!
 */
