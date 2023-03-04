/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Counter {
    private int value;
    
    // sets the start value of the counter to startValue
    public Counter(int startValue){
        this.value = startValue;
    }
    
    // sets the start value of the counter to 0
    public Counter(){
        
    }
    
    // worker methods
    // returns the current value of the counter
    public int value(){
        return this.value;
    }
    
    // increases the value by 1
    public void increase(){
        value = value + 1;
    }
    
    // decreases the value by 1
    public void decrease(){
        value = value - 1;
    }
    
    // increases the value of the counter by the value given in the parameter 
    public void increase(int increaseBy){
        if(increaseBy >= 0){
            value = value + increaseBy;
        }
    }
    
    // decreases the value of the counter by the value given 
    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            value = value - decreaseBy;
        }
    }
}
