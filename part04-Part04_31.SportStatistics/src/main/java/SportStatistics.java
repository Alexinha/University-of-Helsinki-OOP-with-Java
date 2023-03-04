
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // asking for filename
        System.out.println("File: ");
        String file = scan.nextLine();
        
        // ask for the team
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        // read the file
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            int count = 0;
            int win = 0;
            
            // count the games of the target team
            while(fileScan.hasNextLine()){
                String line = fileScan.nextLine();
                String[] pieces = line.split(",");
                int homeScore = Integer.valueOf(pieces[2]);
                int guestScore = Integer.valueOf(pieces[3]);
                if(pieces[0].equals(team)){
                    count++;
                    if(homeScore > guestScore){
                        win++;
                    }
                    
                }else if(pieces[1].equals(team)){
                    count++;
                    if(homeScore < guestScore){
                        win++;
                    }
                    
                }
                
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + (count - win));
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
