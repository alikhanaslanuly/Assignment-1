public class Teacher extends Personal {
    private String subject;
    private int yearOfExperience;
    private int salary;

    public Teacher(){
        super();
    }

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearOfExperience, int salary){
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearOfExperience = yearOfExperience;
        this.salary = salary;
    }

    public String getSubject(){
        return subject;
    }

    public int getSalary(){
        return salary;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience){
        this.yearOfExperience = yearOfExperience;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "I teach %s".formatted(subject);
    }

    public void giveRaise(float percentage){
        salary += (int) (salary * (percentage / 100));
    }
}
