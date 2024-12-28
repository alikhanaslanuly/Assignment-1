import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Personal> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public School(List<Personal> members){
        this.members = members;
    }

    public List<Personal> getMembers(){
        return members;
    }

    public void addMember(Personal personal){
        this.members.add(personal);
    }

    public String toString(){
        return members.toString();
    }

}
