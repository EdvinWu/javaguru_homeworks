package javaguru.gravitrips;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru.gravitrips.Chip.*;


public class UserInterface {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Player player1;
    private Player player2;


    public void menuOptions() {
        System.out.println("Choose next option");
        System.out.println("1 - Play a new game");
        System.out.println("2 - Show rules");
        System.out.println("3 - Exit");
    }

    public void gameVariations() {
        System.out.println("Choose game mode ");
        System.out.println("1 - Player versus Player ");
        System.out.println("2 - Player versus Ai ");
        System.out.println("3 - Ai versus Ai");
    }

    public void gameDescription() {
        System.out.println("Players make turn after each other");
        System.out.println("first player claimed 4 X(first player) or O (second player)");
        System.out.println("In row, column or diagonal - wins.");
        System.out.println("Turn is similar to Tetris.");
        System.out.println("");

    }

    public void createPlayers() {
        String userChoice;
        boolean validAnswer = false;
        gameVariations();
        do {
            try {
                userChoice = reader.readLine();
            } catch (IOException e) {
                System.out.println("Something went wrong, please check your entry");
                userChoice = "";
            }
            switch (userChoice) {
                case "1":
                    player1 = new HumanPlayer(X);
                    player2 = new HumanPlayer(O);
                    validAnswer = true;
                    break;

                case "2":
                    player1 = new HumanPlayer(X);
                    player2 = new PlayerAi(O);
                    validAnswer = true;
                    break;

                case "3":
                    player1 = new PlayerAi(X);
                    player2 = new PlayerAi(O);
                    validAnswer = true;
                    break;

                default:
                    System.out.println("Wrong entry, please try again");
            }
        }
        while (!validAnswer);
    }

    public void menu() {
        menuOptions();
        String firstEntry;
        boolean noneOptionChosen = true;
        do {
            try {
                firstEntry = reader.readLine();
            } catch (IOException e) {
                System.out.println("Something went wrong, please check your entry");
                firstEntry = "";
            }
            switch (firstEntry) {
                case "1":
                    createPlayers();
                    Game igra = new Game(player1, player2);
                    igra.pve();
                    menu();
                    noneOptionChosen = false;
                    break;

                case "2":
                    gameDescription();
                    menu();
                    noneOptionChosen = false;
                    break;

                case "3":
                    System.out.println("Bye");
                    noneOptionChosen = false;
                    break;

                default:
                    System.out.println("Wrong entry");
                    menuOptions();

            }
        }
        while (noneOptionChosen);
    }


}
