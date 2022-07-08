import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        College clg = new College();
        Scanner sc= new Scanner(System.in);
        clg.AddStudent("aman");
        clg.AddStudent("divya");
        clg.AddStudent("dharam");
        clg.AddStudent("jack");
        clg.AddStudent("joy");

        for (Student s:clg.students) {
            System.out.println(s.Name);
            System.out.println("enter the number of courses you want to enter");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String course = sc.nextLine();

                s.addCourse(course);
            }

        }
        Iterator<Student> it = clg.students.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.Name);
            System.out.println(s.courses);
        }
        System.out.println(clg);
    }
}
