
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("hi");
        System.out.println(s.values());
        s.add("hello");
        s.add("World");
        System.out.println(s.values());
        s.take();
        System.out.println(s.values());
        System.out.println(s.itSelf());
    }
}
