
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        
//        list.add("read");
//        list.add("eat");
//        list.add("sleep");
//        
//        System.out.println();
//        list.print();
//        
//        System.out.println("");
//        list.remove(1);
//        list.print();

    }
}
