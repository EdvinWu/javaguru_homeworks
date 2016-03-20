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
    public void makeTurn(Chip[][] field) {
        boolean turnMade = false;
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

    public int enterAndCheck(){
        int j;
        do {
            System.out.println("Enter a column Number: 1-6");
            try {
                j = Integer.parseInt(reader.readLine()) - 1;
            } catch (IOException e) {
                e.printStackTrace();
                j =0;
        }
        } while (j < 0 || j > 6);
        return j;
    }
}

