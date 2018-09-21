package dicegame;

/**
 * @author Dennis
 */
public class Game {

    private boolean endTurn = false;
    private boolean endGame = false;
    //max eyes on dice
    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);
    UI ui = new UI();
    //Name, Bank, Turnpoints.
    Player player1 = new Player("", 0, 0);
    Player player2 = new Player("", 0, 0);
    AI ai = new AI("DiceMaster3000", 0, 0);

    public static void main(String[] args) {
        Game game = new Game();

        game.newGame();

    }

    // The Game
    public void newGame() {
        ui.welcome();

        if (ui.howManyPlayers()) {
            ui.player1Name(player1);
            ui.setPlayersName(player1);
            ui.player2Name(player2);
            ui.setPlayersName(player2);

            while (!endGame) {                  //The game goes on until the checkEndGame criteria is matched.
                playerTurn(player1);
                playerTurn(player2);
                checkEndGame(player1, player2);

            }
            return;
        }

        ui.onePlayer();
        ui.player1Name(player1);
        ui.setPlayersName(player1);

        while (!endGame) {                      //The game goes on until the checkEndGame criteria is matched.
            playerTurn(player1);
            aiTurn(ai);
            checkEndGameAi(player1, ai);
        }

    }

    // playerturn
    public void playerTurn(Player player) {
        ui.whosTurn(player);
        while (!endTurn) {       // The loop will go on until the player saves his points, or get 1 eye on a dice.

            ui.rollButton();

            dice1.throwDice();
            dice2.throwDice();

            if (dice1.getValue() == 1 && dice2.getValue() != 1 || dice2.getValue() == 1 && dice1.getValue() != 1) {
                ui.losePoints(dice1, dice2);
                removePoints(player);
                return; //jumps out of playerTurn and the turn is over
            }
            if (dice1.getValue() == dice2.getValue() && dice1.getValue() == 1) {
                snakeEyes(player);
                ui.snakeEyes();
            }
            ui.rollResult(dice1, dice2);
            playerSetTurnPoints(player);
            ui.continueOrBank(player);

            if (ui.savePoints(player)) {
                bankThePoints(player);
                ui.showBank(player);
                removePoints(player);
                return; //jumps out of playerTurn and the turn is over
            }

        }

    }

    //AI turn
    public void aiTurn(AI ai) {
        ui.comTurn(ai);
        ui.input();
        while (!endTurn) {        // The loop will go on until the player saves his points, or get 1 eye on ONE dice.
            dice1.throwDice();
            dice2.throwDice();

            if (dice1.getValue() == 1 && dice2.getValue() != 1 || dice2.getValue() == 1 && dice1.getValue() != 1) {
                ui.losePoints(dice1, dice2);
                aiRemovePoints(ai);
                return;
            }
            if (dice1.getValue() == dice2.getValue() && dice1.getValue() == 1) {
                aiSnakeEyes(ai);
                ui.snakeEyes();
            }
            ui.rollResultAI(ai, dice1, dice2);
            aiSetTurnPoints(ai);
            ui.showAiPoints(ai);
            ui.input();

            if (ai.getTurnPoints() >= 21) {
                ui.twentyOneOrMore(ai);
                aiBankThePoints(ai);
                ui.showAiBank(ai);
                aiRemovePoints(ai);
                return;

            }

        }

    }

    public void removePoints(Player player) {
        player.setTurnPoints(0);

    }

    public void aiRemovePoints(AI ai) {
        ai.setTurnPoints(0);
    }

    public void playerSetTurnPoints(Player player) {
        player.setTurnPoints(player.getTurnPoints() + dice1.getValue() + dice2.getValue());

    }

    public void aiSetTurnPoints(AI ai) {
        ai.setTurnPoints(ai.getTurnPoints() + dice1.getValue() + dice2.getValue());

    }

    public void bankThePoints(Player player) {
        player.setBank(player.getBank() + player.getTurnPoints());

    }

    public void aiBankThePoints(AI ai) {
        ai.setBank(ai.getBank() + ai.getTurnPoints());
    }

    public void aiSnakeEyes(AI ai) {
        ai.setTurnPoints(ai.getTurnPoints() + 10);

    }

    public void snakeEyes(Player player) {
        player.setTurnPoints(player.getTurnPoints() + 10);

    }

    public void checkEndGameAi(Player player, AI ai) {
        if (player.getBank() >= 100 && player.getBank() > ai.getBank()) {
            ui.gratsPlayer(player);
            endGame = true;
        }
        if (ai.getBank() >= 100 && ai.getBank() > player.getBank()) {
            ui.aiWins(ai, player);
            endGame = true;
        }
        if (ai.getBank() >= 100 && ai.getBank() == player.getBank()) {
            ui.tie();
            endGame = true;
        }
    }

    public void checkEndGame(Player player1, Player player2) {

        if (player1.getBank() >= 100 && player1.getBank() > player2.getBank()) {

            ui.gratsPlayer(player1);
            endGame = true;
        }
        if (player2.getBank() >= 100 && player2.getBank() > player1.getBank()) {

            ui.gratsPlayer(player2);
            endGame = true;
        }
        if (player1.getBank() == player2.getBank() && player1.getBank() >= 100) {

            ui.tie();
            endGame = true;

        }

    }

}
