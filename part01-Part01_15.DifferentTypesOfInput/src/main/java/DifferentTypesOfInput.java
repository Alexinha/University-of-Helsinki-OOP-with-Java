
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String input1 = scan.nextLine();
        System.out.println("Give an integer: ");
        int input2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double input3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean input4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + input1);
        System.out.println("You gave the integer " + input2);
        System.out.println("You gave the double " + input3);
        System.out.println("You gave the boolean " + input4);

    }
}
