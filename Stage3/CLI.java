import java.util.Scanner;

/**
 * This class structures menus and submenus to be used in a command line 
 * interface. Any class it directly interacts with is instantiated as an object. 
 * @author Andrew
 */
public class CLI {
    //variable declaration and instantiation
    boolean quitNow = false;
    int userSelection = 0;
    Scanner in = new Scanner(System.in);
    String invalid = "Invalid option.";
    String quitMsg = "Quitting...";
    
    //object declaration and instantiation
    StaffManager regularSchedule = new StaffManager();
    TicketParser ticketParser = new TicketParser();
    Ticket initialTicket = ticketParser.getInitialTicket();
    ShowtimeManager showtimeManager = initialTicket.getScreenManager().
            getShowtimeManager();
    MovieStorageManager movieList = initialTicket.getMovieStorageManager();
    Sales salesObj = new Sales();
    Customer c1 = new Customer("Sid");
    
    public void mainMenu() { 
        do {
            System.out.printf("%nGrizmo's Theater Management System%n"
                    + "Make a selection:%n"
                    + "1.) Sales%n"
                    + "2.) Customer Actions%n"
                    + "3.) Employees%n"
                    + "4.) Movies%n"
                    + "5.) Showtimes and Seats%n"
                    + "6.) Quit%n");
            
            userSelection = in.nextInt();
            
            switch (userSelection) {
                case 1: salesMenu(); break;
                case 2: customerMenu(); break;
                case 3: employeeMenu(); break;
                case 4: movieMenu(); break;
                case 5: showtimeMenu(); break;
                case 6: System.out.println(quitMsg); quitNow = true; break;
                default: System.out.println(invalid); break;
            }
        } while (!quitNow);
    } //mainMenu() close
    
    public void salesMenu() {
        do {
            System.out.printf("%nSales Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) Show All Sales%n"
                    + "2.) Get Total Revenue%n"
                    + "3.) Return to Main Menu%n"
                    + "4.) Quit%n");

            userSelection = in.nextInt();

            switch (userSelection) {
                case 1: displayAllSales(); break;
                case 2: totalPayments(); break;
                case 3: mainMenu(); break;
                case 4: System.out.println(quitMsg); quitNow = true; break;
                default: System.out.println(invalid); break;
            }
        } while (!quitNow);
    } //salesMenu() close
    
    public void customerMenu() {
        do {
            System.out.printf("%nCustomer Action Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) Buy Ticket%n"
                    + "2.) Buy Concession%n"
                    + "3.) Return to Main Menu%n"
                    + "4.) Quit%n");
            
            userSelection = in.nextInt();
            
            switch (userSelection) {
                case 1: buyTicket(); break;
                case 2: buyConcession(); break;
                case 3: mainMenu(); break;
                case 4: System.out.println(quitMsg); quitNow = true; break;
                default: System.out.println(invalid); break;
            }
            
        } while (!quitNow);
    } //customerMenu() close
    
    public void employeeMenu() {
        do {
            System.out.printf("%nEmployee Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) View Employees%n"
                    + "2.) Add New Employee%n"
                    + "3.) Modify Employee%n"
                    + "4.) Fire Employee%n"
                    + "5.) Manage Shift Assignments%n"
                    + "6.) Return to Main Menu%n"
                    + "7.) Quit%n");
            
            userSelection = in.nextInt();
            
            switch (userSelection) {
                case 1: displayEmployees(); break;
                case 2: createEmployee(); break;
                case 3: modifyEmployee(); break;
                case 4: deleteEmployee(); break;
                case 5: shiftManagerMenu(); break;
                case 6: mainMenu(); break;
                case 7: System.out.println(quitMsg); quitNow = true; break;
                default: System.out.println(invalid); break;
            }
        } while (!quitNow);
    } //employeeMenu() close
    
    public void shiftManagerMenu() {
        do {
            System.out.printf("%nShift Manager Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) View Shift Assignments%n"
                    + "2.) Assign Employee to Shift%n"
                    + "3.) Remove Employee from Shift%n"
                    + "4.) Return to Employee Menu%n"
                    + "5.) Quit%n");

            userSelection = in.nextInt();

            switch (userSelection) {
                case 1: displayShifts(); break;
                case 2: addToShift(); break;
                case 3: removeFromShift(); break;
                case 4: employeeMenu(); break;
                case 5: System.out.println(quitMsg); quitNow = true; break;
            }
        } while (!quitNow);
    } //shiftManagerMenu() close
    
    public void movieMenu() {
        do {
            System.out.printf("%nMovie Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) View Movies%n"
                    + "2.) Add New Movie%n"
                    + "3.) Modify Movie%n"
                    + "4.) Remove Movie%n"
                    + "5.) Return to Main Menu%n"
                    + "6.) Quit%n");
            
            userSelection = in.nextInt();
            
            switch (userSelection) {
                case 1: displayMovies(); break;
                case 2: createMovie(); break;
                case 3: modifyMovie(); break;
                case 4: deleteMovie(); break;
                case 5: mainMenu(); break;
                case 6: System.out.println(quitMsg); quitNow = true; break;
                default: System.out.println(invalid); break;
            }
            
        } while (!quitNow);
    } //movieMenu() close
    
    public void totalPayments() {
        salesObj.totalPayments();
    }
    
    public void showtimeMenu() {
        do {
            System.out.printf("%nShowtime and Seats Menu%n");
            System.out.printf("Make a selection:%n"
                    + "1.) View Showtimes%n"
                    + "2.) Create Showtime%n"
                    + "3.) Remove Showtime%n"
                    + "4.) View Seating Chart%n"
                    + "5.) Return to Main Menu%n"
                    + "6.) Quit%n");
            
            userSelection = in.nextInt();
            
            switch (userSelection) {
                case 1: displayShowtimes(); break;
                case 2: createShowtime(); break;
                case 3: deleteShowtime(); break;
                case 4: displaySeats(); break;
                case 5: mainMenu(); break;
                case 6: System.out.println(quitMsg); quitNow = true; break;
            }
        } while (!quitNow);
    } //showtimeMenu() close
    
    public void displayAllSales() {
        salesObj.showPayments();
    }
    
    public void displayTicketSales() {
        
        System.out.println("CLI.displayTicketSales() has been called.");
    }
    
    public void createTicketSale() {
        System.out.println("CLI.createTicketSale() has been called.");
    }
    
    public void modifyTicketSale() {
        System.out.println("CLI.modifyTicketSale() has been called.");
    }
    
    public void deleteTicketSale() {
        System.out.println("CLI.deleteTicketSale() has been called.");
    }
    
    public void buyTicket() {
        Customer purchaser;
        TicketPayment ticketPayment = new TicketPayment();
        Scanner in = new Scanner(System.in);
        Scanner integerIn = new Scanner(System.in);
        String name;
        String day;
        String hour;
        Movie movieToAdd = null;
        int movieSelection;
        int row;
        int col;
        
        System.out.println("Enter purchaser name:");
        name = in.nextLine();
        purchaser = new Customer(name);
        movieList.getMovieStorage().viewMovies();
        System.out.printf("Enter an integer indicating which movie you'd like%n"
                + "to see (I.E. to view the second movie listed, enter 2)%n");
        movieSelection = (integerIn.nextInt() - 1);
        
        movieToAdd = movieList.getMovieStorage().getMovies().get(movieSelection);

        System.out.println("Enter the day of week M-F:");
        day = in.nextLine();
        System.out.println("Enter the showtime (1200, 1500 or 1800):");
        hour = in.nextLine();
        System.out.println("Which row? (1 thru 9):");
        row = in.nextInt();
        System.out.println("Which column (1 thru 9):");
        col = in.nextInt();
        
        ticketPayment.BuyTicket(purchaser, ticketParser.ticketToGive());
        
        if (ticketParser.isTicketValid(movieToAdd, day, hour, row - 1, col - 1)) {
            ticketParser.createTicket(movieToAdd, day, hour, row - 1, col - 1);
            ticketPayment.BuyTicket(purchaser, ticketParser.ticketToGive());
            salesObj.addPayment(ticketPayment);
            System.out.println("Ticket purchased");
        }
    }
    
    public void buyConcession() {
        Customer purchaser;
        ConcessionPayment concessionPayment = new ConcessionPayment();
        Scanner in = new Scanner(System.in);
        Scanner integerIn = new Scanner(System.in);
        String name;
        int userSelection;
        
        System.out.println("Enter the name of purchaser:");
        name = in.nextLine();
        purchaser = new Customer(name);
        
        System.out.printf("Which item should be purchased?%n"
                + "1.) Concession%n"
                + "2.) Soda%n");
        userSelection = integerIn.nextInt();
        
        if (userSelection == 1) {
            concessionPayment.BuyConcession(purchaser);
            salesObj.addPayment(concessionPayment);
        } else {
            concessionPayment.buySoda(purchaser);
            salesObj.addPayment(concessionPayment);
        }
    }
    
    public void displayEmployees() {
        regularSchedule.printStaff();
    }
    
    public void createEmployee() {
        regularSchedule.hireStaff();
    }
    
    public void modifyEmployee() {
        regularSchedule.modifyStaff();
    }
    
    public void deleteEmployee() {
        regularSchedule.fireStaff();
    }
    
    public void displayShifts() {
        regularSchedule.printShifts();
    }
    
    public void addToShift() {
        regularSchedule.addToShift();
    }
    
    public void removeFromShift() {
        regularSchedule.removeFromShift();
    }
    
    public void displayMovies() {
        movieList.getMovieStorage().viewMovies();
    }
    
    public void createMovie() {
        movieList.createMovie();
    }
    
    public void modifyMovie() {
        Scanner in = new Scanner(System.in);
        int userSelection;
        movieList.getMovieStorage().viewMovies();
        System.out.printf("Change a movie's playing status by entering%n"
                + "its row number (entering 2 changes the playing status"
                + "of the second movie listed)%n");
        userSelection = (in.nextInt() - 1);
        movieList.getMovieStorage().getMovies().get(userSelection).
                changePlaying();
    }
    
    public void deleteMovie() {
        Scanner in = new Scanner(System.in);
        int userSelection;
        movieList.getMovieStorage().viewMovies();
        System.out.println("Enter the row number of the movie to remove:");
        userSelection = (in.nextInt() - 1);
        movieList.getMovieStorage().getMovies().remove(userSelection);
    }
    
    public void displayShowtimes() {
        showtimeManager.displayShowtimes();
    }
    
    public void createShowtime() {
        Scanner showtimeIn = new Scanner(System.in);
        String day;
        String time;
        System.out.println("Type a day of week M-F:");
        day = showtimeIn.nextLine();
        System.out.println("Type a time of day (1200, 1500 or 1800):");
        time = showtimeIn.nextLine();
        showtimeManager.createShowtime(day, time);
    }
    
    
    public void deleteShowtime() {
        Scanner showtimeIn = new Scanner(System.in);
        String day;
        String time;
        System.out.println("Type a day of week M-F:");
        day = showtimeIn.nextLine();
        System.out.println("Type a time of day (1200, 1500 or 1800):");
        time = showtimeIn.nextLine();
        showtimeManager.deleteShowtime(day, time);
    }
    
    public void displaySeats() {
        ticketParser.displaySeats();        
    }
        
} //CLI class close
