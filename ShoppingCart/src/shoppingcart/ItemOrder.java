/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Dennis
 */
public class ItemOrder {
    
    private Item item;
    private int quantity;
    
    public ItemOrder(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return item.getName() + " - " + "x " + quantity;
    }
    public double orderPrice(ItemOrder order){
        return item.getPrice() * order.quantity;
    }
}
