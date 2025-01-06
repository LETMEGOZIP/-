package handgame;

import java.util.Arrays;

import static handgame.PlayerRandom.playerRandom;

public class GameRound {
    public static void gameRound(){
        PlayerRandom.getPlayerRandom();
        String[] playerChoice = PlayerRandom.getPlayerRandom();
        for (int i = 0; i < 5; i++) {
            System.out.println("\n라운드 " + (i + 1));
            System.out.println("낼수 있는 선택지: " + Arrays.toString(playerChoice));
        }
}}
