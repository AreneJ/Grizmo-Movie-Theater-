

/**
 *
 * @author Gandhi
 */

public class TicketPayment extends Payment
{
    final double ticketRate = 12.00;
    public void BuyTicket(Customer customer, Ticket ticket){
        
        
        /*
        This method creates a ticketPayment and assigns the values needed for it
        @param Customer, Ticket
        */
        customers = customer;
        product = "Ticket";
        total = ticketRate;
        customer.giveTicket(ticket);
        
        
    }
    
}
