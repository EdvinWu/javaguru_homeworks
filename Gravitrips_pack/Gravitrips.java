package javaguru_homeworks.Gravitrips_pack;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Gravitrips {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game();
        GameField field = new GameField();
        HumanPlayer igrok = new HumanPlayer(reader.readLine());
        field.createGameField();
        field.printField();
        igrok.makeTurn(field.getGameField());
        igrok.makeTurn(field.getGameField());
        igrok.makeTurn(field.getGameField());
        igrok.makeTurn(field.getGameField());
        field.printField();
        System.out.println(field.verticalCheckX());
    }
}
