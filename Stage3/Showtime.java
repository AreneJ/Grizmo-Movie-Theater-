
/**
 * This class describes Showtime objects - A Showtime object
 * has two strings representing the day (intended to be M-F, 
 * "Monday" "Tuesday" etc), and time (intended to be in
 * military time, "1200" "1500" or "1800"). Each Showtime object
 * also has an associated Seating object.
 * 
 * @author Andrew Cole
 */
public class Showtime {
    private String day;
    private String time;
    private Seating seatingChart = new Seating();
    
    /**
     * Showtime object constructor
     * @param dayOfWeek
     * @param hourOfDay 
     */
    Showtime(String dayOfWeek, String hourOfDay) {
        this.day = dayOfWeek;
        this.time = hourOfDay;
    }
    
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String dayOfWeek) {
        this.day = dayOfWeek;
    }
    
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String hourOfDay) {
        this.time = hourOfDay;
    }
    
    /**
     * @return Seating object associated with a particular Showtime object
     */
    public Seating getSeatingChart() {
        return this.seatingChart;
    }
}
