package handgame;

import java.util.Arrays;

import static handgame.Hand.selections;

public class PlayerRandom {
    private static String[] playerRandom;

    public static void playerRandom(){
        playerRandom = new String[5];
        for (int i = 0; i < playerRandom.length; i++) {
            int randomNumber = (int) (Math.random() * selections.length);
            playerRandom[i] = selections[randomNumber];
        }
        System.out.println("유저:\n" + Arrays.toString(playerRandom));
}
    public static String[] getPlayerRandom() {
        return playerRandom;
    }
}