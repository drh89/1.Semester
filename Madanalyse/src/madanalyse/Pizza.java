/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madanalyse;

import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class Pizza extends FoodItem {

    private final ArrayList<String> toppings;
   
    
    public Pizza(int gramsOfFat, int servings, ArrayList<String> toppings){
       super(gramsOfFat, servings);
       this.toppings = toppings;
        
        
    }
    
}
