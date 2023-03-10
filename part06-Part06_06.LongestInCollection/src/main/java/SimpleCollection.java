
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
    
    // returns the longest string of the collection 
    // if the collection is empty, the method returns a null reference
    public String longest(){
        if (elements.isEmpty()){
            return null;
        }
        
        String longest = elements.get(0); // assign the first element's reference to longest.
        
        // compare longest to the rest elements one by one, and replace longest 
        // with whichever longer in the comparison
        for(String element: elements){
            if(longest.length() < element.length()){
                longest = element;
            }
        }
        
        return longest;
    }

}
