package javaguru.gravitrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru.gravitrips.Chip.*;


public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private GameField pole = new GameField();
    private HumanPlayer player = new HumanPlayer(X);
    private PlayerAi playerai = new PlayerAi(O);


    public boolean isWinner(String fieldAnswer) {
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
        return fieldAnswer.equals("1st") || fieldAnswer.equals("2nd") || fieldAnswer.equals("draw");

    }
    

    public void menuOptions() {
        System.out.println("Choose next option");
        System.out.println("1 - Play a new game");
        System.out.println("2 - Show rules");
        System.out.println("3 - Exit");
    }

    public void gameDescription() {
        System.out.println("Players make turn after each other");
        System.out.println("first player claimed 4 X(first player) or O (second player)");
        System.out.println("In row, column or diagonal - wins.");
        System.out.println("Turn is similar to Tetris.");
        System.out.println("");
        menu();
    }

    public void menu() {
        menuOptions();
        String firstEntry = "";
        boolean noneOptionChosen = true;
        do {
            try {
                firstEntry = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                firstEntry = "10";
            }
            switch (firstEntry) {
                case "1": {
                    pve();
                    break;
                }
                case "2": {
                    gameDescription();
                    noneOptionChosen = false;
                    break;
                }
                case "3": {
                    System.out.println("Bye");
                    noneOptionChosen = false;
                    break;
                }
                default: {
                    System.out.println("Wrong entry");
                    menuOptions();
                }
            }
        }
        while (noneOptionChosen);
    }

    public void pve() {
        pole.createGameField();
        boolean gameIsNotOver = true;
        do {
            player.makeTurn(pole.getGameField());
            pole.printField();
            if (isWinner(pole.anyWinConditionMet())) {
                gameIsNotOver = false;
            }
            playerai.makeTurn(pole.getGameField());
            pole.printField();
            if (isWinner(pole.anyWinConditionMet())) {
                gameIsNotOver = false;
            }

        } while (gameIsNotOver);
        menu();
    }

}