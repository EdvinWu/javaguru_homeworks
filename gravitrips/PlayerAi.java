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
   public void makeTurn(GameField pole){
       int j = random.nextInt(7);
       if(pole.isEmptyCell(j)){
           pole.setCell(pole.getCell(j),j,chip);
       }else{
           makeTurn(pole);
       }

   }

}
