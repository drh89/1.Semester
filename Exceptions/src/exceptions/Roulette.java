/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Roulette {

    private enum Color {
        RED, BLACK, GREEN
    };
    private int result;
    private Scanner scanner = new Scanner(System.in);
    private int bet;
    private boolean betLoop = false;
   

    public static void main(String[] args) {
        Roulette rou = new Roulette();
        rou.game();
    }

    public void game() {
        Player player = new Player("Dennis", 100);

        do {

            System.out.println("How much do you want to bet?");
            System.out.println("The bet has to be equal to 0 when divided by 5");

            try {
                bet(player);
            } catch (NumberFormatException e) {
                System.out.println("You need to place a bet!");
            } catch (IllegalChipException e) {
                System.out.println("Illegal bet");
            } catch (NotEnoughFundsException e) {
                System.out.println("Not enough funds!");
            } 
        }while (!betLoop);
        System.out.println("Choose which color you want to bet on");
        System.out.println("Red or black");
        System.out.println("Write r for red or write b for black");
        System.out.println(guess());
        System.out.println("the roulette stops at ");
        if(spin().equalsIgnoreCase("green")){
            System.out.println("Sorry it landed on green");
            System.out.println("You lose your bet, but gets 5 back");
            player.setMoney((player.getMoney() - bet) + 5);
        }
        else if(spin().equals(guess())){
            System.out.println("Congratulations");
            player.setMoney(player.getMoney() + (bet * 2));
        }
        else if(!spin().equals(guess())){
            System.out.println("Sorry, you lose your bet");
            player.setMoney(player.getMoney() - bet);
        }
        System.out.println();
        System.out.println("You now have: " + player.getMoney());
        
        
        
    }
    public String guess(){
        String guess = scanner.next();
        
        if(guess.equalsIgnoreCase("r")){
            guess = Color.RED.toString();
        }
        if(guess.equalsIgnoreCase("b")){
            guess = Color.BLACK.toString();
        }
        return guess;
        
    }

    public String spin() {
        Random rand = new Random(System.currentTimeMillis());
        String color = "";

        result = rand.nextInt(11);
        if (result == 0) {
            color = Color.GREEN.toString();

        }
        if (result % 2 == 0) {
            color = Color.RED.toString();
        }
        if (result % 2 != 0) {
            color = Color.BLACK.toString();
        }
        return color;
    }

    public void bet(Player player) throws NumberFormatException, NotEnoughFundsException, IllegalChipException {

        if (!scanner.hasNextInt()) {
            throw new NumberFormatException();

        }

        if (scanner.hasNextInt()) {
            bet = scanner.nextInt();
        }

        if (bet % 5 != 0) {
            throw new IllegalChipException();
        }

        if (bet > player.getMoney()) {
            throw new NotEnoughFundsException();

        }

        betLoop = true;

    }

}
