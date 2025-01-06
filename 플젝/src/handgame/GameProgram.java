package handgame;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import static handgame.ComRandom.comRandom;
import static handgame.GameRound.gameRound;
import static handgame.PlayerRandom.getPlayerRandom;
import static handgame.PlayerRandom.playerRandom;


public class GameProgram {
    public static void gameProgram(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        PlayerRandom playerRandom = new PlayerRandom();
        ComRandom comRandom = new ComRandom();
        GameRound round = new GameRound();

        playerRandom();
        comRandom();
        gameRound();

        for (int i = 0; i < 5; i++) {
            System.out.println("\n라운드 " + (i + 1));
            LinkedList playerRandomSelections = getPlayerRandom();
            System.out.println("유저의 선택은?! " + playerRandomSelections);
            LinkedList comRandomSelections = new LinkedList<>();
            System.out.println("컴퓨터의 선택은?! "+ comRandomSelections);
            String userChoice = sc.nextLine();

            String computerChoice = (String) comRandomSelections.get((int) Math.random());
            System.out.println("컴퓨터의 선택!: " + computerChoice);

            playerRandomSelections.remove(userChoice);
            comRandomSelections.remove(computerChoice);
    }
}}
