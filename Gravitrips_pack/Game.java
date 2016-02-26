package javaGuru.javaguru_homeworks.Gravitrips_pack;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Game {
    static int turnCount;
    static String[][] gameField = new String[6][7];

    public Game() {

    }

    public static String[][] createGameField(String[][] Field) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                Field[i][j] = ".";
            }
        }
        return Field;
    }

    public static void printField(String[][] Field) {
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int j = 0; j < 7; j++) {
                System.out.print(Field[i][j] + " ");
            }
        }
        System.out.println("");
    }


    public static boolean checkFieldX(String[][] Field) {
        boolean endOfGame = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ("X".equals(Field[i][j]) && "X".equals(Field[i][j + 1]) && "X".equals(Field[i][j + 2]) && "X".equals(Field[i][j + 3])) {
                    endOfGame = true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if ("X".equals(Field[i][j]) && "X".equals(Field[i + 1][j]) && "X".equals(Field[i + 2][j]) && "X".equals(Field[i + 3][j])) {
                    endOfGame = true;
                }
            }
        }
        return endOfGame;

    }

    public static boolean checkFieldO(String[][] Field) {
        boolean endOfGame = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ("O".equals(Field[i][j]) && "O".equals(Field[i][j + 1]) && "O".equals(Field[i][j + 2]) && "O".equals(Field[i][j + 3])) {
                    endOfGame = true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if ("O".equals(Field[i][j]) && "O".equals(Field[i + 1][j]) && "O".equals(Field[i + 2][j]) && "O".equals(Field[i + 3][j])) {
                    endOfGame = true;
                }
            }
        }
        return endOfGame;

    }

    public static boolean status() {
        boolean end = false;
        if (checkFieldO(gameField) || checkFieldX(gameField)) {
            end = true;
        }
        return end;
    }
}
