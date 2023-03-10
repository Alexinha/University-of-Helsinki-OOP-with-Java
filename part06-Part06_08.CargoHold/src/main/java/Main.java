
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the Rings", 2);
        Item phone = new Item("Nokia", 1);
        Item brick = new Item("brick", 4);
        
        
        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);
        
        suitcase.addItem(book);
        System.out.println(suitcase);
        suitcase.addItem(phone);
        System.out.println(suitcase);
        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        System.out.println("The suitcase contains the following items: ");
        suitcase.printItems();
        System.out.println("Total Weight: " + suitcase.totalWeight() + " kg");
        System.out.println("Heaviest: " + suitcase.heaviestItem());
        
        Suitcase suitcase2 = new Suitcase(12);
        suitcase2.addItem(brick);
        
        Hold hold = new Hold(30);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        System.out.println(hold);
        System.out.println("The hold contains the following items: ");
        hold.printItems();
        
    }

}
