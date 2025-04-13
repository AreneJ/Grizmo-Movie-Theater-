

/**
 *
 * @author Gandhi
 */
public class ConcessionPayment extends Payment {
    final double popcornRate = 8.00;
    final double drinkRate = 6.00;
    
    public void BuyConcession(Customer customer){
        
        //This method assigns the valuse needed for a payment for popcorn
      
        customers = customer;
        total = popcornRate;
        product = "Consession";
        
        
    }
    public void buySoda(Customer customer){
        
        //This method assigns the valuse needed for a payment for soda
        customers = customer;
        total = drinkRate;
        product = "Soda";
        
    }
    
}
