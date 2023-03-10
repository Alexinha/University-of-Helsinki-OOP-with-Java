
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String output = "The collection " + name + " has " + elements.size() + " elements:\n";
        String list = "";
        
        if(elements.size() == 0){
            return "The collection " + name + " is empty.";
        }
        if(elements.size() == 1){
            output = "The collection " + name +" has 1 element:\n";
        }
        
        for(int i = 0; i < elements.size() - 1; i++){
            list = list + elements.get(i) + "\n";
        }
             
        return output + list + elements.get(elements.size() - 1);
    }
    
}
