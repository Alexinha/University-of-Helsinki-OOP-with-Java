
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        // reading
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double avg;
        int even = 0;
        int odd = 0;
        
        while(true){        
            int num = Integer.valueOf(scanner.nextLine());
        
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum = sum + num;
            count++;
            
            // validate even or odd
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
            
        }
        // calculate average
        avg = (double)sum / count;
        
        // output
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}