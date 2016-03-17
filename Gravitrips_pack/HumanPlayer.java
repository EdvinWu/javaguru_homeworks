package javaguru_homeworks.Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.02.22..
 */
public class HumanPlayer implements Player {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Chips getChip() {
        return chip;
    }

    private Chips chip;


    public HumanPlayer(Chips chip) {
        this.chip = chip;
    }

    @Override
    public void makeTurn(Chips Field[][]) throws IOException {
        boolean turnLoop = false;
        int i = 5;
        int j = enterAndCheck();
        do {

            if (i < 0) {
                System.out.println("");
                System.out.println("This column is full");
                i = 6;
                j = enterAndCheck();
            } else if (EMPTY == (Field[i][j])) {
                Field[i][j] = chip;
                turnLoop = true;
            }
            i--;
        } while (!turnLoop);
    }

    public int enterAndCheck() throws IOException {
        int j;
        do {
            System.out.println("Enter a column Number: 1-6");
            j = Integer.parseInt(reader.readLine()) - 1;
        } while (j < 0 || j > 6);
        return j;
    }
}

