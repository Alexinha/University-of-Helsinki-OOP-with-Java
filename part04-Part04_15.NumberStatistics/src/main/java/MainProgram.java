
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        // get the user input and do things
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input != -1){
                statistics.addNumber(input);  
                // to sum up only even numbers 
                if(input % 2 == 0){
                    even.addNumber(input);
                }else{
                    odd.addNumber(input);
                }
            }else{
                break;
            }
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
    }
}
