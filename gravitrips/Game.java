package javaguru.gravitrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

import static javaguru.gravitrips.Chip.*;
import static javaguru.gravitrips.GameResult.*;


public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private GameField pole = new GameField();
    private UserInterface interfeis = new UserInterface();
    private Player player1;
    private Player player2;

    public void createPlayers() {
        String userChoice;
        boolean validAnswer = false;
        interfeis.gameVariations();
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

    public boolean isWinner(GameResult fieldAnswer) {
        switch (fieldAnswer) {
            case FIRST_PLAYER_WON:
                System.out.println("Congratulations 1st Player won");
                break;

            case SECOND_PLAYER_WON:
                System.out.println("Congratulations 2nd Player won");
                break;

            case GAME_IS_DRAW:
                System.out.println("Friendship wins - Game is draw");
                break;

        }
        return fieldAnswer == FIRST_PLAYER_WON || fieldAnswer == SECOND_PLAYER_WON || fieldAnswer == GAME_IS_DRAW;

    }


    public void menu() {
        interfeis.menuOptions();
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
                    pve();
                    noneOptionChosen = false;
                    break;

                case "2":
                    interfeis.gameDescription();
                    menu();
                    noneOptionChosen = false;
                    break;

                case "3":
                    System.out.println("Bye");
                    noneOptionChosen = false;
                    break;

                default:
                    System.out.println("Wrong entry");
                    interfeis.menuOptions();

            }
        }
        while (noneOptionChosen);
    }

    public void pve() {
        pole.cleanField();
        boolean gameIsOver;
        do {
            gameIsOver = oneTurn(player1, player2);
        } while (!gameIsOver);
        menu();
    }

    public boolean oneTurn(Player firstTurnPlayer, Player secondTurnPlayer) {
        firstTurnPlayer.makeTurn(pole);
        pole.printField();
        if (isWinner(pole.anyWinConditionMet())) {
            return true;
        }
        secondTurnPlayer.makeTurn(pole);
        pole.printField();
        return isWinner(pole.anyWinConditionMet());
    }

    /*public void debug(){
        Chip[][] testField = new Chip[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                testField[i][j] = O;
            }
        }
        pole.setGameField(testField);
        System.out.println(Arrays.toString(pole.getColumn(2)));
    }*/
}