package javaGuru.javaguru_homeworks.Gravitrips_pack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Gravitrips {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entry;
        boolean finish = false;
        //Game testGame = new Game();
        Game.createGameField(Game.gameField);
        System.out.println("1 player or 2 players?");
        System.out.println("Please answer by typing number 1 or 2");
        boolean isAi = PlayerAi.askForAi();
        do {
            entry = reader.readLine();
            switch (entry) {
                case "1": {
                    Player.makeTurn(Game.gameField);

                    Game.printField(Game.gameField);
                    if (Game.status()) {
                        finish = true;
                        Player.PlayerWon = true;
                        if (Player.isfirstPlayerTurn(Game.turnCount - 1)) {
                            System.out.println("Player 1 won");
                        } else {
                            System.out.println("Player 2 won");
                        }
                    }
                    if (isAi && !Player.isfirstPlayerTurn(Game.turnCount) && !Player.PlayerWon) {
                        PlayerAi.makeTurn(Game.gameField);
                        Game.printField(Game.gameField);
                        if (Game.status()) {
                            finish = true;
                            System.out.println("Computer wins");
                        }
                    }
                    break;
                }
                case "2":
                    finish = true;
                    System.out.println("Bye");
            }

        }
        while (!finish);

    }
}
