package opgave3;

public class Shop implements ShopInterface {

    @Override
    public Customer makeCustomer(String name, String email) {
       Customer cus = new Customer(name, email);
       if(cus.getName().equalsIgnoreCase("") || cus.getEmail().equalsIgnoreCase("")){
           return null;
       }
       return cus;
        
    }

    @Override
    public Sale makeSale(String description, double price, int qty) {
        Sale sale = new Sale(description, price, qty);
        
        if(sale.getDescription().equalsIgnoreCase("") || sale.getPrice() <= 0 || sale.getQuantity() <= 0){
            return null;
        }
        return sale;
    }

    @Override
    public boolean addCustomerToSale(Sale sale, Customer customer) {
       
        
        if(sale.hasCustomer()){
            sale.setCustomer(customer);
            return true;
        }
        return false;
    }

    @Override
    public double getSaleTotal(Sale sale) {
       return sale.getTotal();
    }

    @Override
    public String getFullSale(Sale sale) {
//       return sale.getDescription() + " " + sale.getPrice() + " " + sale.getQuantity() + " " + sale.getCustomer().getName() + " " + sale.getCustomer().getEmail();
        return sale.toString();
    }
    
}
