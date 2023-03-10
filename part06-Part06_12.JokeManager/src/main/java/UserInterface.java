import java.util.Scanner;
/**
 *
 * @author alexchang
 */
public class UserInterface {
    
    private Scanner scanner = new Scanner(System.in);
    private JokeManager list = new JokeManager();
    
    // constructor 
    public UserInterface(JokeManager list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    // start the user interface
    public void start(){
        
        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
        
            if (command.equals("1")) {
                
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                list.addJoke(joke);
            } else if (command.equals("2")) {
                
                System.out.println("Drawing a joke.");                
                System.out.println(list.drawJoke());
            } else if (command.equals("3")) {
                
                System.out.println("Printing the jokes.");
                list.printJokes();
        
            }
        }
    }
    
}
