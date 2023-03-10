import java.util.ArrayList;
/**
 * This class contains gifts
 * In this class, gifts can be added and it keeps track of the total weight of the 
 * gifts in the package
 * The items will be stored in an ArrayList object
 * @author alexchang
 */
public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    // parameterless constructor
    public Package(){
        
    }
    
    // method to add gift
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    // method to keep track of the total weight
    public int totalWeight(){
        int totalWeight = 0;
        for(Gift gift: gifts){
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
    
}
