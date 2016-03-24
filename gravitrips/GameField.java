package javaguru.gravitrips;


import static javaguru.gravitrips.Chip.*;
import static javaguru.gravitrips.GameResult.*;



public class GameField {
    private final int WIN_STATE = 4;
    private final int COLUMNS = 7;
    private final int ROWS = 6;
    private Chip[][] gameField = new Chip[ROWS][COLUMNS];

    public Chip[][] getGameField() {
        return gameField;
    }

    public void setGameField(Chip[][] gameField) {
        this.gameField = gameField;
    }

    public GameField() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameField[i][j] = EMPTY;
            }
        }

    }

    public void cleanField() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameField[i][j] = EMPTY;
            }
        }
    }

    public void printField() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public boolean fieldCheck(Chip chip) {
        for (int i = 0; i <ROWS ; i++) {
            if (checkSingleColumn(i, chip) || checkSingleRow(i, chip) ) {
                return true;
            }
        }
        return checkSingleColumn(6, chip);
    }

    /*public boolean horizontalCheck(Chip chip) {
        for (int i = 0; i < ROWS; i++) {
            if (checkSingleRow(i, chip )) {
                return true;
            }
        }
        return false;
    }*/

    public boolean checkSingleColumn(int j, Chip chip) {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            if (gameField[i][j] == chip) {
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


    public boolean checkSingleRow(int i, Chip chip) {
        int count = 0;
        for (int j = 0; j < COLUMNS; j++) {
            if (gameField[i][j] == chip) {
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


    public boolean checkDraw() {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (gameField[i][j] != EMPTY) {
                    count++;
                }
            }
        }
        return count == 42;
    }


    public GameResult anyWinConditionMet() {
        if (fieldCheck(X)) {
            return firstPlayerWon;
        } else if (fieldCheck(O)) {
            return secondPlayerWon;
        } else if (checkDraw()) {
            return gameIsDraw;
        }
        return notFinished;
    }

}
