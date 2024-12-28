public class Personal  {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Personal(){

    }

    public Personal(String name, String surname, int age, boolean gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public Boolean getGender(){
        return gender;
    }

    public void setGender(){
        this.gender = gender;
    }

    public String toString() {
        return ("Hi, I'm %s %ss, a %d years old. Gender is %s").formatted(name, surname, age, gender ? "male" : "female") + "\n";
    }
}

