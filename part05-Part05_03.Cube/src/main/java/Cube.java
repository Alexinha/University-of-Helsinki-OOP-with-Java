/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Cube {
    
    private int edgeLength;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        int volume = (int)Math.pow(edgeLength, 3);
        return volume;
    }
    
    @Override
    public String toString(){
        String info = String.format("The length of the edge is %d and the volume %d", edgeLength, volume());
        return info;
    }
}
