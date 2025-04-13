import java.util.Scanner;

/**
 * This class creates initial Screen objects and allows for their retrieval.
 * It also holds the ShowtimeManager object with a corresponding getter.
 * 
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
     * Empty/default constructor
     */
    ScreenManager() {
        
    }
    
    /**
     * @return Monday's Screen object
     */
    public Screen getMScreen() {
        return mScreen;
    }

    /**
     * @return Tuesday's Screen object
     */
    public Screen getTScreen() {
        return tScreen;
    }

    /**
     * @return Wednesday's Screen object
     */
    public Screen getWScreen() {
        return wScreen;
    }

    /**
     * @return Thursday's Screen object
     */
    public Screen getThScreen() {
        return thScreen;
    }

    /**
     * @return Friday's Screen object
     */
    public Screen getFScreen() {
        return fScreen;
    }

    /**
     * @return ShowtimeManager object
     */
    public ShowtimeManager getShowtimeManager() {
        return showtimeManager;
    }
    
    
}
