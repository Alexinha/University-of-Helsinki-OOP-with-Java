
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            // always prompt asking for info
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            
            // when the "first name" is empty, exit the loop
            if(firstName.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            
            // pass in the info above, first into a new object, then pass the object into the arraylist
            PersonalInformation person = new PersonalInformation(firstName, lastName, id); 
            infoCollection.add(person);
        }
        
        // print the info of the persons (default)
//        for(PersonalInformation person: infoCollection){
//            System.out.println(person);

        // print the name of the persons 
        for(int i = 0; i < infoCollection.size(); i++){
            String firstName = infoCollection.get(i).getFirstName();
            String lastName = infoCollection.get(i).getLastName();
            String output = firstName + " " + lastName;
            System.out.println(output);
        }

    }
}
