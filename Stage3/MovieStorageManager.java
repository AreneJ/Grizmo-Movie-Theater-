import java.util.Scanner;

/**
 * This class interacts with the CLI to allow manipulation of Movie objects
 * via MovieStorage
 * @author Andrew
 */
public class MovieStorageManager {
    private MovieStorage movieList = new MovieStorage();
    
    /**
     * Constructor pre-populates MovieStorage with Movie objects, one of which
     * is automatically 'playing'
     */
    MovieStorageManager() {
        Movie copDrama = new Movie("Moral Hazard","Drama");
        Movie familyFun = new Movie("Dogforce", "Family");
        Movie kickPunch = new Movie("Death Scar", "Martial Arts");
        movieList.addMovie(copDrama);
        movieList.addMovie(familyFun);
        movieList.addMovie(kickPunch);
        copDrama.changePlaying();
    }
    
    /**
     * @return the movieList MovieStorage object
     */
    public MovieStorage getMovieStorage(){
        return movieList;
    }
    
    /**
     * Facilitates the creation of a movie through a command line interface.
     */
    public void createMovie() {
        Scanner in = new Scanner(System.in);
        String title;
        String genre;
        System.out.println("Enter the name of the movie:");
        title = in.nextLine();
        System.out.println("Enter the genre of the movie:");
        genre = in.nextLine();
        Movie newMovie = new Movie(title, genre);
        movieList.addMovie(newMovie);
        System.out.println(title + " has been added to available movies.");
    }
    
}
