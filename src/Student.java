import java.util.ArrayList;
import java.util.List;

public class Student extends Personal{
    private static int id = 1;
    private final int studentID;
    private List<Integer> grades;

    public Student(){
        super();
        this.studentID = id++;
        this.grades = new ArrayList<>();
    }

    public Student (String name, String surname, int age, boolean gender){
        super(name, surname, age, gender);
        this.studentID = id++;
        this.grades = new ArrayList<>();
    }

    public Student (String name, String surname, int age, boolean gender, int studentID){
        super(name, surname, age, gender);
        this.studentID = id++;
        this.grades = new ArrayList<>();
    }

    public Student (String name, String surname, int age, boolean gender, List<Integer> grades){
        super(name, surname, age, gender);
        this.studentID = id++;
        this.grades = grades;
    }


    public List<Integer> getGrades() {
        return grades;
    }

    public int getStudentID() {
        return studentID;
    }

    public String toString() {
        return super.toString() + " I'm a student with ID :"+ studentID;
    }

    public int calculateGPA() {
        int sum = 0, count = 0;
        for(int grade : grades){
            sum += grade;
            count += 1;
        }

        return sum / count;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}
