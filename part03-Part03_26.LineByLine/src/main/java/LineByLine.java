
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextLine = scanner.hasNextLine();
        while(hasNextLine){
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            for(int i = 0; i < pieces.length; i++){
                System.out.println(pieces[i]);
            }
            hasNextLine = scanner.hasNextLine();
        }                                   
    }
}
