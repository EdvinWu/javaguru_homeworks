package Gravitrips_pack;

/**
 * Created by Edwin on 2016.03.07..
 */
public class GameField {
    private String[][] gameField = new String[6][7];

    public String[][] getGameField() {
        return gameField;
    }

    public void setGameField(String[][] gameField) {
        this.gameField = gameField;
    }

    public void createGameField() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                gameField[i][j] = ".";
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


    public boolean checkFieldX() {
        boolean checkResult = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ("X".equals(gameField[i][j]) && "X".equals(gameField[i][j + 1]) && "X".equals(gameField[i][j + 2]) && "X".equals(gameField[i][j + 3])) {
                    checkResult = true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if ("X".equals(gameField[i][j]) && "X".equals(gameField[i + 1][j]) && "X".equals(gameField[i + 2][j]) && "X".equals(gameField[i + 3][j])) {
                    checkResult = true;
                }
            }
        }
        return checkResult;

    }

    public boolean checkFieldO() {
        boolean checkResult = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ("O".equals(gameField[i][j]) && "O".equals(gameField[i][j + 1]) && "O".equals(gameField[i][j + 2]) && "O".equals(gameField[i][j + 3])) {
                    checkResult = true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if ("O".equals(gameField[i][j]) && "O".equals(gameField[i + 1][j]) && "O".equals(gameField[i + 2][j]) && "O".equals(gameField[i + 3][j])) {
                    checkResult = true;
                }
            }
        }
        return checkResult;

    }

    public boolean leftToRightDiagCheckX() {
        boolean checkResult = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if ("X".equals(gameField[i][j]) && "X".equals(gameField[i + 1][j + 1]) && "X".equals(gameField[i - 2][j + 2]) && "X".equals(gameField[i + 3][j + 3])) {
                    checkResult = true;
                }
            }
        }
        for (int i = 5; i > 2; i--) {
            for (int j = 6; j > 4; j--) {
                if ("X".equals(gameField[i][j]) && "X".equals(gameField[i - 1][j - 1]) && "X".equals(gameField[i - 2][j - 2]) && "X".equals(gameField[i - 3][j - 3])) {
                    checkResult = true;
                }
            }
        }
        return checkResult;
    }

    public boolean leftToRightDiagCheckO() {
        boolean checkResult = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if ("O".equals(gameField[i][j]) && "O".equals(gameField[i + 1][j + 1]) && "O".equals(gameField[i + 2][j + 2]) && "O".equals(gameField[i + 3][j + 3])) {
                    checkResult = true;
                }
            }
        }
        for (int i = 5; i > 2; i--) {
            for (int j = 6; j > 4; j--) {
                if ("O".equals(gameField[i][j]) && "O".equals(gameField[i - 1][j - 1]) && "O".equals(gameField[i - 2][j - 2]) && "O".equals(gameField[i - 3][j - 3])) {
                    checkResult = true;
                }
            }
        }
        return checkResult;
    }

    public boolean anyConditionMet(){
        boolean result = false;
        if (checkFieldO() || checkFieldX() || leftToRightDiagCheckO() || leftToRightDiagCheckX()){
            result = true;
        }

        return result;
    }

}
