/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class Pizza implements Serializable {

    private int menuNumber;
    private String name;
    private String toppings;
    private String price;

    public Pizza(int menuNumber, String name, String toppings, String price) {
        this.menuNumber = menuNumber;
        this.name = name;
        this.toppings = toppings;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the toppings
     */
    public String getToppings() {
        return toppings;
    }

    /**
     * @param toppings the toppings to set
     */
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the menuNumber
     */
    public int getMenuNumber() {
        return menuNumber;
    }

    /**
     * @param menuNumber the menuNumber to set
     */
    public void setMenuNumber(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    @Override
    public String toString() {
        return menuNumber + " " + name + " " + toppings + ": " + price + ",- kr";
    }

}
