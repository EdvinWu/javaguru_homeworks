package javaGuru.javaguru_homeworks.Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Player {
    public static boolean PlayerWon = false;

    public Player() {

    }

    public static boolean isfirstPlayerTurn(int turnCount) {
        boolean firstPlayerTurn;
        firstPlayerTurn = turnCount % 2 == 0;
        return firstPlayerTurn;
    }

    public static String[][] makeTurn(String[][] mas) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int j;
        do {
            i = Integer.parseInt(reader.readLine()) - 1;
            j = Integer.parseInt(reader.readLine()) - 1;
        }
        while ("X".equals(mas[i][j]) || "O".equals(mas[i][j]));

        if (isfirstPlayerTurn(Game.turnCount)) {
            mas[i][j] = "X";
        } else {
            mas[i][j] = "O";
        }
        Game.turnCount++;
        return mas;
    }

}

