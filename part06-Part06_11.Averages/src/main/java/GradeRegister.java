
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    // returns the average of the grades, if the register contains no grades, 
    // the method should return -1
    public double averageOfGrades(){
        int totalGradesInput = grades.size();
        int sum = 0;
        
        if(totalGradesInput == 0){
            return -1;
        }

        for(int grade: grades){
            sum += grade;
        }
        
        return (double)sum / totalGradesInput;       
    }
    
    // calculates and returns the average of the exam points
    // if there are no points added to the register, the method returns -1
    public double averageOfPoints(){
        int sum = 0;
        int totalPointsInput = this.points.size();
        
        if(totalPointsInput == 0){
            return -1;
        }
        
        for(int point: points){
            sum += point;
        }
        
        return (double)sum / totalPointsInput;
    }
    
}
