
import java.util.Arrays;



/**
 * This class describes a 2D seating array. Seats are unoccupied if FALSE,
 * occupied if TRUE.
 * @author Andrew
 */
public class Seating {
    private final int ROW = 10;
    private final int COL = 10;
    private boolean[][] seatingChart = new boolean[ROW][COL];
    
    
    public void occupySeat(int i, int j) {
        seatingChart[i][j] = true;
    }
    
    public void vacateSeat(int i, int j) {
        seatingChart[i][j] = false;
    }
    
    public void showSeats() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (seatingChart[i][j] == false) {
                    System.out.printf(" - ");
                } else {
                    System.out.printf(" X ");
                }
            }
            System.out.println("");
        }
    }
    
    public boolean getSeat(int i, int j) {
        return seatingChart[i][j];
    }
}
