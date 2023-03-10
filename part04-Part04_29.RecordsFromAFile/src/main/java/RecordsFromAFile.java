
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            // read the CSV format data, separate each line by comma
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                String[] pieces = row.split(",");
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                if(age == 1){
                    System.out.printf("%s, age: %d year%n", name, age);
                }else{
                    System.out.printf("%s, age: %d years%n", name, age);   
                }
            }
            
            
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
