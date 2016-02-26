package javaGuru.javaguru_homeworks.Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Edwin on 2016.02.23..
 */
public class PlayerAi {
    public static Random random = new Random();

    public PlayerAi() {

    }

    public static String[][] makeTurn(String[][] mas) {
        int i;
        int j;
        do {
            i = random.nextInt(6);
            j = random.nextInt(7);
        }
        while ("X".equals(mas[i][j]) || "O".equals(mas[i][j]));
        mas[i][j] = "O";
        Game.turnCount++;
        return mas;
    }

    public static boolean askForAi() throws IOException {
        boolean answer;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String decision = reader.readLine();
        if (decision.equals("1")) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

}
