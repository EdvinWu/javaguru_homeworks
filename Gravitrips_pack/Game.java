package javaguru_homeworks.Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    GameField pole = new GameField();
    HumanPlayer player = new HumanPlayer(X);
    PlayerAi playerai = new PlayerAi(O);


    public boolean boolStatus(String fieldAnswer) {
        return fieldAnswer.equals("1st") || fieldAnswer.equals("2nd") || fieldAnswer.equals("draw");

    }

    public boolean textStatus(String fieldAnswer) {
        switch (fieldAnswer) {
            case "1st": {
                System.out.println("Congratulations 1st Player won");
                break;
            }
            case "2nd": {
                System.out.println("Congratulations 2nd Player won");
                break;
            }
            case "draw": {
                System.out.println("Friendship wins - Game is draw");
                break;
            }
        }
        return false;
    }

    public void menuOptions() {
        System.out.println("Choose next option");
        System.out.println("1 - Play a new game");
        System.out.println("2 - Show rules");
        System.out.println("3 - Exit");
    }

    public void gameDescription() throws IOException {
        System.out.println("Players make turn after each other");
        System.out.println("first player claimed 4 X(first player) or O (second player)");
        System.out.println("In row, column or diagonal - wins.");
        System.out.println("Turn is similar to Tetris.");
        System.out.println("");
        menu();
    }

    public void menu() throws IOException {
        menuOptions();
        String firstEntry = "";
        boolean loop = true;
        do {
            firstEntry = reader.readLine();
            switch (firstEntry) {
                case "1": {
                    pve();
                    break;
                }
                case "2": {
                    gameDescription();
                    loop = false;
                    break;
                }
                case "3": {
                    System.out.println("Bye");
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Wrong entry");
                    menuOptions();
                }
            }
        }
        while (loop);
    }

    public void pve() throws IOException {
        pole.createGameField();
        boolean loop = true;
        do {
            player.makeTurn(pole.getGameField());
            pole.printField();
            if (boolStatus(pole.anyWinConditionMet())) {
                textStatus(pole.anyWinConditionMet());
                loop = false;
            }
            playerai.makeTurn(pole.getGameField());
            pole.printField();
            if (boolStatus(pole.anyWinConditionMet())) {
                textStatus(pole.anyWinConditionMet());
                loop = false;
            }

        } while (loop);
        menu();
    }

}