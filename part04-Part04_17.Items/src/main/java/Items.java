
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // reading in until meets empty input
        while(true){
            // prompt aksing for name
            System.out.println("Name: ");
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            // create a new item in items with the input name
            Item newItem = new Item(input);
            items.add(newItem);
            
        }
        
        // having read all the names, print all the items by using toString()
        for(int i = 0; i < items.size(); i++){
            String info = items.get(i).toString();
            System.out.println(info);
        }
    }
}
