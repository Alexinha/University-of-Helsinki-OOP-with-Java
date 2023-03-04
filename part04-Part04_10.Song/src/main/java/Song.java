/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Song {
    // instance variables
    private String name;
    private int length;
    
    // constructor
    public Song(String name, int length){
        this.length = length;
        this.name = name;
    }
    
    // worker methods
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
    
}
