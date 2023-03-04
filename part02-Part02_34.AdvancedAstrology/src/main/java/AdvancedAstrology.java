
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        // size is the height of the right-leaing triangle 
        // height
        for(int i = 0; i < size; i++){
            // each row is made up by (i + 1) of stars and (size - (i + 1)) of spaces
            // space comes first  
            // print space
            printSpaces(size - i - 1);
           // print starts
            printStars(i+1);
        }
    }

    // method that prints the base of a christmas tree, which is a 3 * 2 rectangle
    public static void treeTrunk(){
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    public static void christmasTree(int height) {
        // part 3 of the exercise
        // tree made of space + stars, space = height - row, star = row * 2 - 1;
        // tree trunk made of space + 3 stars, height = 2. space = last row -  2 = height - 2
        
        // print height
        for(int i = 0; i < height; i++){
            int row = i + 1;
            //print space
            printSpaces(height - row);
            //print stars
            printStars(row * 2 -1);
        }
        // print tree trunk
        for(int i = 0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
        }  
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(40);
    }
}
