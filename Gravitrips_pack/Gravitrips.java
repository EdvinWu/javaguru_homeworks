package javaguru_homeworks.Gravitrips_pack;




import java.io.IOException;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Gravitrips {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        GameField field = new GameField();
        HumanPlayer igrok = new HumanPlayer();
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
