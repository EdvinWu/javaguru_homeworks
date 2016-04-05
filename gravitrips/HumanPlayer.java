package javaguru.gravitrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru.gravitrips.Chip.*;


public class HumanPlayer implements Player {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Chip chip;


    public Chip getChip() {
        return chip;
    }

    public HumanPlayer(Chip chip) {
        this.chip = chip;
    }


    @Override
    public void makeTurn(GameField pole){
        int j = enterAndCheck();
        if(pole.isEmptyCell(j)){
           pole.setCell(pole.getCell(j),j,chip);
        }else{
            System.out.println("This column is full");
            makeTurn(pole);
        }

    }

}

