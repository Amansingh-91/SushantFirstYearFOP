import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class College {
    LinkedList<Student> students ;
    College(){
        students = new LinkedList<>();
    }
    public void AddStudent(String name){
        Student obj = new Student(name);
        this.students.add(obj);
    }
    public String toString(){
        LinkedList<String> names = new LinkedList<>();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            names.add(it.next().Name);
        }
        return names.toString();
    }
}
