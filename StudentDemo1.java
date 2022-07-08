import java.util.Comparator;

public class StudentDemo1 implements Comparator<StudentDemo> {

    public int compare(StudentDemo o1,StudentDemo o2) {
        if(o1.cgpa > o2.cgpa){
            return -1;
        }
        else if(o1.cgpa < o2.cgpa )
            return 1;
        return 0;
    }
}
