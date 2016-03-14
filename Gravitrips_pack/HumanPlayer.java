package javaguru_homeworks.Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.02.22..
 */
public class HumanPlayer implements Player {
    private int turnCount;


    public int getTurnCount() {
        return turnCount;
    }


    public HumanPlayer() {

    }

    @Override
    public void makeTurn(Chips[][] Field) throws IOException {
        boolean turnLoop = false;
        int i = 5;
        int j = enterAndCheck();
        do {

            if (j < 0) {
                System.out.println("");
                System.out.println("This column is full");
            } else if (EMPTY == (Field[i][j])){
                if (isFirstPlayerTurn()) {
                    Field[i][j] = X;
                    turnCount++;
                    turnLoop = true;
                } else {
                    Field[i][j] = X;
                    turnCount++;
                    turnLoop = true;
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
            j = Integer.parseInt(reader.readLine()) - 1;
        } while (j < 0 || j > 6);
        return j;
    }


    @Override
    public boolean isFirstPlayerTurn() {
        return turnCount % 2 == 0;

    }
}

