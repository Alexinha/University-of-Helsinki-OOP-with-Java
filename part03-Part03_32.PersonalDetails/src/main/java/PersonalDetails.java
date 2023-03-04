
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfAge = 0;
        int count = 0;
        String longestName = "";
        int biggestLength = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            int length = pieces[0].length();
            if(length > biggestLength){
                biggestLength = length;
                longestName = pieces[0];
            }
            sumOfAge = sumOfAge + Integer.valueOf(pieces[1]);
            count++;
        }
        
        double avg = (double)sumOfAge / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
        
    }
}
