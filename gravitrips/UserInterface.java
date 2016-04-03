package javaguru.gravitrips;

/**
 * Created by Edwin on 2016.04.02..
 */
public class UserInterface {

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
}
