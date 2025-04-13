import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class manages Showtime objects. It places Showtime objects into
 * a 2D array, with rows corresponding to the hour of a Showtime object and
 * columns corresponding to the day.
 * It can accommodate up to three Showtime objects per weekday, for a total
 * of 15 maximum Showtime objects.
 * 
 * @author Andrew
 */
public class ShowtimeManager {
    private final int SHOWTIMES_PER_DAY = 3;
    private final int DAYS_PER_WEEK = 5;
    private Showtime[][] showtimes = new 
                                    Showtime[SHOWTIMES_PER_DAY][DAYS_PER_WEEK];
    private String m = "Monday";
    private String t = "Tuesday";
    private String w = "Wednesday";
    private String th = "Thursday";
    private String f = "Friday";
    private String early = "1200";
    private String afternoon = "1500";
    private String late = "1800";
    private String nullMsg = "----";
    
    // Constructor pre-populates first row of showtimes
    ShowtimeManager() {
        showtimes[0][0] = new Showtime(m, early);
        showtimes[0][1] = new Showtime(t, early);
        showtimes[0][2] = new Showtime(w, early);
        showtimes[0][3] = new Showtime(th, early);
        showtimes[0][4] = new Showtime(f, early);
    }
    
    /**
     * This method prints a readable table to a command line interface
     * detailing the status of each day's showtimes. Null Showtime objects
     * print the nullMsg.
     */
    public void displayShowtimes() {
        System.out.println("|Mon|   |Tue|   |Wed|   |Thu|   |Fri|");
        
        //These nested loops print the time of each existing Showtime object
        for (int i = 0; i < SHOWTIMES_PER_DAY; i++) {
            for (int j = 0; j < DAYS_PER_WEEK; j++) {
                if (showtimes[i][j] == null) {
                    System.out.printf(nullMsg + "    ");
                } else {
                    System.out.printf(showtimes[i][j].getTime() + "    ");
                }
            }
            System.out.println("");
        }
    }
    
    /**
     * This method relies on the parameters following an expected format.
     * The outermost if branches check the day parameter against expected
     * potential inputs. The inner if branches check the time parameter
     * against expected potential inputs. Then, the appropriate Showtime
     * object is added to the 2D showtimes array.
     * 
     * If expected parameters are not entered, an invalid message is shown.
     * 
     * @param day This string is expected to be a day of the
     * week M-F; not abbreviated, not case sensitive.
     * (i.e. "monday" "TUESDAY" etc are expected).
     * 
     * @param time This string should be either "1200", "1500" or "1800".
     */
    public void createShowtime(String day, String time) {
        if (day.equalsIgnoreCase(m)) {
            if (time.equals(early)) {
                showtimes[0][0] = new Showtime(m, early);
            } else if (time.equals(afternoon)) {
                showtimes[1][0] = new Showtime(m, afternoon);
            } else if (time.equals(late)) {
                showtimes[2][0] = new Showtime(m, late);
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(t)) {
            if (time.equals(early)) {
                showtimes[0][1] = new Showtime(t, early);
            } else if (time.equals(afternoon)) {
                showtimes[1][1] = new Showtime(t, afternoon);
            } else if (time.equals(late)) {
                showtimes[2][1] = new Showtime(t, late);
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(w)) {
            if (time.equals(early)) {
                showtimes[0][2] = new Showtime(w, early);
            } else if (time.equals(afternoon)) {
                showtimes[1][2] = new Showtime(w, afternoon);
            } else if (time.equals(late)) {
                showtimes[2][2] = new Showtime(w, late);
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(th)) {
            if (time.equals(early)) {
                showtimes[0][3] = new Showtime(th, early);
            } else if (time.equals(afternoon)) {
                showtimes[1][3] = new Showtime(th, afternoon);
            } else if (time.equals(late)) {
                showtimes[2][3] = new Showtime(th, late);
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(f)) {
            if (time.equals(early)) {
                showtimes[0][4] = new Showtime(f, early);
            } else if (time.equals(afternoon)) {
                showtimes[1][4] = new Showtime(f, afternoon);
            } else if (time.equals(late)) {
                showtimes[2][4] = new Showtime(f, late);
            } else {
                System.out.println("Invalid showtime.");
            }
        } else {
            System.out.println("Invalid day.");
        }
    } //createShowtime() close
    
    /**
     * This method uses the same logic and expected parameters as
     * createShowtime(), but sets the appropriate 2D array location as null.
     * 
     * @param day This string is expected to be a day of the
     * week M-F; not abbreviated, not case sensitive.
     * (i.e. "monday" "TUESDAY" etc are expected).
     * 
     * @param time This string should be either "1200", "1500" or "1800".
     */
    public void deleteShowtime(String day, String time) {
        if (day.equalsIgnoreCase(m)) {
            if (time.equals(early)) {
                showtimes[0][0] = null;
            } else if (time.equals(afternoon)) {
                showtimes[1][0] = null;
            } else if (time.equals(late)) {
                showtimes[2][0] = null;
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(t)) {
            if (time.equals(early)) {
                showtimes[0][1] = null;
            } else if (time.equals(afternoon)) {
                showtimes[1][1] = null;
            } else if (time.equals(late)) {
                showtimes[2][1] = null;
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(w)) {
            if (time.equals(early)) {
                showtimes[0][2] = null;
            } else if (time.equals(afternoon)) {
                showtimes[1][2] = null;
            } else if (time.equals(late)) {
                showtimes[2][2] = null;
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(th)) {
            if (time.equals(early)) {
                showtimes[0][3] = null;
            } else if (time.equals(afternoon)) {
                showtimes[1][3] = null;
            } else if (time.equals(late)) {
                showtimes[2][3] = null;
            } else {
                System.out.println("Invalid showtime.");
            }
        } else if (day.equalsIgnoreCase(f)) {
            if (time.equals(early)) {
                showtimes[0][4] = null;
            } else if (time.equals(afternoon)) {
                showtimes[1][4] = null;
            } else if (time.equals(late)) {
                showtimes[2][4] = null;
            } else {
                System.out.println("Invalid showtime.");
            }
        } else {
            System.out.println("Invalid day.");
        }
    }
    
    /**
     * @param i the row or 'time of day' of desired Showtime object
     * @param j the column or 'day of week' of desired Showtime object
     * @return the Showtime object associated with [i][j] parameters
     */
    public Showtime getShowtime(int i, int j) {
        return showtimes[i][j];
    }
  
}
