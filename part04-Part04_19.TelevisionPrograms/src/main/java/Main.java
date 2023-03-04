import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // prompt asking for info of the tv show
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            // when the name is empty, program exists
            if(name.equals("")){
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            // pass in the info into a new object and then to the arraylist
            TelevisionProgram program = new TelevisionProgram(name, duration);
            programs.add(program);
            
            
        }
        
        // after reading in all the info, asking the user to set a max duration as a filter
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        // filter the arrayList
        for(int i = 0; i < programs.size(); i++){
            if(programs.get(i).getDuration() <= maxDuration){
                System.out.println(programs.get(i).toString());
            }
        }
    }
}
