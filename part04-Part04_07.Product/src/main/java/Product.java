/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Product {
    
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQuantity;
    }
 
    public void printProduct(){
        String info = String.format("%s, price %.1f, %d pcs", this.name, this.price, this.quantity);
        System.out.println(info);
    }
}
