package javaguru.gravitrips;


import static javaguru.gravitrips.GameResult.*;


public class Game {
    private GameField pole = new GameField();
    private Player player1;
    private Player player2;
    private Player currentPlayer;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean isWinner(GameResult fieldAnswer) {
        return fieldAnswer == FIRST_PLAYER_WON || fieldAnswer == SECOND_PLAYER_WON || fieldAnswer == GAME_IS_DRAW;
    }

    public void isWinnerText(GameResult fieldAnswer) {
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
    }

    public void pve() {
        currentPlayer = player1;
        boolean gameIsOver;
        do {
            gameIsOver = oneTurn(currentPlayer);
        } while (!gameIsOver);
    }

    public boolean oneTurn(Player currentPlayer) {
        currentPlayer.makeTurn(pole);
        pole.printField();
        switchPlayers();
        return checks();
    }

    public boolean checks() {
        if (isWinner(pole.anyWinConditionMet())) {
            isWinnerText(pole.anyWinConditionMet());
            return true;
        }
        return false;
    }

    private void switchPlayers() {
        if ( currentPlayer == player2){
            currentPlayer = player1;
        }else{
            currentPlayer = player2;
        }
    }

}