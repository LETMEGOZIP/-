package DAY1023;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] selections = {"가위", "바위", "보"};
        String[] randomSelections = new String[5];

        for (int i = 0; i < randomSelections.length; i++) {
            int randomNumber = (int)(Math.random()*selections.length);
            randomSelections[i] = selections[randomNumber];
        }

        System.out.println("랜덤 선택 결과:");
        System.out.println(Arrays.toString(randomSelections));
        String firstRound = sc.nextLine();
    }
}
