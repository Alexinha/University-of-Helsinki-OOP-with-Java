
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        
        int sum = sum(numbers);
        
        System.out.println(sum);
        
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            sum = sum + number;
        }
        return sum;
    }

}
