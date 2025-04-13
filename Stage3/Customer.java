
/**
 *
 * @author Gandhi
 */
public class Customer {
    
    private String name;
    private Ticket ticket;
    
    public Customer(String name)
    {
        //This constructor creates a Customer object with inputed name String
        
        this.name = name;
    }
    
    public void setName(String name)
    {
        /*
        This method changes the name for a Customer
        @param name
        */
        this.name = name;
    }
    
    public String getName()
    {
        /*
        This method returns the name stored in the customer class
        @return name
        */
        return name;
    }
    public void giveTicket(Ticket ticket)
    {
        /*
        This method gives the customer their ticket to store
        @args Ticket
        */
        this.ticket = ticket;
    }
    
    

    
}
