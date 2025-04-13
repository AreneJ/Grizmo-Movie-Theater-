
/**
 *
 * @author Andrew
 */
public class Ticket {
    private ScreenManager screenManager = new ScreenManager();
    private static MovieStorageManager movieStorageManager = 
            new MovieStorageManager();
    private Movie movie;
    private static int ticketID = 0;
    private String day;
    private String hour;
    private int seatRow;
    private int seatCol;
    
    /**
     * This constructor should only be called through the TicketParser object's
     * createTicket() method.
     * @param movie
     * @param day
     * @param hour
     * @param seatRow
     * @param seatCol 
     */
    Ticket(Movie movie, String day, String hour, int seatRow, int seatCol) {
        this.movie = movie;
        this.day = day;
        this.hour = hour;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.ticketID++;
    }
    
    
    //empty constructor allows creation of Ticket object w/o taking a seat.
    Ticket() {
    }
    
    public ScreenManager getScreenManager() {
        return screenManager;
    }
    
    public MovieStorageManager getMovieStorageManager() {
        return Ticket.movieStorageManager;
    }
    
    public Movie getMovie() {
        return this.movie;
    }
    
}
