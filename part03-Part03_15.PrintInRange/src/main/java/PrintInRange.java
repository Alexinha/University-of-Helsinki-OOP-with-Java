
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(14);
        numbers.add(55);
        
        printNumbersInRange(numbers, 0, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        
        System.out.printf("The numbers in the range [%d, %d]%n", lowerLimit, upperLimit);
        for(int number: numbers){
            if(number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }

    }
    
}

