
/**
 * In this class, objects can be instantiated to represent different items.
 * The information to store is the name and weight of the item (kg).
 * @author alexchang
 */
public class Item {
    
    private String name;
    private int weight;
    
    // constructor
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    // getters and toString
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        String info = String.format("%s (%d kg)", this.name, this.weight);
        return info;
    }
    
    
    
}
