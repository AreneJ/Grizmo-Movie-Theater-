

/**
 *
 * @author Gandhi
 */
import java.util.ArrayList;
public class MovieStorage {
    private ArrayList<Movie> movies;
    
    public MovieStorage(){
        //Constructor creates and stores new arraylist for storage
        movies = new ArrayList();
    }
    
    public void addMovie(Movie movie){
        //This method adds provided Movie object to Arraylist
        
        movies.add(movie);
    }
    public void removeMovie(Movie movie){
        
        //This method removes a movie from the stored array list
         
        movies.add(movie);
    }
    public void viewMovies()
    {
        //This method creates a printed report on all avaliable movies and their information
        for(Movie mov : movies){
            System.out.println("|| Title: "+mov.getTitle()+ "|| Genre: " + mov.getGenre() +" || Playing? : " + mov.checkPlaying());
        }
    }
    
    public ArrayList<Movie> getMovies(){
        
        /*
        This method returns the stored arraylist
        @Return ArrayList Movies
        */
        
        return movies;
    }
    
    
}
