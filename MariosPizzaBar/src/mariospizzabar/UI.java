/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;


import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class UI {

    Scanner scanner = new Scanner(System.in);

    public UI() {

    }

    public void removeOrder1() {
        System.out.println("Skriv nummeret på den ordre du vil fjerne eller b for at gå tilbage");
    }

    public void removeOrder2() {
        System.out.println("indtast et ordrenummer");
        System.out.println("tryk 1 for at fortsætte");
    }

    public void newOrder1() {
        System.out.println("Skriv nummeret på den pizza du vil tilføje");
    }

    public void newOrder2() {
        System.out.println("Tryk 1 for at fortsætte");
    }

    public void newOrder3() {
        System.out.println("tast et tal eller b for at afslutte");
        System.out.println("tast 1 for at fortsætte");
    }

    public void back() {
        System.out.println("Tryk b for at gå tilbage");
    }

    public void menu() {
        System.out.println("1: Vis Menukort");
        System.out.println("2: Indtast Bestilling");
        System.out.println("3: Vis Bestillinger");
        System.out.println("4: Fjern Bestilling");
    }

    public String input() {
        String input = scanner.next();
        return input;
    }
//    public boolean pizzaIsOnMenu(List<Pizza> pizzaMenu){
//       
//        for (Pizza pizza : pizzaMenu) {
//            if(input().equalsIgnoreCase(pizza.getMenuNumber())){
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean backButton() {
        if (scanner.next().equalsIgnoreCase("b")) {
            return true;
        }
        return false;
    }

//    public boolean showMenu(){
//        if(scanner.next().equalsIgnoreCase("1")){
//            return true;
//        }
//        return false;
//    }
}
