
import java.util.ArrayList;
/**
 * This class takes care of the functionality of managing jokes 
 * @author alexchang
 */
public class JokeManager {
    
    private ArrayList<String> list = new ArrayList<>();
    
    // constructor
    public JokeManager(){
        
    }
    
    // adds a joke to the manager
    public void addJoke(String joke){
        list.add(joke);
    }
       
    // choose one joke at random and returns it 
    // if no joke stored in the joke manager, returns the string "jokes are in short supply"
    public String drawJoke(){
        
        int totalJokes = list.size();
        
        if(totalJokes == 0){
            return "Jokes are in short supply.";
        }
        
        // generate a random number between 0 and (totalJokes - 1)
        int random = (int)(Math.random() * totalJokes);
        
        return list.get(random);
    
    }
       
    // prints all the jokes stored in joke manager
    public void printJokes(){
        for(String joke: list){
            System.out.println(joke);
        }
    }
    
}
