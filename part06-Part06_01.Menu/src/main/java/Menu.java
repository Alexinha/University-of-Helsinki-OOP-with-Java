
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // method adds a new meal to the meals list, if the meal is already on the list, no need to add again
    // use contains() to check if an item is already on the list
    public void addMeal(String meal){
        if(meals.contains(meal)){
            return;
        }
        meals.add(meal);
    }
    
    // prints the meals
    public void printMeals(){
        for(String meal: this.meals){
            System.out.println(meal);
        }
    }
    
    // clears the menu
    public void clearMenu(){
        meals.clear();
    }
}
