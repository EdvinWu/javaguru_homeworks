package Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Player {
    private int turnCount;


    /*public int getTurnCount() {
        return turnCount;
    }*/



    public Player() {

    }

    public boolean isfirstPlayerTurn() {
        boolean firstPlayerTurn;
        firstPlayerTurn = turnCount % 2 == 0;
        return firstPlayerTurn;
    }

    public void makeTurn(String[][] Field) throws IOException {
        boolean turnLoop = false;
        int i = 5;
        int j = enterAndCheck();
        do {

            if (j < 0) {
                System.out.println("");
                System.out.println("This column is full");
            } else if (!("X").equals(Field[i][j]) && (!("O").equals(Field[i][j]))) {
                if (isfirstPlayerTurn()) {
                    Field[i][j] = "X";
                    turnCount++;
                    turnLoop = true;
                } else{
                    Field[i][j]="O";
                    turnCount++;
                    turnLoop =true;
                }
            }
            i--;
        } while (!turnLoop);

    }
    public int enterAndCheck() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int j;
        do {
            System.out.println("Enter a column Number: 1-6");
            j = Integer.parseInt(reader.readLine());
        } while (j < 0 || j > 6);
        return j;
    }

}

