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
        cleanField();
    }

    public void cleanField() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameField[i][j] = EMPTY;
            }
        }
    }

    public Chip[] getColumn(int columnNo) {
        Chip[] column = new Chip[ROWS];
        Chip[][] gameField = getGameField();
        for (int i = 0; i < ROWS; i++) {
            column[i] = gameField[i][columnNo];
        }
        return column;
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
        for (int i = 0; i < COLUMNS; i++) {
            if (checkSingleColumn(i, chip)) {
                return true;
            }
        }
        for (int i = 0; i < ROWS; i++) {
            if (checkSingleRow(i, chip)) {
                return true;
            }
        }
        return false;
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
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (gameField[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public GameResult anyWinConditionMet() {
        if (fieldCheck(X)) {
            return FIRST_PLAYER_WON;
        } else if (fieldCheck(O)) {
            return SECOND_PLAYER_WON;
        } else if (checkDraw()) {
            return GAME_IS_DRAW;
        }
        return NOT_FINISHED;
    }


    public boolean fillCell(int j, Chip chip){
        boolean cellFilled = false;
        int i = 5;
        do {

            if (i < 0) {
                System.out.println("");
                System.out.println("This column is full");
                
            } else if (EMPTY == (gameField[i][j])) {
                gameField[i][j] = chip;
                cellFilled = true;
            }
            i--;
        } while (!cellFilled);
    }
}

