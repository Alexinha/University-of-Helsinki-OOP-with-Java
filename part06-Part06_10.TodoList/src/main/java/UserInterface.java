
import java.util.Scanner;
/**
 * This class represents the user interface for the to-do list 
 * @author alexchang
 */
public class UserInterface {
    
    private Scanner scanner = new Scanner(System.in);
    private TodoList list = new TodoList();
    
    
    // parameterized constructor
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    // start the text user interface 
    // the text UI works with an eternal looping statement while-true, and it must 
    // offer the following command to the user: stop, add, list, remove
    public void start(){
        
        while(true){
            
            //prompt for user input
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            // decide which command it is 
            if(input.equalsIgnoreCase("stop")){
                return;
            }else if(input.equalsIgnoreCase("add")){
                System.out.println("To add: ");
                String addedItem = scanner.nextLine();
                this.list.add(addedItem);
            }else if(input.equalsIgnoreCase("list")){
                this.list.print();
            }else if(input.equalsIgnoreCase("remove")){
                System.out.println("Which one is removed? ");
                int removedIndex = Integer.valueOf(scanner.nextLine());              
                this.list.remove(removedIndex);
                
            }else{
                System.out.println("Invalid input");
                
            }
        }
        
    }
    
    
    
}
