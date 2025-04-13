
import java.util.Scanner;


/**
 * This class acts as a sort of sentinel for the creation of Ticket objects.
 * It will perform checks to ensure the Ticket object is valid before it is
 * constructed.
 * @author Andrew
 */
public class TicketParser {
    private Ticket initialTicket = new Ticket();
    private Screen screenHolder = null;
    private Movie movie = null;
    private String day;
    private String hour;
    private int seatRow;
    private int seatCol;
    private int showtimeRow;
    private int showtimeCol;
    
    /**
     * Empty/default constructor
     */
    TicketParser() {     
    }
    
    public Ticket getInitialTicket() {
        return initialTicket;
    }
    
    /**
     * This method has several checks on its parameters. The movie must
     * be playing, the day must be M-F, hour can take on one of three String
     * values ("1200" "1500" or "1800"), and the seat specified by the 
     * seatRow and seatCol integers must be unoccupied.
     * If all conditions are met, a true value is returned.
     * @param movie
     * @param day
     * @param hour
     * @param row
     * @param col
     * @return whether the ticket is valid or not
     */
    public boolean isTicketValid(Movie movie, String day, String hour, int row, int col) {
        boolean isValid = false;
        
        if (!(movie.checkPlaying())) {
            System.out.println("That movie is not playing");
        } else if (day.equalsIgnoreCase("monday")) {
            this.day = day;
            if (hour.equals("1200")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(0, 0) == null)) {
                    this.showtimeRow = 0;
                    this.showtimeCol = 0;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(0, 0).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else if (hour.equals("1500")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().getShowtimeManager().
                        getShowtime(1, 0) == null)) {
                    this.showtimeRow = 1;
                    this.showtimeCol = 0;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(1, 0).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(2, 0) == null)) {
                    this.seatRow = 2;
                    this.seatCol = 0;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(2, 0).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            }
        } else if (day.equalsIgnoreCase("tuesday")) {
            this.day = day;
            if (hour.equals("1200")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(0, 1) == null)) {
                    this.showtimeRow = 0;
                    this.showtimeCol = 1;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(0, 1).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else if (hour.equals("1500")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().getShowtimeManager().
                        getShowtime(1, 1) == null)) {
                    this.showtimeRow = 1;
                    this.showtimeCol = 1;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(1, 1).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(2, 1) == null)) {
                    this.showtimeRow = 2;
                    this.showtimeCol = 1;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(2, 1).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            }
        } else if (day.equalsIgnoreCase("wednesday")) {
            this.day = day;
            if (hour.equals("1200")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(0, 2) == null)) {
                    this.showtimeRow = 0;
                    this.showtimeCol = 2;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(0, 2).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else if (hour.equals("1500")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().getShowtimeManager().
                        getShowtime(1, 2) == null)) {
                    this.showtimeRow = 1;
                    this.showtimeCol = 2;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(1, 2).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(2, 2) == null)) {
                    this.showtimeRow = 2;
                    this.showtimeCol = 2;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(2, 2).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            }
        } else if (day.equalsIgnoreCase("thursday")) {
            this.day = day;
            if (hour.equals("1200")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(0, 3) == null)) {
                    this.showtimeRow = 0;
                    this.showtimeCol = 3;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(0, 3).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else if (hour.equals("1500")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().getShowtimeManager().
                        getShowtime(1, 3) == null)) {
                    this.showtimeRow = 1;
                    this.showtimeCol = 3;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(1, 3).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(2, 3) == null)) {
                    this.showtimeRow = 2;
                    this.showtimeCol = 3;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(2, 3).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            }
        } else {
            this.day = day;
            if (hour.equals("1200")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(0, 4) == null)) {
                    this.showtimeRow = 0;
                    this.showtimeCol = 4;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(0, 4).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else if (hour.equals("1500")) {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().getShowtimeManager().
                        getShowtime(1, 4) == null)) {
                    this.showtimeRow = 1;
                    this.showtimeCol = 4;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(1, 4).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            } else {
                this.hour = hour;
                if (!(initialTicket.getScreenManager().
                        getShowtimeManager().getShowtime(2, 4) == null)) {
                    this.showtimeRow = 2;
                    this.showtimeCol = 4;
                    Seating earlySeats
                            = initialTicket.getScreenManager().
                                    getShowtimeManager().getShowtime(2, 4).
                                    getSeatingChart();
                    if (earlySeats.getSeat(row, col) == false) {
                        this.seatRow = row;
                        this.seatCol = col;
                        isValid = true;
                    } else {
                        System.out.println("Seat already taken");
                    }
                } else {
                    System.out.println("Unavailable showtime");
                }
            }
        }
        return isValid;
    }
    
    /**
     * This method should only be called after the isTicketValid() method,
     * using the same parameters as those used in isTicketValid().
     * @return a ticket with valid attributes
     */
    public Ticket createTicket(Movie movie, String date, String hour,
            int row, int col) {
        Ticket ticket = new Ticket(movie, date, hour, 
                row, col);
        initialTicket.getScreenManager().getShowtimeManager().
                getShowtime(showtimeRow, showtimeCol).getSeatingChart().
                occupySeat(row, col);
        return ticket;
    }
    
    /**
     * This method is used in conjunction with Customer object's giveTicket()
     * method.
     * @return 
     */
    public Ticket ticketToGive() {
        Ticket ticketToGive = new Ticket(this.movie, this.day, this.hour,
                this.seatRow, this.seatCol);
        return ticketToGive;
    }
    
    /**
     * This method is in TicketParser because it was the only way to get
     * the seating array displayed to match with both Showtime objects and
     * the seating charts they use.
     * It uses the ShowtimeManager object's 2D Showtime array and some
     * magic numbers to display appropriate seating charts.
     */
        public void displaySeats() {
        Scanner in = new Scanner(System.in);
        ShowtimeManager showtimeManager = initialTicket.getScreenManager().
                getShowtimeManager();
        String day;
        String hour;

        System.out.println("View seating for which day (M-F):");
        day = in.nextLine();

        System.out.println("View Seating for which showtime "
                + "(1200, 1500 or 1800):");
        hour = in.nextLine();

        if (day.equalsIgnoreCase("monday")) {
            if (hour.equals("1200")) {
                if (showtimeManager.getShowtime(0, 0) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(0, 0).
                            getSeatingChart().showSeats();
                }
            } else if (hour.equals("1500")) {
                if (showtimeManager.getShowtime(1, 0) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(1, 0).
                            getSeatingChart().showSeats();
                }
            } else {
                if (showtimeManager.getShowtime(2, 0) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(2, 0).
                            getSeatingChart().showSeats();
                }
            }
        } else if (day.equalsIgnoreCase("tuesday")) {
            if (hour.equals("1200")) {
                if (showtimeManager.getShowtime(0, 1) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(0, 1).
                            getSeatingChart().showSeats();
                }
            } else if (hour.equals("1500")) {
                if (showtimeManager.getShowtime(1, 1) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(1, 1).
                            getSeatingChart().showSeats();
                }
            } else {
                if (showtimeManager.getShowtime(2, 1) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(2, 1).
                            getSeatingChart().showSeats();
                }
            }
        } else if (day.equalsIgnoreCase("wednesday")) {
            if (hour.equals("1200")) {
                if (showtimeManager.getShowtime(0, 2) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(0, 2).
                            getSeatingChart().showSeats();
                }
            } else if (hour.equals("1500")) {
                if (showtimeManager.getShowtime(1, 2) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(1, 2).
                            getSeatingChart().showSeats();
                }
            } else {
                if (showtimeManager.getShowtime(2, 2) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(2, 2).
                            getSeatingChart().showSeats();
                }
            }
        } else if (day.equalsIgnoreCase("thursday")) {
            if (hour.equals("1200")) {
                if (showtimeManager.getShowtime(0, 3) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(0, 3).
                            getSeatingChart().showSeats();
                }
            } else if (hour.equals("1500")) {
                if (showtimeManager.getShowtime(1, 3) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(1, 3).
                            getSeatingChart().showSeats();
                }
            } else {
                if (showtimeManager.getShowtime(2, 3) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(2, 3).
                            getSeatingChart().showSeats();
                }
            }
        } else {
            if (hour.equals("1200")) {
                if (showtimeManager.getShowtime(0, 4) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(0, 4).
                            getSeatingChart().showSeats();
                }
            } else if (hour.equals("1500")) {
                if (showtimeManager.getShowtime(1, 4) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(1, 4).
                            getSeatingChart().showSeats();
                }
            } else {
                if (showtimeManager.getShowtime(2, 4) == null) {
                    System.out.println("Sorry that showtime is unavailable");
                } else {
                    showtimeManager.getShowtime(2, 4).
                            getSeatingChart().showSeats();
                }
            }
        }
    }
}
