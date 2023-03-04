
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // read the file
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            int count = 0;
            while(fileScan.hasNextInt()){
                int num = fileScan.nextInt();
                if(num >= lowerBound && num <= upperBound){
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
