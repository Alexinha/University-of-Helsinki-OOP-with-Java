import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        // create new arrayList of Book objects
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            // prompt asking for info 
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            // if title is empty, break the loop
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            // pass in the data to the object and then arrayList
            Book book = new Book(title, page, publicationYear);
            books.add(book);
      
        }
        // ask the user to give a info filter
        System.out.println("What information will be printed? ");
        String filter = scanner.nextLine();
        // if the filter is "everything", then print everything; if its "name", only print names 
        if(filter.equalsIgnoreCase("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }
        if(filter.equalsIgnoreCase("name")){
            for(int i = 0; i < books.size(); i++){
                String name = books.get(i).getName();
                System.out.println(name);
            }
        }

    }
}
