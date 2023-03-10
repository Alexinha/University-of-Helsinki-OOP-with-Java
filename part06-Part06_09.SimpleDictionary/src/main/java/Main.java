
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI text = new TextUI(scanner, dictionary);
        text.start();
//        System.out.println(dictionary.translate("pike"));
        
        
    }
}
