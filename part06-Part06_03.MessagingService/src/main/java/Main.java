
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService m = new MessagingService();
        System.out.println(m.getMessages());
        Message first = new Message("alex", "hello how r u");
        Message second = new Message("Nickie", "lets go out");
        m.add(first);
        m.add(second);
        System.out.println(m.getMessages());
    }
}
