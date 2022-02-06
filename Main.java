import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();
        while (true) {
            System.out.println("Choose request you want to implement:");
            System.out.println("Enter 1: To add student to the list.");
            System.out.println("Enter 2: To search student by age.");
            System.out.println("Enter 3: To search student by age and home town.");
            System.out.println("Enter 4: To exit program.");
            System.out.println("Choose: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":{
                    System.out.println("-----------------------Enter information of student----------------------");
                    System.out.print("Enter name: "); String name = scanner.nextLine();
                    System.out.print("Enter age: "); int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter class: "); String class_ = scanner.nextLine();
                    System.out.print("Enter home town: "); String homeTown = scanner.nextLine();
                    Student student = new Student(name, age, homeTown, class_);
                    System.out.println(student.toString());
                    manageStudent.addStudent(student);
                    break;
                }
                
                case "2":{
                    System.out.println("------------------search student by age-------------------");
                    System.out.print("Enter age you want to search: "); int age = scanner.nextInt();
                    List<Student> students = manageStudent.searchStudentByAge(age);
                    if(students.size() > 0){
                        students.stream().forEach(System.out::println);
                    }
                    else {
                        System.out.println("There are no students at this age.");
                    }
                    break;
                }
                
                case "3":{
                    System.out.println("------------------search student by age and home town-------------------");
                    System.out.println("Enter age: "); int age = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Enter home town: "); String homeTown = scanner.nextLine();
                    List<Student> students = manageStudent.searchStudentByAgeAndHomeTown(age, homeTown);
                    if(students.size()> 0){
                        students.stream().forEach(System.out::println);
                    } else {
                        System.out.println("There are no students at this age and home town.");
                    }
                    break;
                }
                case "4":{
                    return;
                }
                default :
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
