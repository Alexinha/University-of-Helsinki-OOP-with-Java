
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("First number?");
        int start = scanner.nextInt();
        System.out.println("Last number?");
        int stop = scanner.nextInt();
        
        for(int i = start; i <= stop; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
        
    }
}
