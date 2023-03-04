
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    // returns a new money object that is worth the total amount of the object whose method was called 
    // and the object that is received as the parameter
    public Money plus(Money addition){
        Money money = new Money(euros, cents);
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if(newCents > 99){
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    // returns true if the money-object on which the method is called on has a lesser value than the one given as a parameter
    public boolean lessThan(Money compared){
        Money money = new Money(euros, cents);
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    // returns a new money object worth the difference of the object whose method was called
    // and the object received as parameter 
    // if the difference would be negative, the worth of the created money object is set to 0
    public Money minus(Money decreaser){
        Money money = new Money(euros, cents);

        if(money.lessThan(decreaser)){
           Money newMoney = new Money(0, 0);
           return newMoney;
        }
        
        int newEuros = this.euros - decreaser.euros;
        int newCents = 0;
        
        if(this.cents < decreaser.cents){
            newCents = 100 - decreaser.cents + this.cents; 
            newEuros -= 1;
        }else{
            newCents = this.cents - decreaser.cents;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;      
    }
}
