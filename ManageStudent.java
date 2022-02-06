import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageStudent {
    private List<Student> students;

    public ManageStudent(){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> searchStudentByAge(int age){
        return this.students.stream().filter(o -> o.getAge() == age).collect(Collectors.toList());
    }

    public List<Student> searchStudentByAgeAndHomeTown(int age, String homeTown){
        return this.students.stream().filter(o -> o.getAge() == age && o.getHomeTown().equals(homeTown)).collect(Collectors.toList());
    }
}
