
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Gigi");
        strings.add("Bella");
        strings.add("Dua");
        strings.add("Lana");
        strings.add("Yolanda");
        
        removeLast(strings);
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings){
        int lastIndex = strings.size() - 1;
        
        if(lastIndex < 0){
            return;
        }
        strings.remove(lastIndex);
    }

}
