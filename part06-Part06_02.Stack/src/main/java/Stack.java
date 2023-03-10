import java.util.ArrayList;
/**
 * Stack is a class that has a list of strings as an instance variable 
 * 
 * @author alexchang
 */
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    // returns a boolean type value that tells whether or not the stack is empty
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    // adds the value given as a parameter to the top of the stack
    public void add(String value){
        stack.add(0, value);
    }
    
    // returns the values contained in the stack as a list
    public ArrayList<String> values(){
        ArrayList<String> list = new ArrayList<>();
        for(String string: this.stack){
            list.add(string);
        }
        return list;
    }
    
    // returns the topmost value and removes it from the stack
    public String take(){
        String string = stack.get(0);
        stack.remove(0);
        return string;
    }
    
    public ArrayList<String> itSelf(){
        return stack;
    }
    
}
