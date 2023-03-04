
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    // assume each month has 30 days, implement a method that moves the date by one day
    public void advance(){
        if(this.day == 30 && this.month == 12){ // if it's already December 30th, the year changes, month goes back to Jan, day goes back to 1
            this.year = this.year + 1;
            this.month = 1;
            this.day = 1;
        }else if(this.day == 30){   // if it's 30th of any month but December, year doesnt change but day and month changes by 1
            this.month += 1;
            this.day = 1;
        }else{  // if it's a day that's not 30th, only day changes by 1
            this.day += 1;
        }        
    }
    
    
    
    // advance specific number of days
    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++){
            advance();
        }
    }
    
    // creates a new SimpleDate object whose date is the specified number of days greater than the object that the method was called on
    // old date object must remain unchanged
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }   
}
