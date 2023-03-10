
/**
 * 
 * @author alexchang
 */
public class Gift {
    
    private String name;
    private int weight;
    
    // constructor for gift as a general type
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    // getters
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    // toString method
    public String toString(){
        String info = String.format("%s (%d kg)", this.name, this.weight);
        return info;
    }
    
    // worker methods
    
}
