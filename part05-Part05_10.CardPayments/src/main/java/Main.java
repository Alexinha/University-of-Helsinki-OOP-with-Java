
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard petesCard = new PaymentCard(10);
        
        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        
        wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        
        petesCard.addMoney(10);
        System.out.println("money " + petesCard.balance());
        
        
        PaymentTerminal cafe = new PaymentTerminal();
//        double change = cafe.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//        
//        change = cafe.eatAffordably(5);
//        System.out.println("remaining change: " + change);
//        
//        change = cafe.eatHeartily(4.3);
//        System.out.println("ramaining change: " + change);
//        
//        System.out.println(cafe);
//        
        PaymentCard annesCard = new PaymentCard(7);
        
        wasSuccessful = cafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = cafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = cafe.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        
        cafe.addMoneyToCard(annesCard, 100);
        cafe.addMoneyToCard(annesCard, -19);
        System.out.println("amount of money on the card is: " + annesCard.balance() + " euros");
//        
//        System.out.println(cafe);
        
        
        
        
    }
}

