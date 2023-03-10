
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Empty? " + room.isEmpty());
        
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        
        System.out.println("Empty? " + room.isEmpty());
        System.out.println("");
        for(Person person: room.getPersons()){
            System.out.println(person);
        }
        
//        System.out.println("Shortest: " + room.take());
//        for(Person person: room.getPersons()){
//            System.out.println(person);
//        }
        
        System.out.println("");
        
        // print the persons in height order
        while(!room.isEmpty()){
            System.out.println(room.take());
        }
        
    }
}
