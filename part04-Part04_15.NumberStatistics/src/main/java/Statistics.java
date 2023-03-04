
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number){
        this.count = this.count + 1;
        sum = sum + number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        double avg;
        if(count == 0){
            avg = 0;
        }else{
            avg = (double)sum / count;
        }
        return avg;
    }
}
