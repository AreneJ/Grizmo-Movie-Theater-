
/**
 *
 * @author Gandhi
 */
public class Payment {
    protected double total;
    protected Customer customers;
    protected String product;
    
    public double getTotal()
    {
        /*
        This method returns the stored double total variable
        @return double total
        */
        return total;
    }
    
    public Customer getCustomer()
    {
        //This method returns the stored Customer in the object
        return customers;
    }
    
    public String getProduct()
    {
        //This method returns the stored Product in the object i.e whether its a popcorn, ticket, or soda sale
        return product;
    }
}
