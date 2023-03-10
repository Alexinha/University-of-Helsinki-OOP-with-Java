import java.util.ArrayList;
/**
 * This class has a parameterless constructor and contains a list of Message objects as well as 
 * two worker methods 
 * @author alexchang
 */
public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService(){
        this.messages = new ArrayList<>();
    }
    
    // adds a message passed as a parameter to the messaging service as long as the 
    // message content is at most 280 characters long
    public void add(Message message){
        if(message.getContent().length() <= 280){
            this.messages.add(message);
        }
    }
    
    // returns the messages added to the messaging service
    public ArrayList<Message> getMessages(){
        ArrayList<Message> addedOnes = new ArrayList<>();
//        for(Message message: this.messages){
//            addedOnes.add(message);
//        }
//        return addedOnes;
        return messages;
    }
    
    
    
}
