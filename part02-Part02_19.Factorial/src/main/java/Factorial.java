
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        
        System.out.println("Give a number: ");
        int num = scanner.nextInt();
        
//        if(num == 0){
//            factorial = 1;
//        }
        
        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial: " + factorial);
        

    }
//    public static int factorial(int n){
//        
//        if(n == 0){
//            return 1;
//        }
//        
//        return n * factorial(n-1);
//
//    }
}
