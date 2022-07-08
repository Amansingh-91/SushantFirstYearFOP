import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.add(0,4);
        System.out.println(ll);
//        ll.remove(3);
        for (Integer i:ll) {

            if(i == 2){
                ll.remove(i);
            }
        }
        System.out.println(ll);
        ArrayList<String> l1 = new ArrayList<>();

    }
}
