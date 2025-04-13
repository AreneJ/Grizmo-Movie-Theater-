
/**
 * This class describes a Screen object. A Screen object has a roomID that is
 * intended to represent the day of week for the screen.
 * @author Andrew
 */
public class Screen {
    private String roomID;
    
    /**
     * This constructor is intended to be called through the ScreenManager
     * object's instance variables.
     * @param id the day associated with the Screen object
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
    
}
