package javaguru_homeworks.Gravitrips_pack;


import java.io.IOException;
import java.util.Random;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.02.23..
 */
public class PlayerAi implements Player {
    private final Chips chip;
    private Random random = new Random();


    public Chips getChip() {
        return chip;
    }


    public PlayerAi(Chips chip) {
        this.chip = chip;
    }
    @Override
    public void makeTurn(Chips[][] Field) throws IOException {
        boolean turnLoop = false;
        int i = 5;
        int j = random.nextInt(6);
        do {

            if (j < 0) {
                j = random.nextInt(6);
            } else if ((Field[i][j]) == EMPTY) {
                Field[i][j] = chip;
                turnLoop = true;
            }
            i--;
        } while (!turnLoop);
    }

}
