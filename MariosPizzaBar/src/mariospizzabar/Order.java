/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.Serializable;
import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class Order implements Serializable {

    private ArrayList<Pizza> pizzas;
    private LocalDate date;
    private LocalTime time;
    private int orderNumber;
    
    public Order(){
        
    }
    public Order(LocalDate date, LocalTime time, int orderNumber) {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.orderNumber = orderNumber;
        pizzas = new ArrayList();
    }

    /**
     * @return the pizzas
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    /**
     * @param pizzas the pizzas to set
     */
    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @return the orderNumber
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

   

    @Override
    public String toString() {
        return time + "   " + date + "\n"
                + "order" + " " + orderNumber + "\n"
                + pizzas.toString()
                        .replace("[", "").replace("]", "").replace(", ", "\n") + "\n"
                + "-----------------------------------------------------------" + "\n";
    }
}
