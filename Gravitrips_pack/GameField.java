package javaguru_homeworks.Gravitrips_pack;


import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.03.07..
 */
public class GameField {
    private Chips[][] gameField = new Chips[6][7];
    private final int WIN_STATE = 4;

    public Chips[][] getGameField() {
        return gameField;
    }

    public void setGameField(Chips[][] gameField) {
        this.gameField = gameField;
    }

    public void createGameField() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                gameField[i][j] = EMPTY;
            }
        }

    }

    public void printField() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public boolean verticalCheckO() {
        for (int i = 0; i < 7; i++) {
            if (checkSingleColumnO(i)) {
                return true;
            }
        }

        return false;

    }

    public boolean checkSingleColumnO(int j) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (gameField[i][j] == O) {
                count++;
            } else {
                count = 0;
            }
            if (count == WIN_STATE) {
                return true;
            }
        }
        return false;
    }

    public boolean verticalCheckX() {
        for (int j = 0; j < 7; j++) {
            if (checkSingleColumnX(j)) {
                return true;
            }
        }

        return false;

    }

    public boolean checkSingleColumnX(int j) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (gameField[i][j] == X) {
                count++;
            } else {
                count = 0;
            }
            if (count == WIN_STATE) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSingleRowX(int i) {
        int count = 0;
        for (int j = 0; j < 7; j++) {
            if (gameField[i][j] == X) {
                count++;
            } else {
                count = 0;
            }

            if (count == WIN_STATE) {
                return true;
            }
        }
        return false;
    }

    public boolean horizontalCheckX() {
        for (int i = 0; i < 6; i++) {
            if (checkSingleRowX(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSingleRowO(int i) {
        int count = 0;
        for (int j = 0; j < 7; j++) {
            if (gameField[i][j] == O) {
                count++;
            } else {
                count = 0;
            }

            if (count == WIN_STATE) {
                return true;
            }
        }
        return false;
    }

    public boolean horizontalCheckO() {
        for (int i = 0; i < 6; i++) {
            if (checkSingleRowO(i)) {
                return true;
            }
        }
        return false;
    }


    public boolean checkDraw() {
        boolean result = true;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (EMPTY == (gameField[i][j])) {
                    result = false;
                }
            }
        }
        return result;
    }

   /* public String anyWinConditionMet() {
        String result = "";
        if (checkFieldX() || leftToRightDiagCheckX()) {
            result = "1st";
        } else if (leftToRightDiagCheckO()) {
            result = "2nd";
        } else if (checkDraw()) {
            result = "draw";
        }

        return result;
    }*/

}
