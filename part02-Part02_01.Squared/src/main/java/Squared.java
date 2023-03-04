
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int square = num * num;
//        double square = Math.pow(num, 2);
        System.out.println(square);

    }
}
