package javaguru.gravitrips;


import java.util.Random;

import static javaguru.gravitrips.Chip.*;


public class PlayerAi implements Player {
    private final Chip chip;
    private Random random = new Random();


    public Chip getChip() {
        return chip;
    }


    public PlayerAi(Chip chip) {
        this.chip = chip;
    }
    @Override
    public void makeTurn(Chip[][] field) {
        boolean turnLoop = false;
        int i = 5;
        int j = random.nextInt(6);
        do {

            if (j < 0) {
                j = random.nextInt(6);
            } else if ((field[i][j]) == EMPTY) {
                field[i][j] = chip;
                turnLoop = true;
            }
            i--;
        } while (!turnLoop);
    }

}
