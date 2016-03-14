package javaguru_homeworks.Gravitrips_pack;


import java.io.IOException;
import java.util.Random;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.02.23..
 */
public class PlayerAi implements Player{
    private int turnCount;
    private Random random = new Random();


    public int getTurnCount() {
        return turnCount;
    }



    @Override
    public void makeTurn(Chips[][] Field) throws IOException {
        boolean turnLoop = false;
        int i = 5;
        int j = random.nextInt(6);
        do {

            if (j < 0) {
                j = random.nextInt(6);
            } else if (!("X").equals(Field[i][j]) && (!("O").equals(Field[i][j]))) {
                Field[i][j] = O;
                turnLoop = true;
            }
            i--;
        } while (!turnLoop);
    }


    @Override
    public boolean isFirstPlayerTurn() {
        return turnCount % 2 == 0;
    }
}
