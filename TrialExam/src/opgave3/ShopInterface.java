package opgave3;

public interface ShopInterface {
    public Customer makeCustomer(String name, String email);
    public Sale makeSale (String description, double price, int qty);
    public boolean addCustomerToSale(Sale sale, Customer customer);
    public double getSaleTotal(Sale sale);
    public String getFullSale(Sale sale);
}
