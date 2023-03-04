/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item newItem = (Item) compared;
        if(this.identifier.equals(newItem.identifier)){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        String info = this.identifier + ": " + this.name;
        return info;
    }
    
}
