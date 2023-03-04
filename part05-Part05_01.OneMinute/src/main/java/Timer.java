/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Timer {
    
    private ClockHand hundredthSecond;
    private ClockHand second;
    
    public Timer(){
        this.hundredthSecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public void advance(){
        this.hundredthSecond.advance();
        if(this.hundredthSecond.value() == 0){
            this.second.advance();
        }
    }
    
    public String toString(){
        String info = second + ":" + hundredthSecond;
        return info;
    }
}
