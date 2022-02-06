import java.util.List;
import java.util.stream.Collectors;

public class ManageStudent {
    private List<Student> students;



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> searchStudentByAge(int age){
        return this.students.stream().filter(o -> o.getAge() == age).collect(Collectors.toList());
    }

    public List<Student> searchStudentByAgeAndHomeTown(int age, String homeTown){

        return this.students.stream().filter(o -> o.getAge() == age && o.getHomeTown() == homeTown).collect(Collectors.toList());
    }
}
