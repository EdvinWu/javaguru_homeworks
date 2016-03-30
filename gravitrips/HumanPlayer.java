package javaguru.gravitrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru.gravitrips.Chip.*;


public class HumanPlayer implements Player {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Chip getChip() {
        return chip;
    }

    private Chip chip;


    public HumanPlayer(Chip chip) {
        this.chip = chip;
    }

    @Override
    public void makeTurn(GameField pole) {
        boolean turnMade = false;
        Chip[][] field = pole.getGameField();
        int i = 5;
        int j = enterAndCheck();
        do {

            if (i < 0) {
                System.out.println("");
                System.out.println("This column is full");
                i = 6;
                j = enterAndCheck();
            } else if (EMPTY == (field[i][j])) {
                field[i][j] = chip;
                turnMade = true;
            }
            i--;
        } while (!turnMade);
    }

    public int enterAndCheck() {
        int j;
        do {
            System.out.println("Enter a column Number: 1-7");
            try {
                j = Integer.parseInt(reader.readLine()) - 1;
            } catch (IOException | java.lang.NumberFormatException e) {
                System.out.println("Something went wrong, check your entry");
                j = -10;
            }
        } while (j < 0 || j > 6);
        return j;
    }
}

