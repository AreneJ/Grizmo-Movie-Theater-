
/**
 * This class describes a Screen object. A Screen object has a roomID and
 * its own Seating object - a 10 by 10 2D array.
 * @author Andrew
 */
public class Screen {
    private String roomID; 
    
    private ShowtimeManager showtimeManager = new ShowtimeManager();
    
    /**
     * This constructor is intended to be called through the ScreenManager
     * object's instance variables.
     * @param id 
     */
    Screen(String day) {
        this.roomID = day;
    }
    
    public void setRoomID (String day) {
        this.roomID = day;
    }
    
    public String getRoomID() {
        return this.roomID;
    }
    
    public ShowtimeManager getShowtimeManager() {
        return showtimeManager;
    }
    
}
