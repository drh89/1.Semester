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
        System.out.println("Du har slået " + dice1.getValue() + " " + dice2.getValue());
    }

    // Puts the turnpoints in bank.
    public void continueOrBank(Player player) {

        System.out.println("Du har lige nu " + player.getTurnPoints() + " points");
        System.out.println("Vil du sætte dine point i banken eller fortsætte?");
        System.out.println("Skriv ja hvis du vil sætte dem i banken / Tryk ENTER for at fortsætte");
        System.out.println("");
    }

    public void rollResultAI(AI ai, Dice dice1, Dice dice2) {
        System.out.println(ai.getName() + " har slået " + dice1.getValue() + " " + dice2.getValue());

    }

    public boolean savePoints(Player player) {

        if (scanner.nextLine().equals("ja")) {
            System.out.println("tryk ENTER ");
            return true;

        }
        return false;
    }

    public void showAiPoints(AI ai) {
        System.out.println(ai.getName() + " har lige nu " + ai.getTurnPoints() + " points");
        System.out.println("");
    }

    public void twentyOneOrMore(AI ai) {
        System.out.println(ai.getName() + " har valgt at putte pointene i banken");
    }

    public void showAiBank(AI ai) {
        System.out.println(ai.getName() + " har " + ai.getBank() + " i banken");
    }

    public boolean showBank(Player player) {

        if (scanner.nextLine().equals("")) {
            System.out.println(player.getName() + " du har nu " + player.getBank() + " point i banken");
            System.out.println("");
            return true;
        }
        return false;
    }

    public void whosTurn(Player player) {
        System.out.println("");
        System.out.println("Det er din tur " + player.getName());

    }

    public void comTurn(AI ai) {
        System.out.println("Det er " + ai.getName() + "'s " + "tur");

    }

    public void rollButton() {
        System.out.println("Tryk ENTER for at slå ");
        input();
    }

    public void snakeEyes() {
        System.out.println("Snake Eyes!!");
        System.out.println("10 point i bonus");
    }

    public void losePoints(Dice dice1, Dice dice2) {
        System.out.println("Du har slået " + dice1.getValue() + " " + dice2.getValue());
        System.out.println("Desværre du har slået en etter");
        System.out.println("Du mister dine point for turen");
        System.out.println("");
    }

    //Asks for how many players
    public void welcome() {
        System.out.println("Velkommen");
        System.out.println("Vælg antal spillere (1-2)");

    }

    //Sets how many players
    public boolean howManyPlayers() {
        if (scanner.nextLine().equals("2")) {
            System.out.println("2 spillere er valgt");
            return true;
        }

        return false;
    }

    //Tells that one player has been choosen
    public void onePlayer() {
        System.out.println("Der er valgt 1 spiller");
    }

    //Asks for player1 name.
    public void player1Name(Player player1) {

        System.out.println("Skriv navnet på spiller1");

    }

    //Asks for player2 name
    public void player2Name(Player player2) {
        System.out.println("Skriv navnet på spiller2");

    }

    //Sets the players name
    public void setPlayersName(Player player) {

        player.setName(scanner.nextLine());

    }

    public void gratsPlayer(Player player) {
        System.out.println("Tillykke " + player.getName() + " du har vundet!");
        System.out.println("Din score er " + player.getBank());

    }

    public void aiWins(AI ai, Player player) {
        System.out.println(ai.getName() + " har vundet");
        System.out.println("Kom igen " + player.getName());

    }

    public void tie() {
        System.out.println("Det endte uafgjort!");
    }

}
