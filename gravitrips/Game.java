package javaguru.gravitrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaguru.gravitrips.Chip.*;
import static javaguru.gravitrips.GameResult.*;


public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private GameField pole = new GameField();
    private Player player1;
    private Player player2;

    public void createPlayers() {
        String userChoice;
        boolean ValidAnswer = false;
        gameVariations();
        do {
            try {
                userChoice = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                userChoice = "";
            }
            switch (userChoice) {
                case "1": {
                    player1 = new HumanPlayer(X);
                    player2 = new HumanPlayer(O);
                    ValidAnswer = true;
                    break;
                }
                case "2": {
                    player1 = new HumanPlayer(X);
                    player2 = new PlayerAi(O);
                    ValidAnswer = true;
                    break;
                }
                case "3": {
                    player1 = new PlayerAi(X);
                    player2 = new PlayerAi(O);
                    ValidAnswer = true;
                    break;
                }
                default:
                    System.out.printf("Wrong entry, please try again");
            }
        }
        while (!ValidAnswer);
    }

    public boolean isWinner(GameResult fieldAnswer) {
        switch (fieldAnswer) {
            case firstPlayerWon: {
                System.out.println("Congratulations 1st Player won");
                break;
            }
            case secondPlayerWon: {
                System.out.println("Congratulations 2nd Player won");
                break;
            }
            case gameIsDraw: {
                System.out.println("Friendship wins - Game is draw");
                break;
            }
        }
        return fieldAnswer == firstPlayerWon || fieldAnswer == secondPlayerWon || fieldAnswer == gameIsDraw;

    }


    public void menuOptions() {
        System.out.println("Choose next option");
        System.out.println("1 - Play a new game");
        System.out.println("2 - Show rules");
        System.out.println("3 - Exit");
    }
    public void gameVariations(){
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
        menu();
    }

    public void menu() {
        menuOptions();
        String firstEntry;
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
                    createPlayers();
                    pve();
                    noneOptionChosen = false;
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
        pole.cleanField();
        boolean gameIsOver = false;
        do {
            if (oneTurnCycle(player1,player2)){
                gameIsOver = true;
            }
        } while (!gameIsOver);
        menu();
    }

    public boolean oneTurnCycle(Player firstTurnPlayer,Player secondTurnPlayer){
        firstTurnPlayer.makeTurn(pole.getGameField());
        pole.printField();
        if (isWinner(pole.anyWinConditionMet())){
            return true;
        }
        secondTurnPlayer.makeTurn(pole.getGameField());
        pole.printField();
        if (isWinner(pole.anyWinConditionMet())){
            return true;
        }
        return false;
    }
}