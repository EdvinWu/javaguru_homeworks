package Gravitrips_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int turnCount;

    public Game() {

    }

    public String askForPlayers() throws IOException {
        String answer = " ";
        boolean loop = true;
        String decision = "";
        do {
            decision = reader.readLine();
            switch (decision) {
                case "1": {
                    answer = "0";
                    loop = false;
                    break;

                }
                case "2": {
                    answer = "1";
                    loop = false;
                    break;
                }
                case "3": {
                    answer = "2";
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Wrong entry, try again");
                }

            }
        } while (loop);
        return answer;
    }

    public void createPlayers(String answer) {
        switch (answer) {
            case "0": {
                Player humPlayer = new Player();
                Player humPlayer2 = new Player();
                break;
            }
            case "1": {
                Player humPlayer = new Player();
                PlayerAi compPlayer = new PlayerAi();
                break;
            }
            case "2": {
                PlayerAi compPlayer = new PlayerAi();
                PlayerAi compPlayer2 = new PlayerAi();
            }
        }
    }


    public boolean status(boolean fieldAnswer) {
        return fieldAnswer;
    }

    public void menuOptions(){
        System.out.println("Choose next option");
        System.out.println("1 - Play a new game");
        System.out.println("2 - Show rules");
        System.out.println("3 - Exit");
    }

    public void menu() throws IOException {
        menuOptions();
        String firstEntry = "";
        boolean loop = true;
        do {
            firstEntry = reader.readLine();
            switch (firstEntry) {
                case "1": {
                    createPlayers(askForPlayers());
                    loop = false;
                    // vizov menju igri
                    break;
                }
                case "2": {
                    // vizov opisanija igri
                    loop = false;
                    break;
                }
                case "3":{
                    System.out.println("Bye");
                }
                default:{
                    System.out.println("Wrong entry");
                    menuOptions();
                }
            }
        }
        while (loop);

    }
}