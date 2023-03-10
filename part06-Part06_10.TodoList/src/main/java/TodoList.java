
import java.util.ArrayList;
/**
 * This class has a parameterless constructor and a few worker methods. 
 * It represents a to-do list. 
 * @author alexchang
 */
public class TodoList {
    
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList(){
        
    }
    
    // add the task passed as parameter to the todo list
    public void add(String task){
        list.add(task);
    }
       
    // print the exercises. Each task has a number associated with it on the print
    // statement -- use the task's index here (+1)
    public void print(){
        
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ": " + list.get(i));
        }
        
    }
       
    // removed the task associated with the given number; the number is the one seen
    // associated with the task in the print
    public void remove(int number){
        list.remove(number - 1);
    }
}
