

/**
 *
 * @author Gandhi
 */
import java.util.ArrayList;
public class Sales {
    private ArrayList<Payment> payments;
    
    public Sales()
    {
        //Constructor initalizes new arraylist to store payments
        payments = new ArrayList<>();
    }
    
    public void addPayment(Payment payment)
    {
        //This method adds a payment to the sales storage
        payments.add(payment);
    }
    public void removePayment(Payment payment)
    {
        //This method removes a payment from the sales storage
        payments.remove(payment);
    }
    public void showPayments()
    {
        //This method produces a report of sales stored in the sales object
        for(Payment x : payments){
            
            System.out.println("Customer " + x.getCustomer().getName() + ": Bought " +x.getProduct() + " for $" + x.getTotal());
            
        }
    }
    public void totalPayments()
    {
        //This method adds all the stored double values in each payment object to get a sum of all payments stored
        double total = 0;
        for(Payment x : payments){
            
            total += x.getTotal();
            
        }
        System.out.println("Total Revenue : $" + total);
    }
            
    
}
