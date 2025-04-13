import java.util.Scanner;
/**
 * This class allows the creation and retrieval of Screen objects
 * @author Andrew
 */
public class ScreenManager {
    
    private Screen mScreen = new Screen("monday");
    private Screen tScreen = new Screen("tuesday");
    private Screen wScreen = new Screen("wednesday");
    private Screen thScreen = new Screen("thursday");
    private Screen fScreen = new Screen("friday");
    private static ShowtimeManager showtimeManager = new ShowtimeManager();
    
    /**
     * empty/default constructor. ScreenManager simply facilitates the creation
     * and retrieval of each day's Screen object.
     */
    ScreenManager() {
        
    }
    
    public Screen getMScreen() {
        return mScreen;
    }

    public Screen getTScreen() {
        return tScreen;
    }

    public Screen getWScreen() {
        return wScreen;
    }

    public Screen getThScreen() {
        return thScreen;
    }

    public Screen getFScreen() {
        return fScreen;
    }

    public ShowtimeManager getShowtimeManager() {
        return showtimeManager;
    }
    
    
}
