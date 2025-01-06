package handgame;

import java.util.Arrays;

import static handgame.Hand.selections;

public class ComRandom {
    public static void comRandom(){
        String[] comRandom = new String[5];
        for (int i = 0; i < comRandom.length; i++) {
            int randomNumber2 = (int) (Math.random() * selections.length);
            comRandom[i] = selections[randomNumber2];
        }
        System.out.println("컴퓨터:\n" + Arrays.toString(comRandom));
    }
}
