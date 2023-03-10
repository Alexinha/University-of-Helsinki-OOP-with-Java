/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 * Has items and a maximum weight that determines the maximum total weight of the items
 * @author alexchang
 */
public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    //adds item to the suitcase
    public void addItem(Item item){
        // dont add item when the maxWeight is exceeded
        int currentWeight = 0;
        for(Item i: this.items){
            currentWeight += i.getWeight();
        }
        if((item.getWeight() + currentWeight) <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    // returns the totalWeight of the items
    public int totalWeight(){
        
        int totalWeight = 0;
        for(Item item: this.items){          
            totalWeight += item.getWeight();      
        }
        
        return totalWeight;
        
    }
    
    // returns the largest item based on weight
    // if several items share the heaviest weight, method can return any of them
    // if the suitcase is empty, returns null
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;      
    }
    
    public String toString(){
        
        String info = "";
        int totalWeight = this.totalWeight();
        
        if(totalWeight == 0){
            info = "no items (0 kg)";
        }else if(this.items.size() == 1){
            info = "1 item (" + totalWeight + " kg)";
        }else{
            info = String.format("%d items (%d kg)", this.items.size(), totalWeight);
        }
        
        return info;
    }
    
    // prints all the items in the suitcase
    public void printItems(){
        
        for(Item item: this.items){
            System.out.println(item);
        }
        
    }
    
    
}
