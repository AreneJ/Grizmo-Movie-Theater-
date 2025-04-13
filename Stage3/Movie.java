

/**
 *
 * @author Gandhi
 */
public class Movie {
    private String title;
    private String genre;
    private boolean isPlaying = false;
    
    public Movie(String title, String genre)
    {
        //Constructor for movie assigns provided values to store in movie object
        this.title = title;
        this.genre = genre;
    }
    
    public String getTitle(){
        
        //This method returns the stored title String
        return title;
        
    }
    public String getGenre(){
        
        //This method returns the stored Genre string
        return genre;
        
    }
  
    public boolean checkPlaying()
    {
        /*
        This method returns if the movies is playing as a 
        */
        return isPlaying;
        
    }
    
    public void changePlaying()
    {
        /*
        This method changes the movie's playing status from either false to true or true to false
        
        */
        
         isPlaying = (!isPlaying);
       
    }
}
