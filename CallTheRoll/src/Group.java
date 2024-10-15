import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Group {
    String groupName;
    List<Student> students = new ArrayList<>();
    public Group(String groupName){
        this.groupName = groupName;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public Student getRandomStudent(){
        if(students.isEmpty()){
            return null;
        }
        Random rand = new Random();
        int index = rand.nextInt(students.size());
        return students.get(index);
    }
}
