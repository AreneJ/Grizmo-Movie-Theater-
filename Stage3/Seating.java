import java.util.Arrays;

/**
 * This class describes a 2D seating array. Seats are unoccupied if FALSE,
 * occupied if TRUE.
 * 
 * @author Andrew
 */
public class Seating {
    private final int ROW = 10;
    private final int COL = 10;
    private boolean[][] seatingChart = new boolean[ROW][COL];
    
    /**
     * This method 'claims' a seat as occupied.
     * @param i the seat's row
     * @param j the seat's column
     */
    public void occupySeat(int i, int j) {
        seatingChart[i][j] = true;
    }
    
    /**
     * This method designates a seat as unoccupied.
     * @param i the seat's row
     * @param j the seat's column
     */
    public void vacateSeat(int i, int j) {
        seatingChart[i][j] = false;
    }
    
    /**
     * Prints a readable representation of the seating array. Unoccupied seats
     * are represented with a "-" while occupied seats are shown as "X".
     */
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
    
    /**
     * @param i the seat row
     * @param j the seat column
     * @return whether or not a seat is occupied
     */
    public boolean getSeat(int i, int j) {
        return seatingChart[i][j];
    }
}
