/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 * This class is used to add people and order them according to their height - 
 * taking a person out of the room always returns the shortest person
 * It contains a list of persons as instance variable, and has a parameterless 
 * constructor, as well as worker methods 
 * @author alexchang
 */
public class Room {
    
    private ArrayList<Person> persons = new ArrayList<>();
    
    public Room(){
        
    }
    
    // add person to the list
    public void add(Person person){
        this.persons.add(person);
    }
    
    // returns a boolean-type value that tells whether or not the room is empty
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    // returns a list of the persons in the room
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    // returns the shortest person added to the room
    // if room is empty, a null reference is returned 
    // this method should not remove a person from the room
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortest = this.persons.get(0);
        for(Person person: this.persons){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    // takes the shortest person in the room
    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
    
}
