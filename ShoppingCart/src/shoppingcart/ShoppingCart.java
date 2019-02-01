/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class ShoppingCart {

    private ArrayList<ItemOrder> orders;

    public ShoppingCart() {
        orders = new ArrayList();
    }

    public static void main(String[] args) {
        ShoppingCart shop = new ShoppingCart();
        shop.test();;

    }

    public void test() {
        ShoppingCart shopper = new ShoppingCart();
        ArrayList<ItemOrder> itemOrders = new ArrayList();

        Item cola = new Item("Cola", 20.95);
        Item tomato = new Item("Tomato", 5.50);
        Item bread = new Item("Bread", 10);
        ItemOrder breadOrder = new ItemOrder(bread, 4);
        ItemOrder tomatoOrder = new ItemOrder(tomato, 4);
        ItemOrder colaOrder = new ItemOrder(cola, 4);
        itemOrders.add(breadOrder);
        itemOrders.add(tomatoOrder);
        itemOrders.add(colaOrder);
        for (ItemOrder itemOrder : itemOrders) {
            shopper.orders.add(itemOrder);

        }

        
        System.out.println(cola.toString());
        System.out.println(bread.toString());
        System.out.println(tomato.toString());
        System.out.println(breadOrder.toString());
        System.out.println(breadOrder.orderPrice(breadOrder));
        System.out.println(tomatoOrder.orderPrice(tomatoOrder));
        System.out.println(colaOrder.orderPrice(colaOrder));
        System.out.println(shopper.toString());
        System.out.println(shopper.fullPrice(shopper));
    }

    /**
     * @return the orders
     */
    public ArrayList<ItemOrder> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(ArrayList<ItemOrder> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        String str = "";

        for (ItemOrder order : orders) {

            str += order.toString() + "\n";
        }
        return str;

    }
    public String fullPrice(ShoppingCart shopper){
        double fullPrice = 0;
        for (ItemOrder order : shopper.orders) {
            fullPrice += order.orderPrice(order);
        }
        return "Du har i alt varer for: " + fullPrice + " kr";
    }
}
