import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//        PriorityQueue<Integer> myint =  new PriorityQueue<>();
//        myint.add(10);
//        myint.add(2);
//        myint.add(1);
//        myint.add(5);
//        for (int i = 0; i < 4; i++) {
//            System.out.println(myint.poll());
//        }
//        PriorityQueue<String> myNames =  new PriorityQueue<>();
//        myNames.add("Anna");
//        myNames.add("zod");
//        myNames.add("jack");
//        myNames.add("zayd");
//        myNames.add("aman");
//        System.out.println(myNames.size());
//        int x =myNames.size();
//        for (int i = 0; i < x; i++) {
//            System.out.println(myNames.poll());
//        }

        PriorityQueue<StudentDemo> myStudents =  new PriorityQueue<>(5,new StudentDemo1());
        myStudents.add(new StudentDemo("Aman",5.6));
        myStudents.add(new StudentDemo("Divya",1.6));
        myStudents.add(new StudentDemo("Dharam",5.5));
        for (int i  =0; i <3 ;i++){
            System.out.println(myStudents.poll());
        }


    }
}
