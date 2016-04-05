package javaguru.gravitrips;


import static javaguru.gravitrips.GameResult.*;


public class Game {
    private GameField pole = new GameField();
    private Player player1;
    private Player player2;


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
        pole.cleanField();
        boolean gameIsOver;
        do {
            gameIsOver = oneTurn(player1, player2);
        } while (!gameIsOver);
    }

    public boolean oneTurn(Player firstTurnPlayer, Player secondTurnPlayer) {
        firstTurnPlayer.makeTurn(pole);
        pole.printField();
        if (checks()){
            return true;
        }
        secondTurnPlayer.makeTurn(pole);
        pole.printField();
        return checks();
    }

    public boolean checks(){
        if (isWinner(pole.anyWinConditionMet())) {
            isWinnerText(pole.anyWinConditionMet());
            return true;
        }
        return false;
    }

}