
public class HealthStation {
    private int weighings;
    
    public HealthStation(){
        
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

    // increase the weight of the parameter person by one
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    
    // tells how many weighings the health station has performed 
    public int weighings(){
        return weighings;
    }
}
