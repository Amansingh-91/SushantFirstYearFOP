import java.util.LinkedList;

public class Student {
    LinkedList<String> courses;
    String Name;
    Student(String Name){
        this.Name = Name;
        courses = new LinkedList<>();
    }
    public void addCourse(String course){
        this.courses.add(course);
    }
}
