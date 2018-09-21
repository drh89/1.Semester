/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class UI {

    private Scanner scanner = new Scanner(System.in);

    //Break
    public void input() {
        scanner.nextLine();

    }

    public void rollResult(Dice dice1, Dice dice2) {
        System.out.println("You have rolled " + dice1.getValue() + " " + dice2.getValue());
    }

    // Puts the turnpoints in bank.
    public void continueOrBank(Player player) {

        System.out.println("You have " + player.getTurnPoints() + " turnpoints");
        System.out.println("Do you want to put your points in the bank or roll again?");
        System.out.println("Write yes if you want to bank your points / Push ENTER to roll again");
        System.out.println("");
    }

    public void rollResultAI(AI ai, Dice dice1, Dice dice2) {
        System.out.println(ai.getName() + " has rolled " + dice1.getValue() + " " + dice2.getValue());

    }

    public boolean savePoints(Player player) {

        if (scanner.nextLine().equals("yes")) {
            System.out.println("Push ENTER ");
            return true;

        }
        return false;
    }

    public void showAiPoints(AI ai) {
        System.out.println(ai.getName() + " has " + ai.getTurnPoints() + " turnpoints");
        System.out.println("");
    }

    public void twentyOneOrMore(AI ai) {
        System.out.println(ai.getName() + " has banked the turnpoints");
    }

    public void showAiBank(AI ai) {
        System.out.println(ai.getName() + " has " + ai.getBank() + " in the bank");
    }

    public boolean showBank(Player player) {

        if (scanner.nextLine().equals("")) {
            System.out.println(player.getName() + " you now have " + player.getBank() + " points in the bank");
            System.out.println("");
            return true;
        }
        return false;
    }

    public void whosTurn(Player player) {
        System.out.println("");
        System.out.println("It is your turn " + player.getName());

    }

    public void comTurn(AI ai) {
        System.out.println("It is " + ai.getName() + "'s " + "turn");

    }

    public void rollButton() {
        System.out.println("Push ENTER to roll ");
        input();
    }

    public void snakeEyes() {
        System.out.println("Snake Eyes!!");
        System.out.println("10 points in bonus");
    }

    public void losePoints(Dice dice1, Dice dice2) {
        System.out.println("You have rolled " + dice1.getValue() + " " + dice2.getValue());
        System.out.println("You rolled 1 on only one of the dice");
        System.out.println("You lose your turnpoints");
        System.out.println("");
    }

    //Asks for how many players
    public void welcome() {
        System.out.println("Welcome!");
        System.out.println("Choose how many players (1-2)");

    }

    //Sets how many players
    public boolean howManyPlayers() {
        if (scanner.nextLine().equals("2")) {
            System.out.println("2 players have been chosen");
            return true;
        }

        return false;
    }

    //Tells that one player has been choosen
    public void onePlayer() {
        System.out.println("The chosen one");
    }

    //Asks for player1 name.
    public void player1Name(Player player1) {

        System.out.println("Write the name for player 1");

    }

    //Asks for player2 name
    public void player2Name(Player player2) {
        System.out.println("Write the name for player2");

    }

    //Sets the players name
    public void setPlayersName(Player player) {

        player.setName(scanner.nextLine());

    }

    public void gratsPlayer(Player player) {
        System.out.println("Congratulations " + player.getName() + " you are the winner!");
        System.out.println("Your score is " + player.getBank() + " points");

    }

    public void aiWins(AI ai, Player player) {
        System.out.println(ai.getName() + " is the winner");
        System.out.println("Shape up " + player.getName() + "!!!");

    }

    public void tie() {
        System.out.println("It is a tie!!!");
    }

}
