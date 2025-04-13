
/**
 * This class describes Showtime objects - A Showtime object
 * has two strings representing the day (intended to be M-F, 
 * "Monday" "Tuesday" etc), and time (intended to be in
 * military time, "1200" "1500" or "1800".
 * @author Andrew Cole
 */
public class Showtime {
    private String day;
    private String time;
    private Seating seatingChart = new Seating();
    
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
    
    public Seating getSeatingChart() {
        return this.seatingChart;
    }
}
