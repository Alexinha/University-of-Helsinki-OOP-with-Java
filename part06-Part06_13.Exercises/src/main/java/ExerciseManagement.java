import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for(Exercise exercise: exercises){
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise){
        Exercise added = new Exercise(exercise);
        this.exercises.add(added);
    }
    
    public void markAsCompleted(String exercise){
        for(Exercise e: exercises){
            if(e.getName().equals(exercise)){
                e.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise){
        for(Exercise e: exercises){
            if(e.getName().equals(exercise)){
                return e.isCompleted();
            }
        }
        
        return false;
        
    }

}
