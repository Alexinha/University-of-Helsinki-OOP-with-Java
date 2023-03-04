
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);
        Money c = a.plus(b);
        System.out.println(c);
        
        a = a.plus(c);
        System.out.println(a);
        
        System.out.println("is a less than b? " + a.lessThan(b));
        
        Money d = new Money(5, 40);
        Money e = new Money(3, 90);
        System.out.println("5.40 - 3.90 results " + d.minus(e));
    }
}
