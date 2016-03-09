package Gravitrips_pack;


import java.io.IOException;

/**
 * Created by Edwin on 2016.02.22..
 */
public class Gravitrips {
    public static void main(String[] args) throws IOException {
        Game igra = new Game();
        igra.askForPlayers();
        GameField pole = new GameField();
        pole.createGameField();
        Player igrok = new Player();
        igrok.makeTurn(pole.getGameField());
        pole.printField();
    }
}
