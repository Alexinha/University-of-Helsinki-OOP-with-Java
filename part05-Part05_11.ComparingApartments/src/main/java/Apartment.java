
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    // worker method compairing sizes
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    // worker method comparing price difference, generates absolute value of the difference
    public int priceDifference(Apartment compared){
        int dif = Math.abs((this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares));
        return dif;
    }
    
    // worker method compared if it's more expensive 
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare * this.squares > compared.squares * compared.princePerSquare){
            return true;
        }
        return false;
    }

}
