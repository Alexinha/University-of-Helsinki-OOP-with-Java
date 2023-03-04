
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0;
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if(value < 5000){
            tax = 0;
        }else if(value < 25000){
            tax = (value - 5000) * 0.08 + 100;
        }else if(value < 55000){
            tax = (value - 25000) * 0.1 + 1700;
        }else if(value < 200000){
            tax = (value - 55000) * 0.12 + 4700;
        }else if(value < 1000000){
            tax = (value - 200000) * 0.15 + 22100;
        }else {
            tax = (value - 1000000) * 0.17 + 142100; 
        }
        
        if(tax == 0){
            System.out.println("No tax!");
        }else{
            System.out.println("Tax: " + tax);
        }
    }
}
