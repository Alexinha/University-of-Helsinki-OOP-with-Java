
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            Boolean found = false;
            
            // go over all the lines in the file to find match
            while(fileScan.hasNextLine()){
                String name = fileScan.nextLine();
                if(name.equals(searchedFor)){
                    found = true;
                    break;
                }
            }
            
            if(found){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
