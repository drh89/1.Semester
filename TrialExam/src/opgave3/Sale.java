package opgave3;

public class Sale {
    private String description;
    private double price;
    private int quantity;
    private Customer cus;
    
//    public Sale(String description, double price, int quantity, Customer cus){
//        this.description = description;
//        this.price = price;
//        this.quantity = quantity;
//        this.cus = cus;
//    }
    public Sale(String description, double price, int quantity){
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.cus = null;
    }
    
   
    

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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

    /**
     * @return the cus
     */
    public Customer getCustomer() {
        return cus;
    }

    /**
     * @param cus the cus to set
     */
    public void setCustomer(Customer cus) {
        this.cus = cus;
    }
     public double getTotal(){
       double total = price * quantity;
       if(total <= 0){
           return -1;
       }
       return total;
    }
    public boolean hasCustomer(){
        if(cus == null){
            return true;
        }
        return false;
    }
    public String toString(){
        String custom = "";
        if(cus == null){
            custom = "No Customer";
        } else{
            custom = cus.toString();
        }
        return description + " " + quantity + " " + price + " " + custom;
    }
    
    
}
