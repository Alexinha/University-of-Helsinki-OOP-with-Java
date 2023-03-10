
import java.util.Scanner;
/**
 * THis class represents a UI that asks for user's command and gives responds to 
 * their command. It either asks for new command, end the program, or add words into 
 * dictionary or search the traslation in the dictioanry. 
 * it takes two objects Scanner and SimpleDictionary as parameters in its constructor.
 * @author alexchang
 */
public class TextUI {
    
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary = new SimpleDictionary();
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        
        while(true){
            // asks user for command
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            // if command is end, prints bye bye and end the program
            if(input.equalsIgnoreCase("end")){
                System.out.println("Bye bye!");
                return;
            }else if(input.equalsIgnoreCase("add")){
                // if the command is add, asks user for a word and a translation
                // after this the words are stored in the dictionary, and the method 
                // continued by asking for a new command
                System.out.println("Word: ");
                String word = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
            }else if(input.equalsIgnoreCase("search")){
                // if the command is search, asks the user for the word to be translated 
                // after this it prints the translation of the word and then back to 
                // step one
                System.out.println("To be translated: ");
                String search = scanner.nextLine();
                
                // if word isnt found 
                String result = dictionary.translate(search);
                if(result == null){
                    System.out.println("Word " + search + " was not found");
                }else{
                    System.out.println("Translation: " + result);               
                }               
            }else{
                // otherwise prints "Unknown command" and goes back to step one 
                System.out.println("Unknown command");              
            }                       
        }      
    }
    
 
}
