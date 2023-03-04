/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Debt {
    // instance variables
    private double balance;
    private double interestRate;
    
    // constructor
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    // worker method
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
    
}
