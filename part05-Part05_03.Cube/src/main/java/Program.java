
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube cube = new Cube(7);
        System.out.println(cube.volume());
        System.out.println(cube.toString());
        
        Cube c = new Cube(3);
        System.out.println(c.volume());
        System.out.println(c.toString());
    }
}
