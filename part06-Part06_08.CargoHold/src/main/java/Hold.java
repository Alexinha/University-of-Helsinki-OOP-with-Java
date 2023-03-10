import java.util.ArrayList;
/**
 * This class holds suitcases
 * @author alexchang
 */
public class Hold {
    
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;
    
    // constructor that is given the maximum weight
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int currentWeight = 0;
        for(Suitcase s: this.suitcases){
            currentWeight += s.totalWeight();
        }
        return currentWeight;
    }
    
    // add suitcases to the hold
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = this.totalWeight();
        if((currentWeight + suitcase.totalWeight()) <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    // prints all items contained in the hold's suitcases
    public void printItems(){
        for(Suitcase suitcase: this.suitcases){
            suitcase.printItems();
        }
    }
    
    public String toString(){
        String info = "";
        info = String.format("%d suitcases (%d kg)", this.suitcases.size(), this.totalWeight());
        
        return info;
    }
    
}
