public class Student {
    private String name;
    private int age;
    private String homeTown;
    private String class_;

    

    public Student(String name, int age, String homeTown, String class_) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.class_ = class_;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    public String getClass_() {
        return class_;
    }
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    
    @Override
    public String toString() {
        return "information of student[ name: "+ name + ", age: " + age + ", home town: " + homeTown + ", class: " + class_ ;
    }
}
