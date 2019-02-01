/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madanalyse;

/**
 *
 * @author Dennis
 */
public class FoodItem {
    private final int CALORIES_PER_GRAM = 9;
    private int gramsOfFat;
    private int servings;
    
    public FoodItem(){
        
    }
    
    public FoodItem(int gramsOfFat, int servings){
        this.gramsOfFat = gramsOfFat;
        this.servings = servings;
        
        
    }

    /**
     * @return the CALORIES_PER_GRAM
     */
    public int getCALORIES_PER_GRAM() {
        return CALORIES_PER_GRAM;
    }

    /**
     * @return the gramsOfFat
     */
    public int getGramsOfFat() {
        return gramsOfFat;
    }

    /**
     * @param gramsOfFat the gramsOfFat to set
     */
    public void setGramsOfFat(int gramsOfFat) {
        this.gramsOfFat = gramsOfFat;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }
    public int fatCaloriesPerServing(){
        return gramsOfFat * CALORIES_PER_GRAM;
    }
    
    
    
    
    
}
