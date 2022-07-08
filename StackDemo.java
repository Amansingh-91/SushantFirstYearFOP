import java.util.LinkedList;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
//        LinkedList a = new LinkedList();
//        a.add("aman");
//        a.add(1);
//        a.add(12.5);
//        System.out.println(a);
        Stack<Integer> obj = new Stack<>();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj);
        System.out.println(obj.pop());
        System.out.println(obj);
    }
}
