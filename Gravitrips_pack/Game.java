package homeworks.javaguru_homeworks.Gravitrips_pack;

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
                System.out.print(Field[i][j]);
            }
        }
    }

    public static boolean isfirstPlayerTurn(int turnCount) {
        boolean firstPlayerTurn;
        if (turnCount % 2 == 0) {
            firstPlayerTurn = true;
        } else {
            firstPlayerTurn = false;
        }
        return firstPlayerTurn;
    }

    public static boolean checkField(String[][] Field) {
        boolean victory = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {

            }
        }
        return victory;
    }
}
